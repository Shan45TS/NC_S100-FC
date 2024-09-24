//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package org.iso.standards.iso._19115.__3.cit._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.gco._1.AbstractObjectType;
import org.iso.standards.iso._19115.__3.gco._1.CharacterStringPropertyType;


/**
 * <p>Java class for CI_Contact_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI_Contact_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/gco/1.0}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="phone" type="{http://standards.iso.org/iso/19115/-3/cit/1.0}CI_Telephone_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="address" type="{http://standards.iso.org/iso/19115/-3/cit/1.0}CI_Address_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onlineResource" type="{http://standards.iso.org/iso/19115/-3/cit/1.0}CI_OnlineResource_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hoursOfService" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactInstructions" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="contactType" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Contact_Type", propOrder = {
    "phone",
    "address",
    "onlineResource",
    "hoursOfService",
    "contactInstructions",
    "contactType"
})
public class CIContactType
    extends AbstractObjectType
{

    protected List<CITelephonePropertyType> phone;
    protected List<CIAddressPropertyType> address;
    protected List<CIOnlineResourcePropertyType> onlineResource;
    protected List<CharacterStringPropertyType> hoursOfService;
    protected CharacterStringPropertyType contactInstructions;
    protected CharacterStringPropertyType contactType;

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITelephonePropertyType }
     * 
     * 
     */
    public List<CITelephonePropertyType> getPhone() {
        if (phone == null) {
            phone = new ArrayList<CITelephonePropertyType>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIAddressPropertyType }
     * 
     * 
     */
    public List<CIAddressPropertyType> getAddress() {
        if (address == null) {
            address = new ArrayList<CIAddressPropertyType>();
        }
        return this.address;
    }

    /**
     * Gets the value of the onlineResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onlineResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnlineResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIOnlineResourcePropertyType }
     * 
     * 
     */
    public List<CIOnlineResourcePropertyType> getOnlineResource() {
        if (onlineResource == null) {
            onlineResource = new ArrayList<CIOnlineResourcePropertyType>();
        }
        return this.onlineResource;
    }

    /**
     * Gets the value of the hoursOfService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hoursOfService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoursOfService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getHoursOfService() {
        if (hoursOfService == null) {
            hoursOfService = new ArrayList<CharacterStringPropertyType>();
        }
        return this.hoursOfService;
    }

    /**
     * Gets the value of the contactInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getContactInstructions() {
        return contactInstructions;
    }

    /**
     * Sets the value of the contactInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setContactInstructions(CharacterStringPropertyType value) {
        this.contactInstructions = value;
    }

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setContactType(CharacterStringPropertyType value) {
        this.contactType = value;
    }

}
