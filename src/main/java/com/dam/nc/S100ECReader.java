package com.dam.nc;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class S100ECReader 
{	
	static final String S100_FC_SIM_ATR = "S100FC:S100_FC_SimpleAttribute";
	static final String S100_FC_CPX_ATR = "S100FC:S100_FC_ComplexAttribute";
	static final String S100_FC_INF_TYPE = "S100FC:S100_FC_InformationType";
	static final String S100_FC_FT_TYPE = "S100FC:S100_FC_FeatureType";
	static final String S100_FC_ATR_BDG = "S100FC:attributeBinding";
	static final String S100_FC_SUB_ATR_BDG = "S100FC:subAttributeBinding";
	static final String S100_FC_CODE = "S100FC:code";	
	static final String S100_ATR = "S100FC:attribute";
	static final String SIM_ATR_TYP = "S";
	static final String CPX_ATR_TYP = "C";

	Logger log = LoggerFactory.getLogger(getClass().getName());

	public org.w3c.dom.Document readFeatureCatalog(String filePath){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {           
			builder = factory.newDocumentBuilder();
			InputSource source = new InputSource(filePath);
			source.setEncoding(StandardCharsets.UTF_8.displayName());
			return builder.parse(source);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Invalid feature catalouge");
		}
		return null;
	} 

	public NodeList getDocNodes(org.w3c.dom.Document doc){
		doc.getDocumentElement().normalize();		
		return doc.getChildNodes();
	}
	
	public List<NodeList> getChildNodes(NodeList docNodList, String namedNode){
		List<NodeList> nList = new ArrayList<>();
		for (int i = 0; i < docNodList.getLength(); i++){
			NodeList cNodes1 = docNodList.item(i).getChildNodes();
			for (int l = 0; l < cNodes1.getLength(); l++){
				NodeList cNodes2 = cNodes1.item(l).getChildNodes();
				for (int m = 0; m < cNodes2.getLength(); m++){
					if (cNodes2.item(m).getNodeName().equals(namedNode)){
						nList.add(cNodes2.item(m).getChildNodes());															
					}				
				}
			}				
		}
		return nList;
	}	

	public String getNodeName(NodeList nodeList, String namedNode){
		String typeNodeName = null;
		for (int j = 0; j < nodeList.getLength(); j++){
			if (nodeList.item(j).getNodeName().equals(namedNode)){
				typeNodeName = nodeList.item(j).getTextContent();
			}
		}
		return typeNodeName;
	}	

	public JSONObject getNodeAttrs(NodeList nodeList, String namedNode){
		JSONObject arrtributes = new JSONObject();
		for (int j = 0; j < nodeList.getLength(); j++){
			if (nodeList.item(j).getNodeName().equals(namedNode)){
				NodeList cNodes1 = nodeList.item(j).getChildNodes();
				for (int i = 0; i < cNodes1.getLength(); i++){
					if (cNodes1.item(i).getNodeName().equals(S100_ATR)){
						arrtributes.put(cNodes1.item(i).getAttributes().getNamedItem("ref").getNodeValue(), "");
					}					
				}
			}
		}
		return arrtributes;
	}

	public JSONObject createS124Json(org.w3c.dom.Document doc){

		NodeList docNodes = getDocNodes(doc);
		List<NodeList> infoNodes = getChildNodes(docNodes,S100_FC_INF_TYPE);
		List<NodeList> featNodes = getChildNodes(docNodes,S100_FC_FT_TYPE);	
		
		JSONObject json = new JSONObject();
				
		for (NodeList nodeList : infoNodes){
			nodesToJson(docNodes, nodeList, json);
		}
		
		for (NodeList nodeList : featNodes){
			nodesToJson(docNodes, nodeList, json);
		}

		return json;
	}

	public void nodesToJson(NodeList docNodes, NodeList nodeList, JSONObject json){

		String mNodeName = getNodeName(nodeList, S100_FC_CODE);
		JSONObject mNodeAtts = getNodeAttrs(nodeList, S100_FC_ATR_BDG);
		json.put(mNodeName,mNodeAtts);

		if (mNodeAtts.length() > 0){
			List<NodeList> childNodes = getComplexNodes(mNodeAtts, docNodes);
			for (NodeList childNode : childNodes){
				String cNodeName = getNodeName(childNode, S100_FC_CODE);
				JSONObject cNodeAtts = getNodeAttrs(childNode, S100_FC_SUB_ATR_BDG);
				json.getJSONObject(mNodeName).put(cNodeName,cNodeAtts);
			
				if (cNodeAtts.length() > 0){
					List<NodeList> childNodes1 = getComplexNodes(cNodeAtts, docNodes);
					for (NodeList childNode1 : childNodes1) {
						String cNodeName1 = getNodeName(childNode1, S100_FC_CODE);
						JSONObject cNodeAtts1 = getNodeAttrs(childNode1, S100_FC_SUB_ATR_BDG);						
						json.getJSONObject(mNodeName).getJSONObject(cNodeName).put(cNodeName1,cNodeAtts1);
					}						
				}
			}													
		}		
	}	

	public List<NodeList> getComplexNodes(JSONObject atts, NodeList docNodes){	
		
		List<NodeList> chilNodes = new ArrayList<>();			
		JSONArray keys = atts.names();
		for (int i=0; i<keys.length(); i++){
			String type = checkAttrType(docNodes, keys.getString (i));
			if (type.equals("C")){
				List<NodeList> compNode = getChildNodes(docNodes,S100_FC_CPX_ATR);
				for (NodeList nodeList1 : compNode) {
					String cpxNodName = getNodeName(nodeList1, S100_FC_CODE);
					if (cpxNodName.equals(keys.getString (i))){						
						chilNodes.add(nodeList1);
					}												
				}
			}
		}
		return chilNodes;
	}	

	public String checkAttrType(NodeList docNodes, String attribute){

		String type = SIM_ATR_TYP;
		JSONObject compAtts = getCpxAts(docNodes);
		if (compAtts.has(attribute)){
			type = CPX_ATR_TYP;
		}else{
			type = SIM_ATR_TYP;
		}
		return type;
	}	

	public JSONObject getCpxAts(NodeList docNodes){	
		
		List<NodeList> cpxAtrNodes = getChildNodes(docNodes, S100_FC_CPX_ATR);		
		JSONObject json = new JSONObject();	
		for (NodeList nodeList : cpxAtrNodes) 		
		{
			String name = getNodeName(nodeList, S100_FC_CODE);
			JSONObject atts = getNodeAttrs(nodeList, S100_FC_SUB_ATR_BDG);
			
			json.put(name,atts);
		}	
		return json;	
	}	
}
