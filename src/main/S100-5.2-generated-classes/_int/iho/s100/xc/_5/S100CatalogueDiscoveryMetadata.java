//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:21:01 PM PDT 
//


package _int.iho.s100.xc._5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import _int.iho.s100.se._5.S100SEDigitalSignature;
import _int.iho.s100.se._5.S100SEDigitalSignatureReferencePropertyType;
import _int.iho.s100.se._5.S100SESignatureOnData;
import _int.iho.s100.se._5.S100SESignatureOnSignature;
import org.iso.standards.iso._19115.__3.lan._1.PTLocalePropertyType;


/**
 * Class for S-100 catalogue metadata.
 * 
 * <p>Java class for S100_CatalogueDiscoveryMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_CatalogueDiscoveryMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="purpose" type="{http://www.iho.int/s100/xc/5.2}S100_Purpose" minOccurs="0"/&gt;
 *         &lt;element name="editionNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="scope" type="{http://www.iho.int/s100/xc/5.2}S100_CatalogueScope"/&gt;
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="productSpecification" type="{http://www.iho.int/s100/xc/5.2}S100_ProductSpecification"/&gt;
 *         &lt;element name="digitalSignatureReference" type="{http://www.iho.int/s100/se/5.2}S100_SE_DigitalSignatureReference_PropertyType"/&gt;
 *         &lt;element name="digitalSignatureValue" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iho.int/s100/se/5.2}S100_SE_DigitalSignature"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="compressionFlag" type="{http://www.iho.int/s100/xc/5.2}RestrictedBoolean"/&gt;
 *         &lt;element name="defaultLocale" type="{http://standards.iso.org/iso/19115/-3/lan/1.0}PT_Locale_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="otherLocale" type="{http://standards.iso.org/iso/19115/-3/lan/1.0}PT_Locale_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_CatalogueDiscoveryMetadata", propOrder = {
    "fileName",
    "purpose",
    "editionNumber",
    "scope",
    "versionNumber",
    "issueDate",
    "productSpecification",
    "digitalSignatureReference",
    "digitalSignatureValue",
    "compressionFlag",
    "defaultLocale",
    "otherLocale"
})
public class S100CatalogueDiscoveryMetadata {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String fileName;
    @XmlSchemaType(name = "string")
    protected S100Purpose purpose;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger editionNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected S100CatalogueScope scope;
    @XmlElement(required = true)
    protected String versionNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(required = true)
    protected S100ProductSpecification productSpecification;
    @XmlElement(required = true)
    protected S100SEDigitalSignatureReferencePropertyType digitalSignatureReference;
    @XmlElement(required = true)
    protected List<S100CatalogueDiscoveryMetadata.DigitalSignatureValue> digitalSignatureValue;
    protected boolean compressionFlag;
    protected PTLocalePropertyType defaultLocale;
    protected List<PTLocalePropertyType> otherLocale;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link S100Purpose }
     *     
     */
    public S100Purpose getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100Purpose }
     *     
     */
    public void setPurpose(S100Purpose value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the editionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEditionNumber() {
        return editionNumber;
    }

    /**
     * Sets the value of the editionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEditionNumber(BigInteger value) {
        this.editionNumber = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link S100CatalogueScope }
     *     
     */
    public S100CatalogueScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100CatalogueScope }
     *     
     */
    public void setScope(S100CatalogueScope value) {
        this.scope = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNumber(String value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the productSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link S100ProductSpecification }
     *     
     */
    public S100ProductSpecification getProductSpecification() {
        return productSpecification;
    }

    /**
     * Sets the value of the productSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100ProductSpecification }
     *     
     */
    public void setProductSpecification(S100ProductSpecification value) {
        this.productSpecification = value;
    }

    /**
     * Gets the value of the digitalSignatureReference property.
     * 
     * @return
     *     possible object is
     *     {@link S100SEDigitalSignatureReferencePropertyType }
     *     
     */
    public S100SEDigitalSignatureReferencePropertyType getDigitalSignatureReference() {
        return digitalSignatureReference;
    }

    /**
     * Sets the value of the digitalSignatureReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100SEDigitalSignatureReferencePropertyType }
     *     
     */
    public void setDigitalSignatureReference(S100SEDigitalSignatureReferencePropertyType value) {
        this.digitalSignatureReference = value;
    }

    /**
     * Gets the value of the digitalSignatureValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digitalSignatureValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigitalSignatureValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100CatalogueDiscoveryMetadata.DigitalSignatureValue }
     * 
     * 
     */
    public List<S100CatalogueDiscoveryMetadata.DigitalSignatureValue> getDigitalSignatureValue() {
        if (digitalSignatureValue == null) {
            digitalSignatureValue = new ArrayList<S100CatalogueDiscoveryMetadata.DigitalSignatureValue>();
        }
        return this.digitalSignatureValue;
    }

    /**
     * Gets the value of the compressionFlag property.
     * 
     */
    public boolean isCompressionFlag() {
        return compressionFlag;
    }

    /**
     * Sets the value of the compressionFlag property.
     * 
     */
    public void setCompressionFlag(boolean value) {
        this.compressionFlag = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iho.int/s100/se/5.2}S100_SE_DigitalSignature"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "s100SEDigitalSignature"
    })
    public static class DigitalSignatureValue {

        @XmlElementRef(name = "S100_SE_DigitalSignature", namespace = "http://www.iho.int/s100/se/5.2", type = JAXBElement.class)
        protected JAXBElement<? extends S100SEDigitalSignature> s100SEDigitalSignature;

        /**
         * Gets the value of the s100SEDigitalSignature property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link S100SEDigitalSignature }{@code >}
         *     {@link JAXBElement }{@code <}{@link S100SESignatureOnData }{@code >}
         *     {@link JAXBElement }{@code <}{@link S100SESignatureOnSignature }{@code >}
         *     
         */
        public JAXBElement<? extends S100SEDigitalSignature> getS100SEDigitalSignature() {
            return s100SEDigitalSignature;
        }

        /**
         * Sets the value of the s100SEDigitalSignature property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link S100SEDigitalSignature }{@code >}
         *     {@link JAXBElement }{@code <}{@link S100SESignatureOnData }{@code >}
         *     {@link JAXBElement }{@code <}{@link S100SESignatureOnSignature }{@code >}
         *     
         */
        public void setS100SEDigitalSignature(JAXBElement<? extends S100SEDigitalSignature> value) {
            this.s100SEDigitalSignature = value;
        }

    }

}
