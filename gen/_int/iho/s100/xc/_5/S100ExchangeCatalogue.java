//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package _int.iho.s100.xc._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import _int.iho.s100.se._5.S100SECertificateContainerType;
import org.iso.standards.iso._19115.__3.gco._1.CharacterStringPropertyType;
import org.iso.standards.iso._19115.__3.lan._1.PTLocalePropertyType;


/**
 * Each exchange set has a single S-100_ExchangeCatalogue which contains meta information for the data and support files in the exchange set. 
 * 
 * <p>Java class for S100_ExchangeCatalogue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_ExchangeCatalogue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://www.iho.int/s100/xc/5.2}S100_ExchangeCatalogueIdentifier" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.iho.int/s100/xc/5.2}S100_CataloguePointofContact" minOccurs="0"/>
 *         &lt;element name="productSpecification" type="{http://www.iho.int/s100/xc/5.2}S100_ProductSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="defaultLocale" type="{http://standards.iso.org/iso/19115/-3/lan/1.0}PT_Locale_PropertyType" minOccurs="0"/>
 *         &lt;element name="otherLocale" type="{http://standards.iso.org/iso/19115/-3/lan/1.0}PT_Locale_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exchangeCatalogueDescription" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="exchangeCatalogueComment" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="certificates" type="{http://www.iho.int/s100/se/5.2}S100_SE_CertificateContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataServerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datasetDiscoveryMetadata">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iho.int/s100/xc/5.2}S100_DatasetDiscoveryMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="supportFileDiscoveryMetadata">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iho.int/s100/xc/5.2}S100_SupportFileDiscoveryMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="catalogueDiscoveryMetadata">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iho.int/s100/xc/5.2}S100_CatalogueDiscoveryMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_ExchangeCatalogue", propOrder = {
    "identifier",
    "contact",
    "productSpecification",
    "defaultLocale",
    "otherLocale",
    "exchangeCatalogueDescription",
    "exchangeCatalogueComment",
    "certificates",
    "dataServerIdentifier",
    "datasetDiscoveryMetadata",
    "supportFileDiscoveryMetadata",
    "catalogueDiscoveryMetadata"
})
public class S100ExchangeCatalogue {

    protected S100ExchangeCatalogueIdentifier identifier;
    protected S100CataloguePointofContact contact;
    protected List<S100ProductSpecification> productSpecification;
    protected PTLocalePropertyType defaultLocale;
    protected List<PTLocalePropertyType> otherLocale;
    protected CharacterStringPropertyType exchangeCatalogueDescription;
    protected CharacterStringPropertyType exchangeCatalogueComment;
    protected List<S100SECertificateContainerType> certificates;
    protected String dataServerIdentifier;
    @XmlElement(required = true)
    protected S100ExchangeCatalogue.DatasetDiscoveryMetadata datasetDiscoveryMetadata;
    @XmlElement(required = true)
    protected S100ExchangeCatalogue.SupportFileDiscoveryMetadata supportFileDiscoveryMetadata;
    @XmlElement(required = true)
    protected S100ExchangeCatalogue.CatalogueDiscoveryMetadata catalogueDiscoveryMetadata;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link S100ExchangeCatalogueIdentifier }
     *     
     */
    public S100ExchangeCatalogueIdentifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100ExchangeCatalogueIdentifier }
     *     
     */
    public void setIdentifier(S100ExchangeCatalogueIdentifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link S100CataloguePointofContact }
     *     
     */
    public S100CataloguePointofContact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100CataloguePointofContact }
     *     
     */
    public void setContact(S100CataloguePointofContact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the productSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100ProductSpecification }
     * 
     * 
     */
    public List<S100ProductSpecification> getProductSpecification() {
        if (productSpecification == null) {
            productSpecification = new ArrayList<S100ProductSpecification>();
        }
        return this.productSpecification;
    }

    /**
     * Gets the value of the defaultLocale property.
     * 
     * @return
     *     possible object is
     *     {@link PTLocalePropertyType }
     *     
     */
    public PTLocalePropertyType getDefaultLocale() {
        return defaultLocale;
    }

    /**
     * Sets the value of the defaultLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTLocalePropertyType }
     *     
     */
    public void setDefaultLocale(PTLocalePropertyType value) {
        this.defaultLocale = value;
    }

    /**
     * Gets the value of the otherLocale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherLocale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherLocale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTLocalePropertyType }
     * 
     * 
     */
    public List<PTLocalePropertyType> getOtherLocale() {
        if (otherLocale == null) {
            otherLocale = new ArrayList<PTLocalePropertyType>();
        }
        return this.otherLocale;
    }

    /**
     * Gets the value of the exchangeCatalogueDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getExchangeCatalogueDescription() {
        return exchangeCatalogueDescription;
    }

    /**
     * Sets the value of the exchangeCatalogueDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setExchangeCatalogueDescription(CharacterStringPropertyType value) {
        this.exchangeCatalogueDescription = value;
    }

    /**
     * Gets the value of the exchangeCatalogueComment property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getExchangeCatalogueComment() {
        return exchangeCatalogueComment;
    }

    /**
     * Sets the value of the exchangeCatalogueComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setExchangeCatalogueComment(CharacterStringPropertyType value) {
        this.exchangeCatalogueComment = value;
    }

    /**
     * Gets the value of the certificates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100SECertificateContainerType }
     * 
     * 
     */
    public List<S100SECertificateContainerType> getCertificates() {
        if (certificates == null) {
            certificates = new ArrayList<S100SECertificateContainerType>();
        }
        return this.certificates;
    }

    /**
     * Gets the value of the dataServerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataServerIdentifier() {
        return dataServerIdentifier;
    }

    /**
     * Sets the value of the dataServerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataServerIdentifier(String value) {
        this.dataServerIdentifier = value;
    }

    /**
     * Gets the value of the datasetDiscoveryMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link S100ExchangeCatalogue.DatasetDiscoveryMetadata }
     *     
     */
    public S100ExchangeCatalogue.DatasetDiscoveryMetadata getDatasetDiscoveryMetadata() {
        return datasetDiscoveryMetadata;
    }

    /**
     * Sets the value of the datasetDiscoveryMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100ExchangeCatalogue.DatasetDiscoveryMetadata }
     *     
     */
    public void setDatasetDiscoveryMetadata(S100ExchangeCatalogue.DatasetDiscoveryMetadata value) {
        this.datasetDiscoveryMetadata = value;
    }

    /**
     * Gets the value of the supportFileDiscoveryMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link S100ExchangeCatalogue.SupportFileDiscoveryMetadata }
     *     
     */
    public S100ExchangeCatalogue.SupportFileDiscoveryMetadata getSupportFileDiscoveryMetadata() {
        return supportFileDiscoveryMetadata;
    }

    /**
     * Sets the value of the supportFileDiscoveryMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100ExchangeCatalogue.SupportFileDiscoveryMetadata }
     *     
     */
    public void setSupportFileDiscoveryMetadata(S100ExchangeCatalogue.SupportFileDiscoveryMetadata value) {
        this.supportFileDiscoveryMetadata = value;
    }

    /**
     * Gets the value of the catalogueDiscoveryMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link S100ExchangeCatalogue.CatalogueDiscoveryMetadata }
     *     
     */
    public S100ExchangeCatalogue.CatalogueDiscoveryMetadata getCatalogueDiscoveryMetadata() {
        return catalogueDiscoveryMetadata;
    }

    /**
     * Sets the value of the catalogueDiscoveryMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100ExchangeCatalogue.CatalogueDiscoveryMetadata }
     *     
     */
    public void setCatalogueDiscoveryMetadata(S100ExchangeCatalogue.CatalogueDiscoveryMetadata value) {
        this.catalogueDiscoveryMetadata = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iho.int/s100/xc/5.2}S100_CatalogueDiscoveryMetadata" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "s100CatalogueDiscoveryMetadata"
    })
    public static class CatalogueDiscoveryMetadata {

        @XmlElement(name = "S100_CatalogueDiscoveryMetadata")
        protected List<S100CatalogueDiscoveryMetadata> s100CatalogueDiscoveryMetadata;

        /**
         * Gets the value of the s100CatalogueDiscoveryMetadata property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the s100CatalogueDiscoveryMetadata property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getS100CatalogueDiscoveryMetadata().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link S100CatalogueDiscoveryMetadata }
         * 
         * 
         */
        public List<S100CatalogueDiscoveryMetadata> getS100CatalogueDiscoveryMetadata() {
            if (s100CatalogueDiscoveryMetadata == null) {
                s100CatalogueDiscoveryMetadata = new ArrayList<S100CatalogueDiscoveryMetadata>();
            }
            return this.s100CatalogueDiscoveryMetadata;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iho.int/s100/xc/5.2}S100_DatasetDiscoveryMetadata" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "s100DatasetDiscoveryMetadata"
    })
    public static class DatasetDiscoveryMetadata {

        @XmlElement(name = "S100_DatasetDiscoveryMetadata")
        protected List<S100DatasetDiscoveryMetadata> s100DatasetDiscoveryMetadata;

        /**
         * Discovery metadata for single dataset. Constraints should be in a separate file for reusability and potential customization.Gets the value of the s100DatasetDiscoveryMetadata property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the s100DatasetDiscoveryMetadata property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getS100DatasetDiscoveryMetadata().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link S100DatasetDiscoveryMetadata }
         * 
         * 
         */
        public List<S100DatasetDiscoveryMetadata> getS100DatasetDiscoveryMetadata() {
            if (s100DatasetDiscoveryMetadata == null) {
                s100DatasetDiscoveryMetadata = new ArrayList<S100DatasetDiscoveryMetadata>();
            }
            return this.s100DatasetDiscoveryMetadata;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iho.int/s100/xc/5.2}S100_SupportFileDiscoveryMetadata" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "s100SupportFileDiscoveryMetadata"
    })
    public static class SupportFileDiscoveryMetadata {

        @XmlElement(name = "S100_SupportFileDiscoveryMetadata")
        protected List<S100SupportFileDiscoveryMetadata> s100SupportFileDiscoveryMetadata;

        /**
         * Gets the value of the s100SupportFileDiscoveryMetadata property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the s100SupportFileDiscoveryMetadata property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getS100SupportFileDiscoveryMetadata().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link S100SupportFileDiscoveryMetadata }
         * 
         * 
         */
        public List<S100SupportFileDiscoveryMetadata> getS100SupportFileDiscoveryMetadata() {
            if (s100SupportFileDiscoveryMetadata == null) {
                s100SupportFileDiscoveryMetadata = new ArrayList<S100SupportFileDiscoveryMetadata>();
            }
            return this.s100SupportFileDiscoveryMetadata;
        }

    }

}
