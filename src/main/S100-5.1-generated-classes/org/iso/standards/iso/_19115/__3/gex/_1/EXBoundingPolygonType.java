//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:44:06 PM PDT 
//


package org.iso.standards.iso._19115.__3.gex._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import _int.iho.s100.xc._5.S100BoundingPolygonType;
import org.iso.standards.iso._19115.__3.gmw._1.GMObjectPropertyType;


/**
 * <p>Java class for EX_BoundingPolygon_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EX_BoundingPolygon_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/gex/1.0}AbstractEX_GeographicExtent_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="polygon" type="{http://standards.iso.org/iso/19115/-3/gmw/1.0}GM_Object_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_BoundingPolygon_Type", propOrder = {
    "polygon"
})
@XmlSeeAlso({
    S100BoundingPolygonType.class
})
public class EXBoundingPolygonType
    extends AbstractEXGeographicExtentType
{

    @XmlElement(required = true)
    protected List<GMObjectPropertyType> polygon;

    /**
     * Gets the value of the polygon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polygon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolygon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GMObjectPropertyType }
     * 
     * 
     */
    public List<GMObjectPropertyType> getPolygon() {
        if (polygon == null) {
            polygon = new ArrayList<GMObjectPropertyType>();
        }
        return this.polygon;
    }

}
