//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package org.iso.standards.iso._19115.__3.lan._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.gco._1.CharacterStringPropertyType;


/**
 * <p>Java class for PT_FreeText_PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PT_FreeText_PropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://standards.iso.org/iso/19115/-3/lan/1.0}PT_FreeText"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PT_FreeText_PropertyType", propOrder = {
    "ptFreeText"
})
public class PTFreeTextPropertyType
    extends CharacterStringPropertyType
{

    @XmlElement(name = "PT_FreeText")
    protected PTFreeTextType ptFreeText;

    /**
     * Gets the value of the ptFreeText property.
     * 
     * @return
     *     possible object is
     *     {@link PTFreeTextType }
     *     
     */
    public PTFreeTextType getPTFreeText() {
        return ptFreeText;
    }

    /**
     * Sets the value of the ptFreeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTFreeTextType }
     *     
     */
    public void setPTFreeText(PTFreeTextType value) {
        this.ptFreeText = value;
    }

}
