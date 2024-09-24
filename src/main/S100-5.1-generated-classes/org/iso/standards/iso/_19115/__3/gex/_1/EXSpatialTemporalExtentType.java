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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EX_SpatialTemporalExtent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EX_SpatialTemporalExtent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/gex/1.0}EX_TemporalExtent_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="verticalExtent" type="{http://standards.iso.org/iso/19115/-3/gex/1.0}EX_VerticalExtent_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="spatialExtent" type="{http://standards.iso.org/iso/19115/-3/gex/1.0}AbstractEX_GeographicExtent_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_SpatialTemporalExtent_Type", propOrder = {
    "verticalExtent",
    "spatialExtent"
})
public class EXSpatialTemporalExtentType
    extends EXTemporalExtentType
{

    protected EXVerticalExtentPropertyType verticalExtent;
    @XmlElement(required = true)
    protected List<AbstractEXGeographicExtentPropertyType> spatialExtent;

    /**
     * Gets the value of the verticalExtent property.
     * 
     * @return
     *     possible object is
     *     {@link EXVerticalExtentPropertyType }
     *     
     */
    public EXVerticalExtentPropertyType getVerticalExtent() {
        return verticalExtent;
    }

    /**
     * Sets the value of the verticalExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXVerticalExtentPropertyType }
     *     
     */
    public void setVerticalExtent(EXVerticalExtentPropertyType value) {
        this.verticalExtent = value;
    }

    /**
     * Gets the value of the spatialExtent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatialExtent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatialExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractEXGeographicExtentPropertyType }
     * 
     * 
     */
    public List<AbstractEXGeographicExtentPropertyType> getSpatialExtent() {
        if (spatialExtent == null) {
            spatialExtent = new ArrayList<AbstractEXGeographicExtentPropertyType>();
        }
        return this.spatialExtent;
    }

}
