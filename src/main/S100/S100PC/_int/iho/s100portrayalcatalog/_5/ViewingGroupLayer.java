//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.s100portrayalcatalog._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewingGroupLayer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewingGroupLayer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100PortrayalCatalog/5.2}CatalogItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="viewingGroup" type="{http://www.iho.int/S100SymbolDefinition/5.2}IdString" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewingGroupLayer", propOrder = {
    "viewingGroup"
})
public class ViewingGroupLayer
    extends CatalogItem
{

    @XmlElement(required = true)
    protected List<String> viewingGroup;

    /**
     * Gets the value of the viewingGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewingGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewingGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getViewingGroup() {
        if (viewingGroup == null) {
            viewingGroup = new ArrayList<String>();
        }
        return this.viewingGroup;
    }

}
