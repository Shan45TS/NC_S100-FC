//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:27:16 PM PDT 
//


package org.iso.standards.iso._19115.__3.cit._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import _int.iho.s100.xc._5.S100PhoneType;
import org.iso.standards.iso._19115.__3.gco._1.AbstractObjectType;
import org.iso.standards.iso._19115.__3.gco._1.CharacterStringPropertyType;


/**
 * <p>Java class for CI_Telephone_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI_Telephone_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/gco/1.0}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="number" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType"/&gt;
 *         &lt;element name="numberType" type="{http://standards.iso.org/iso/19115/-3/cit/2.0}CI_TelephoneTypeCode_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Telephone_Type", propOrder = {
    "number",
    "numberType"
})
@XmlSeeAlso({
    S100PhoneType.class
})
public class CITelephoneType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType number;
    protected CITelephoneTypeCodePropertyType numberType;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setNumber(CharacterStringPropertyType value) {
        this.number = value;
    }

    /**
     * Gets the value of the numberType property.
     * 
     * @return
     *     possible object is
     *     {@link CITelephoneTypeCodePropertyType }
     *     
     */
    public CITelephoneTypeCodePropertyType getNumberType() {
        return numberType;
    }

    /**
     * Sets the value of the numberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITelephoneTypeCodePropertyType }
     *     
     */
    public void setNumberType(CITelephoneTypeCodePropertyType value) {
        this.numberType = value;
    }

}
