//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:21:01 PM PDT 
//


package org.iso.standards.iso._19115.__3.gex._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.gco._1.AbstractObjectType;
import org.iso.standards.iso._19115.__3.gco._1.BooleanPropertyType;


/**
 * <p>Java class for AbstractEX_GeographicExtent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractEX_GeographicExtent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/gco/1.0}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extentTypeCode" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}Boolean_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEX_GeographicExtent_Type", propOrder = {
    "extentTypeCode"
})
@XmlSeeAlso({
    EXBoundingPolygonType.class,
    EXGeographicBoundingBoxType.class,
    EXGeographicDescriptionType.class
})
public abstract class AbstractEXGeographicExtentType
    extends AbstractObjectType
{

    protected BooleanPropertyType extentTypeCode;

    /**
     * Gets the value of the extentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getExtentTypeCode() {
        return extentTypeCode;
    }

    /**
     * Sets the value of the extentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setExtentTypeCode(BooleanPropertyType value) {
        this.extentTypeCode = value;
    }

}
