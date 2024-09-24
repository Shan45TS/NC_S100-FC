package com.dam.nc;

import java.io.StringWriter;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.json.JSONObject;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

// import _int.iho.s100gml._5.CurvePropertyType;
// import _int.iho.s100gml._5.CurveType;
// import _int.iho.s100gml._5.DataSetIdentificationType;
// import _int.iho.s100gml._5.DatasetPurposeType;
// import _int.iho.s100gml._5.MDTopicCategoryCode;
// import _int.iho.s100gml._5.PointPropertyType;
// import _int.iho.s100gml._5.PointType;
// import _int.iho.s100gml._5.SurfacePropertyType;
// import _int.iho.s100gml._5.SurfaceType;
// import _int.iho.s124._1.AffectedChartPublicationsType;
// import _int.iho.s124._1.ChartAffectedType;
// import _int.iho.s124._1.DateEndType;
// import _int.iho.s124._1.DateStartType;
// import _int.iho.s124._1.DateTimeRangeType;
// import _int.iho.s124._1.ENCFeatureReferenceType;
// import _int.iho.s124._1.FeatureNameType;
// import _int.iho.s124._1.FeatureReferenceType;
// import _int.iho.s124._1.FixedDateRangeType;
// import _int.iho.s124._1.GeneralAreaType;
// import _int.iho.s124._1.InformationType;
// import _int.iho.s124._1.LocalityType;
// import _int.iho.s124._1.LocationNameType;
// import _int.iho.s124._1.MessageSeriesIdentifierType;
// import _int.iho.s124._1.NAVWARNPartRestrictionLabel;
// import _int.iho.s124._1.NAVWARNPartRestrictionType;
// import _int.iho.s124._1.NAVWARNPartType;
// import _int.iho.s124._1.NAVWARNPartType.Geometry;
// import _int.iho.s124._1.NAVWARNPreambleType;
// import _int.iho.s124._1.NAVWARNTitleType;
// import _int.iho.s124._1.NavwarnTypeGeneralType;
// import _int.iho.s124._1.ObjectFactory;
// import _int.iho.s124._1.ThisDatasetType;
// import _int.iho.s124._1.ThisDatasetType.Members;
// import _int.iho.s124._1.WarningInformationType;
// import _int.iho.s124._1.WarningTypeLabel;
// import _int.iho.s124._1.WarningTypeType;
// import net.opengis.gml._3.AbstractCurveSegmentType;
// import net.opengis.gml._3.AbstractCurveType;
// import net.opengis.gml._3.AbstractRingPropertyType;
// import net.opengis.gml._3.AbstractRingType;
// import net.opengis.gml._3.AbstractSurfacePatchType;
// import net.opengis.gml._3.CurveInterpolationType;
// import net.opengis.gml._3.CurveSegmentArrayPropertyType;
// import net.opengis.gml._3.DirectPositionListType;
// import net.opengis.gml._3.DirectPositionType;
// import net.opengis.gml._3.LineStringSegmentType;
// import net.opengis.gml._3.LinearRingPropertyType;
// import net.opengis.gml._3.LinearRingType;
// import net.opengis.gml._3.PolygonPatchType;
// import net.opengis.gml._3.ReferenceType;
// import net.opengis.gml._3.SurfaceInterpolationType;
// import net.opengis.gml._3.SurfacePatchArrayPropertyType;

public class FCUtilities {

	private JSONObject data;
	static final String LANGUAGE = "language";	
	
	public void getData(JSONObject jsonObj){
		data = jsonObj;
	}

	public String setValue(String reqValue){
		String val = "";
		if (data.has(reqValue))		{
			val = data.getString(reqValue);
		}
		return val; 
	}

	public String setDate(String reqValue){
		String val = LocalDateTime.now().toString();
		if (data.has(reqValue))		{
			val = data.getString(reqValue);
		}
		return val; 
	}

	public String setValue(String reqValue, String objName){
		String val = "";
		JSONObject obj = data.getJSONObject(objName);
		if (obj.has(reqValue))		{
			val = obj.getString(reqValue);
		}
		return val; 
	}

	public String setDate(String reqValue, String objName){
		String val = LocalDateTime.now().toString();
		JSONObject obj = data.getJSONObject(objName);
		if (obj.has(reqValue))		{
			val = obj.getString(reqValue);
		}		
		return val;
	}

	public JSONObject getObj(String objName){
		return data.getJSONObject(objName);		
	}


// 	public NAVWARNPreambleType createNAVWARNPreambleObj() throws DatatypeConfigurationException
// 	{		
// 		final String CHART_AFFECTED = "chartAffected"; 
// 		final String AFCT_CHAT_PUBS = "affectedChartPublications"; 
// 		final String NAVWARNTITLE = "nAVWARNTitle";
// 		final String GEN_AREA =  "generalArea";
// 		final String LOCALITY = "locality";
// 		final String MSSG_SERI_IDTR = "messageSeriesIdentifier";

// 		NAVWARNPreambleType preambleType = new NAVWARNPreambleType();
		
// 		/*** ID ***/
// 		preambleType.setId(setValue("id"));
// 		/**********/

// 		/*** CHART AFFECTED ***/
// 		ChartAffectedType chartAffectedType = new ChartAffectedType();
// 		chartAffectedType.setChartNumber(setValue("chartNumber"));
// 		chartAffectedType.setChartPlanNumber(setValue("chartPlanNumber"));
// 		XMLGregorianCalendar editionDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(setValue("editionDate"));
// 		chartAffectedType.setEditionDate(editionDate);
// 		chartAffectedType.setLastNoticeDate(editionDate);		

// 		//AFFECTED CHART PUBLICATIONS		
// 		AffectedChartPublicationsType affectedChartPublicationsType = new AffectedChartPublicationsType();
// 		affectedChartPublicationsType.setPublicationAffected(setValue("publicationAffected"));
// 		affectedChartPublicationsType.setChartPublicationIdentifier(setValue("chartPublicationIdentifier"));
// 		affectedChartPublicationsType.setInternationalChartAffected(setValue("internationalChartAffected"));
// 		affectedChartPublicationsType.setLanguage(setValue(LANGUAGE));
// 		affectedChartPublicationsType.setChartAffected(chartAffectedType);
		
// 		preambleType.getAffectedChartPublications().add(affectedChartPublicationsType);
// 		/**********/

// 		//NAV WARN TITLE
// 		NAVWARNTitleType navWarnTitleType = new NAVWARNTitleType();
// 		navWarnTitleType.setLanguage(setValue(LANGUAGE));
// 		navWarnTitleType.setText(setValue("text1"));
		
// 		preambleType.setNAVWARNTitle(navWarnTitleType);
// 		/**********/

// 		//GENERAL AREA
// 		LocationNameType locationNameType = new LocationNameType();
// 		locationNameType.setLanguage(setValue(LANGUAGE));
// 		locationNameType.setText(setValue("text3"));
// 		GeneralAreaType generalAreaType = new GeneralAreaType();		
// 		generalAreaType.setLocalityIdentifier(setValue("localityIdentifier"));
// 		generalAreaType.getLocationName().add(locationNameType);

// 		preambleType.getGeneralArea().add(generalAreaType);
// 		/**********/

// 		//LOCALITY		
// 		locationNameType = new LocationNameType();
// 		locationNameType.setLanguage(setValue(LANGUAGE));
// 		locationNameType.setText(setValue("text2"));
// 		LocalityType localityType = new LocalityType();
// 		localityType.setLocalityIdentifier(setValue("localityIdentifier"));
// 		localityType.getLocationName().add(locationNameType);
	
// 		preambleType.getLocality().add(localityType);
// 		/**********/

// 		//MESSAGE SERIES IDETIFIER
// 		MessageSeriesIdentifierType msgSI = new MessageSeriesIdentifierType();
// 		msgSI.setAgencyResponsibleForProduction(setValue("agencyResponsibleForProduction"));		
// 		msgSI.setCountryName(setValue("countryName"));
// 		msgSI.setNameOfSeries(setValue("nameOfSeries"));
// 		msgSI.setWarningIdentifier(setValue("WarningIdentifier"));
// 		msgSI.setWarningNumber(new BigInteger(setValue("warningNumber")));			
		
// 		WarningTypeType warnType = new WarningTypeType();
// 		warnType.setCode(BigInteger.valueOf(1));		
// 		warnType.setValue(WarningTypeLabel.NAVAREA_IN_FORCE_BULLETIN);		
// 		msgSI.setWarningType(warnType);

// 		msgSI.setYear(new BigInteger(setValue("year")));	
		
// 		preambleType.setMessageSeriesIdentifier(msgSI);
// 		/**********/	

// 		//CANCELLATION DATE		
// 		XMLGregorianCalendar xmlGC = DatatypeFactory.newInstance().newXMLGregorianCalendar(setDate("cancellationDate"));
// 		preambleType.setCancellationDate(xmlGC);
// 		/**********/

// 		//INT SERVICE
// 		if (setValue("intService").equals("true")){
// 			preambleType.setIntService(true);
// 		}else{
// 			preambleType.setIntService(false);
// 		}
// 		/**********/
		
// 		//NAV WARN TYPE GENERAL		
// 		NavwarnTypeGeneralType navwarnTypeGeneralType = new NavwarnTypeGeneralType();
// 		navwarnTypeGeneralType.setCode("1");
// 		navwarnTypeGeneralType.setValue(setValue("navwarnTypeGeneral"));

// 		preambleType.setNavwarnTypeGeneral(navwarnTypeGeneralType);
// 		/**********/

// 		//PUBLICATION TIME
// 		XMLGregorianCalendar xmlGC1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(setDate("publicationTime"));
// 		preambleType.setPublicationTime(xmlGC1);
// 		/**********/

// 		//REFERENCES
// 		ReferenceType referenceType = new ReferenceType();
// 		preambleType.getTheReferences().add(referenceType);
// 		/**********/
		
// 		return preambleType;
// 	}

// 	public NAVWARNPartType createNAVWARNPart() throws DatatypeConfigurationException
// 	{
// 		final String FEAT_NAME = "featureName";
// 		final String FEAT_REFR = "featureReference";
// 		final String FIX_DATE_RNGE = "fixedDateRange";
// 		final String WARN_INFO = "warningInformation";
// 		final String RESTRICTION = "restriction";
// 		final String HEADER = "header";
// 		final String AFFECTS = "affects";
// 		final String POSITIONS = "positions";
// 		final String GEOMETRY = "geometry";

// 		NAVWARNPartType navwarnPartType = new NAVWARNPartType();

// 		//FEATURE NAME
// 		FeatureNameType featureNameType = new FeatureNameType();
// 		featureNameType.setLanguage(setValue(LANGUAGE));
// 		featureNameType.setDisplayName(true);
// 		featureNameType.setName(setValue("name"));
		
// 		navwarnPartType.getFeatureName().add(featureNameType);
// 		/**********/

// 		//FEATURE REFERENCE
// 		FeatureReferenceType featureReferenceType = new FeatureReferenceType();
// 		ENCFeatureReferenceType encFeatureReferenceType = new ENCFeatureReferenceType();
// 		encFeatureReferenceType.setENCName(setValue("eNCName"));
// 		encFeatureReferenceType.setUpdateNumber(setValue("updateNumber"));
// 		encFeatureReferenceType.setEditionNumber(setValue("editionNumber"));
// 		encFeatureReferenceType.getFeatureObjectIdentifier().add(setValue("featureObjectIdentifier"));

// 		featureReferenceType.getENCFeatureReference().add(encFeatureReferenceType);
// 		featureReferenceType.getAtoNNumber().add(setDate("atoNNumber"));
// 		featureReferenceType.getFeatureIdentifier().add(setDate("featureIdentifier"));

// 		//DATE TIME RANGE
// 		DateTimeRangeType dateTimeRangeType = new DateTimeRangeType();
// 		XMLGregorianCalendar dateTimeStart = DatatypeFactory.newInstance().newXMLGregorianCalendar(setDate("dateTimeStart"));
// 		XMLGregorianCalendar dateTimeEnd = DatatypeFactory.newInstance().newXMLGregorianCalendar(setDate("dateTimeEnd"));		
		
// 		dateTimeRangeType.setDateTimeStart(dateTimeStart);
// 		dateTimeRangeType.setDateTimeEnd(dateTimeEnd);
// 		featureReferenceType.setDateTimeRange(dateTimeRangeType);
// 		navwarnPartType.getFeatureReference().add(featureReferenceType);
// 		/**********/

// 		//FIXED DATE RANGE
// 		FixedDateRangeType fixedDateRangeType = new FixedDateRangeType();
// 		DateStartType dateStartType = new DateStartType();
// 		DateEndType dateEndType = new DateEndType();
// 		XMLGregorianCalendar dateStart = DatatypeFactory.newInstance().newXMLGregorianCalendar(setDate("dateStart"));
// 		XMLGregorianCalendar dateEnd = DatatypeFactory.newInstance().newXMLGregorianCalendar(setDate("dateEnd"));
		
// 		dateStartType.setDate(dateStart);
// 		dateStartType.setGDay(dateStart);
// 		dateStartType.setGMonth(dateStart);
// 		dateStartType.setGMonthDay(dateStart);
// 		dateStartType.setGYear(dateStart);
// 		dateStartType.setGYearMonth(dateStart);

// 		dateEndType.setDate(dateStart);
// 		dateEndType.setGDay(dateEnd);
// 		dateEndType.setGMonth(dateEnd);
// 		dateEndType.setGMonthDay(dateEnd);
// 		dateEndType.setGYear(dateEnd);
// 		dateEndType.setGYearMonth(dateEnd);

// 		fixedDateRangeType.setDateStart(dateStartType);
// 		navwarnPartType.getFixedDateRange().add(fixedDateRangeType);
// 		/**********/

// 		//WARNING INFORMATION
// 		WarningInformationType warningInformationType = new WarningInformationType();
// 		InformationType informationType = new InformationType();
// 		informationType.setFileLocator(setValue("fileLocator"));
// 		informationType.setFileReference(setValue("fileReference"));
// 		informationType.setHeadline(setValue("headline"));
// 		informationType.setLanguage(setValue(LANGUAGE));
// 		informationType.setText(setValue("text4"));
		
// 		warningInformationType.setInformation(informationType);
// 		navwarnPartType.setWarningInformation(warningInformationType);
// 		/**********/

// 		//RESTRICTION
// 		NAVWARNPartRestrictionType navwarnPartRestrictionType = new NAVWARNPartRestrictionType();
// 		navwarnPartRestrictionType.setCode(new BigInteger(setValue("restriction")));
// 		navwarnPartRestrictionType.setValue(NAVWARNPartRestrictionLabel.AREA_TO_BE_AVOIDED);	
		
// 		navwarnPartType.setRestriction(navwarnPartRestrictionType);
// 		/**********/

// 		//HEADER
// 		ReferenceType referenceType = new ReferenceType();
// 		referenceType.setActuate(ActuateType.NONE);
// 		referenceType.setArcrole("");		
// 		referenceType.setHref("");
// 		referenceType.setOwns(false);
// 		referenceType.setRole("");
// 		referenceType.setShow(ShowType.NEW);
// 		referenceType.setTitle(setValue("header"));
				
// 		referenceType.setType(TypeType.TITLE);		
// 		navwarnPartType.setHeader(referenceType);
// 		/**********/

// 		//AFFECTS
// 		navwarnPartType.getAffects().add(referenceType);

// 		//POSITIONS
// 		navwarnPartType.getPositions().add(referenceType);

// 		//GEOMETRY
// 		Geometry geometry = new Geometry();
// 		//POINT

// 		// PointPropertyType pointPropertyType = new PointPropertyType();
// 		// PointType pointType = new PointType();		
// 		// DirectPositionType directPositionType = new DirectPositionType();
// 		// directPositionType.setSrsName("EPSG:4326");
// 		// directPositionType.setSrsDimension(new BigInteger("2"));
// 		// String coors = setValue("coors");
// 		// String[] sCoors = coors.split(" ");
// 		// for (String coor : sCoors) {
// 		// 	Double dCoor = Double.parseDouble(coor);
// 		// 	directPositionType.getValue().add(dCoor);
// 		// }		
// 		// pointType.setPos(directPositionType);
// 		// pointType.setId("1");
// 		// pointType.setSrsDimension(new BigInteger("2"));		
// 		// pointPropertyType.setPoint(pointType);
// 		// pointPropertyType.setActuate(ActuateType.NONE);
// 		// pointPropertyType.setArcrole("");
// 		// pointPropertyType.setHref("");
// 		// pointPropertyType.setRole("");
// 		// pointPropertyType.setTitle("");
// 		// pointPropertyType.setScaleMaximum(new BigInteger("5000"));
// 		// pointPropertyType.setScaleMinimum(new BigInteger("1000"));
// 		// geometry.setPointProperty(pointPropertyType);	

// 		//POLYGON
// 		// CurvePropertyType curvePropertyType = new CurvePropertyType();
// 		// CurveType curveType = new CurveType();
// 		// DirectPositionListType directPositionListType = new DirectPositionListType();
// 		// directPositionListType.setSrsName("EPSG:4326");
// 		// directPositionListType.setSrsDimension(new BigInteger("2"));
// 		// String coors = setValue("coors");
// 		// String[] sCoors = coors.split(" ");
// 		// for (String coor : sCoors) {
// 		// 	Double dCoor = Double.parseDouble(coor);
// 		// 	directPositionListType.getValue().add(dCoor);
// 		// }

// 		// LineStringSegmentType lineStringSegmentType = new LineStringSegmentType();
// 		// lineStringSegmentType.setNumDerivativesAtStart(new BigInteger("0"));
// 		// lineStringSegmentType.setNumDerivativeInterior(new BigInteger("0"));
// 		// lineStringSegmentType.setInterpolation(CurveInterpolationType.LINEAR);
// 		// lineStringSegmentType.setPosList(directPositionListType);

// 		// AbstractCurveSegmentType abstractCurveSegmentType = lineStringSegmentType;
// 		// CurveSegmentArrayPropertyType curveSegmentArrayPropertyType = new CurveSegmentArrayPropertyType();
// 		// QName name = new QName("gml:LineStringSegment");		
// 		// JAXBElement<AbstractCurveSegmentType> je = new JAXBElement<AbstractCurveSegmentType>(name, AbstractCurveSegmentType.class,  abstractCurveSegmentType);
		
// 		// curveSegmentArrayPropertyType.getAbstractCurveSegment().add(je);
// 		// curveType.setSegments(curveSegmentArrayPropertyType);		
// 		// curvePropertyType.setCurve(curveType);		
// 		// geometry.setCurveProperty(curvePropertyType);

// 		//POLYGON
// 		SurfacePropertyType surfacePropertyType = new SurfacePropertyType();
// 		SurfaceType surfaceType = new SurfaceType();
// 		DirectPositionListType directPositionListType = new DirectPositionListType();
// 		directPositionListType.setSrsName("EPSG:4326");
// 		directPositionListType.setSrsDimension(new BigInteger("2"));
// 		String coors = setValue("coors");
// 		String[] sCoors = coors.split(" ");
// 		for (String coor : sCoors) {
// 			Double dCoor = Double.parseDouble(coor);
// 			directPositionListType.getValue().add(dCoor);
// 		}

// 		LinearRingType linearRingType = new LinearRingType();
// 		linearRingType.setPosList(directPositionListType);

// 		LinearRingPropertyType linearRingPropertyType = new LinearRingPropertyType();
// 		linearRingPropertyType.setLinearRing(linearRingType);

// 		AbstractRingType abstractRingType = linearRingType;

// 		AbstractRingPropertyType abstractRingPropertyType = new AbstractRingPropertyType();
// 		abstractRingPropertyType.setAbstractRing(new JAXBElement<AbstractRingType>(new QName("gml:LinearRing"), AbstractRingType.class, abstractRingType));

// 		PolygonPatchType polygonPatchType = new PolygonPatchType();
// 		polygonPatchType.setInterpolation(SurfaceInterpolationType.PLANAR);
// 		polygonPatchType.setExterior(abstractRingPropertyType);
		

// 		AbstractSurfacePatchType abstractSurfacePatchType = polygonPatchType;
// 		SurfacePatchArrayPropertyType surfacePatchArrayPropertyType = new SurfacePatchArrayPropertyType();
// 		QName name = new QName("gml:PolygonPatch");		
// 		JAXBElement<AbstractSurfacePatchType> je = new JAXBElement<AbstractSurfacePatchType>(name, AbstractSurfacePatchType.class,  abstractSurfacePatchType);
		
// 		surfacePatchArrayPropertyType.getAbstractSurfacePatch().add(je);
// 		surfaceType.setPatches(surfacePatchArrayPropertyType);		
// 		surfacePropertyType.setSurface(surfaceType);		
// 		geometry.setSurfaceProperty(surfacePropertyType);
// 		navwarnPartType.getGeometry().add(geometry);

// 		return navwarnPartType;
// 	}

// 	public DataSetIdentificationType createDataset(){

// 		final String ENCODINGSPECIFICATION = "S-100 Part 10b";
// 		final String ENCODINGSPECIFICATIONEDITION = "1.0";
// 		final String PRODUCTIDENTIFIER = "S-124";
// 		final String PRODUCTEDITION = "1.0.0";
// 		final String APPLICATIONPROFILE = "Active NAVWARNs";
// 		final String DATASETFILEIDENTIFIER = "dataset-file-name";
// 		final String DATASETTITLE = "Aids to Navigation";

// 		DataSetIdentificationType dataSetIdentificationType = new DataSetIdentificationType();
// 		dataSetIdentificationType.setEncodingSpecification(setValue(ENCODINGSPECIFICATION));
// 		dataSetIdentificationType.setEncodingSpecificationEdition(setValue(ENCODINGSPECIFICATIONEDITION));
// 		dataSetIdentificationType.setProductIdentifier(setValue(PRODUCTIDENTIFIER));
// 		dataSetIdentificationType.setProductEdition(setValue(PRODUCTEDITION));
// 		dataSetIdentificationType.setApplicationProfile(setValue(APPLICATIONPROFILE));
// 		dataSetIdentificationType.setDatasetFileIdentifier(setValue(DATASETFILEIDENTIFIER));
// 		dataSetIdentificationType.setDatasetTitle(setValue(DATASETTITLE));
// 		// dataSetIdentificationType.setDatasetReferenceDate(setDate(""));
// 		dataSetIdentificationType.setDatasetLanguage(setValue(LANGUAGE));
// 		dataSetIdentificationType.setDatasetAbstract("The abstract of the dataset");
// 		dataSetIdentificationType.getDatasetTopicCategory().add(MDTopicCategoryCode.OCEANS);		
// 		dataSetIdentificationType.setDatasetPurpose(DatasetPurposeType.BASE);
// 		dataSetIdentificationType.setUpdateNumber(new BigInteger("0"));
// 		return dataSetIdentificationType;
// 	}

// 	public String createS124GML() throws JAXBException, DatatypeConfigurationException
// 	{	
// 		DataSetIdentificationType dataSetIdentificationType = createDataset();
// 		NAVWARNPreambleType preambleType = createNAVWARNPreambleObj();
// 		NAVWARNPartType navwarnPartType = createNAVWARNPart();
// 		Members members = new Members();
// 		members.getMemberObjects().add(preambleType);
// 		members.getMemberObjects().add(navwarnPartType);
// 		ThisDatasetType datasetType = new ThisDatasetType();		
// 		datasetType.setDatasetIdentificationInformation(dataSetIdentificationType);
// 		datasetType.setMembers(members);
// 		JAXBContext context = JAXBContext.newInstance("_int.iho.s124._1");
// 		Marshaller mar = context.createMarshaller();
// 		// mar.setProperty("com.dam.s124fc", new DefaultNamespacePrefixMapper());
// 		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);		
// 		ObjectFactory obj = new ObjectFactory();
// 		javax.xml.bind.JAXBElement<ThisDatasetType> el = obj.createDataset(datasetType);		
// 		StringWriter sw = new StringWriter();
// 		mar.marshal(el,sw);
// 		return sw.toString();
// 	}	
}
