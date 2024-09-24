//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:20:02 PM PDT 
//


package org.iso.standards.iso._19115.__3.mri._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.gco._1.AbstractObjectType;
import org.iso.standards.iso._19115.__3.gco._1.CharacterStringPropertyType;
import org.iso.standards.iso._19115.__3.gmw._1.TMPrimitivePropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractCitationPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractResponsibilityPropertyType;


/**
 * <p>Java class for MD_Usage_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_Usage_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/gco/1.0}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="specificUsage" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType"/&gt;
 *         &lt;element name="usageDateTime" type="{http://standards.iso.org/iso/19115/-3/gmw/1.0}TM_Primitive_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="userDeterminedLimitations" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="userContactInfo" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Responsibility_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="response" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additionalDocumentation" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Citation_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="identifiedIssues" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Citation_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Usage_Type", propOrder = {
    "specificUsage",
    "usageDateTime",
    "userDeterminedLimitations",
    "userContactInfo",
    "response",
    "additionalDocumentation",
    "identifiedIssues"
})
public class MDUsageType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType specificUsage;
    protected List<TMPrimitivePropertyType> usageDateTime;
    protected CharacterStringPropertyType userDeterminedLimitations;
    protected List<AbstractResponsibilityPropertyType> userContactInfo;
    protected List<CharacterStringPropertyType> response;
    protected List<AbstractCitationPropertyType> additionalDocumentation;
    protected AbstractCitationPropertyType identifiedIssues;

    /**
     * Gets the value of the specificUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSpecificUsage() {
        return specificUsage;
    }

    /**
     * Sets the value of the specificUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSpecificUsage(CharacterStringPropertyType value) {
        this.specificUsage = value;
    }

    /**
     * Gets the value of the usageDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMPrimitivePropertyType }
     * 
     * 
     */
    public List<TMPrimitivePropertyType> getUsageDateTime() {
        if (usageDateTime == null) {
            usageDateTime = new ArrayList<TMPrimitivePropertyType>();
        }
        return this.usageDateTime;
    }

    /**
     * Gets the value of the userDeterminedLimitations property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getUserDeterminedLimitations() {
        return userDeterminedLimitations;
    }

    /**
     * Sets the value of the userDeterminedLimitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setUserDeterminedLimitations(CharacterStringPropertyType value) {
        this.userDeterminedLimitations = value;
    }

    /**
     * Gets the value of the userContactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userContactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractResponsibilityPropertyType }
     * 
     * 
     */
    public List<AbstractResponsibilityPropertyType> getUserContactInfo() {
        if (userContactInfo == null) {
            userContactInfo = new ArrayList<AbstractResponsibilityPropertyType>();
        }
        return this.userContactInfo;
    }

    /**
     * Gets the value of the response property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the response property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getResponse() {
        if (response == null) {
            response = new ArrayList<CharacterStringPropertyType>();
        }
        return this.response;
    }

    /**
     * Gets the value of the additionalDocumentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDocumentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDocumentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractCitationPropertyType }
     * 
     * 
     */
    public List<AbstractCitationPropertyType> getAdditionalDocumentation() {
        if (additionalDocumentation == null) {
            additionalDocumentation = new ArrayList<AbstractCitationPropertyType>();
        }
        return this.additionalDocumentation;
    }

    /**
     * Gets the value of the identifiedIssues property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractCitationPropertyType }
     *     
     */
    public AbstractCitationPropertyType getIdentifiedIssues() {
        return identifiedIssues;
    }

    /**
     * Sets the value of the identifiedIssues property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractCitationPropertyType }
     *     
     */
    public void setIdentifiedIssues(AbstractCitationPropertyType value) {
        this.identifiedIssues = value;
    }

}
