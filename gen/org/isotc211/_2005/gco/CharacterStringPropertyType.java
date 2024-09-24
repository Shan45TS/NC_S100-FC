//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package org.isotc211._2005.gco;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gmd.LocalisedCharacterStringType;
import org.isotc211._2005.gmd.MDObligationCodeType;
import org.isotc211._2005.gmd.MDPixelOrientationCodeType;
import org.isotc211._2005.gmd.MDTopicCategoryCodeType;
import org.isotc211._2005.gmd.PTFreeTextPropertyType;


/**
 * <p>Java class for CharacterString_PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacterString_PropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.isotc211.org/2005/gco}CharacterString"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.isotc211.org/2005/gco}nilReason"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacterString_PropertyType", propOrder = {
    "characterString"
})
@XmlSeeAlso({
    PTFreeTextPropertyType.class
})
public class CharacterStringPropertyType {

    @XmlElementRef(name = "CharacterString", namespace = "http://www.isotc211.org/2005/gco", type = JAXBElement.class, required = false)
    protected JAXBElement<?> characterString;
    @XmlAttribute(name = "nilReason", namespace = "http://www.isotc211.org/2005/gco")
    protected List<String> nilReason;

    /**
     * Gets the value of the characterString property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MDTopicCategoryCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MDPixelOrientationCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MDObligationCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalisedCharacterStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     
     */
    public JAXBElement<?> getCharacterString() {
        return characterString;
    }

    /**
     * Sets the value of the characterString property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MDTopicCategoryCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MDPixelOrientationCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MDObligationCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalisedCharacterStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}
     *     
     */
    public void setCharacterString(JAXBElement<?> value) {
        this.characterString = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

}
