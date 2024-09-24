//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
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
import org.iso.standards.iso._19115.__3.mcc._1.AbstractCitationPropertyType;


/**
 * <p>Java class for MD_Keywords_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_Keywords_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/gco/1.0}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="keyword" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="type" type="{http://standards.iso.org/iso/19115/-3/mri/1.0}MD_KeywordTypeCode_PropertyType" minOccurs="0"/>
 *         &lt;element name="thesaurusName" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Citation_PropertyType" minOccurs="0"/>
 *         &lt;element name="keywordClass" type="{http://standards.iso.org/iso/19115/-3/mri/1.0}MD_KeywordClass_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Keywords_Type", propOrder = {
    "keyword",
    "type",
    "thesaurusName",
    "keywordClass"
})
public class MDKeywordsType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected List<CharacterStringPropertyType> keyword;
    protected MDKeywordTypeCodePropertyType type;
    protected AbstractCitationPropertyType thesaurusName;
    protected MDKeywordClassPropertyType keywordClass;

    /**
     * Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<CharacterStringPropertyType>();
        }
        return this.keyword;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MDKeywordTypeCodePropertyType }
     *     
     */
    public MDKeywordTypeCodePropertyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDKeywordTypeCodePropertyType }
     *     
     */
    public void setType(MDKeywordTypeCodePropertyType value) {
        this.type = value;
    }

    /**
     * Gets the value of the thesaurusName property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractCitationPropertyType }
     *     
     */
    public AbstractCitationPropertyType getThesaurusName() {
        return thesaurusName;
    }

    /**
     * Sets the value of the thesaurusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractCitationPropertyType }
     *     
     */
    public void setThesaurusName(AbstractCitationPropertyType value) {
        this.thesaurusName = value;
    }

    /**
     * Gets the value of the keywordClass property.
     * 
     * @return
     *     possible object is
     *     {@link MDKeywordClassPropertyType }
     *     
     */
    public MDKeywordClassPropertyType getKeywordClass() {
        return keywordClass;
    }

    /**
     * Sets the value of the keywordClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDKeywordClassPropertyType }
     *     
     */
    public void setKeywordClass(MDKeywordClassPropertyType value) {
        this.keywordClass = value;
    }

}
