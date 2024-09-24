//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:20:02 PM PDT 
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
import org.iso.standards.iso._19115.__3.gco._1.CharacterStringPropertyType;
import org.iso.standards.iso._19115.__3.lan._1.PTLocalePropertyType;


/**
 * Metadata about the individual support files in the exchange catalogue.
 * 
 * <p>Java class for S100_SupportFileDiscoveryMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_SupportFileDiscoveryMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="revisionStatus" type="{http://www.iho.int/s100/xc/5.0}S100_SupportFileRevisionStatus"/&gt;
 *         &lt;element name="editionNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="supportFileSpecification" type="{http://www.iho.int/s100/xc/5.0}S100_SupportFileSpecification" minOccurs="0"/&gt;
 *         &lt;element name="dataType" type="{http://www.iho.int/s100/xc/5.0}S100_SupportFileFormat"/&gt;
 *         &lt;element name="otherDataTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="compressionFlag" type="{http://www.iho.int/s100/xc/5.0}RestrictedBoolean"/&gt;
 *         &lt;element name="digitalSignatureReference" type="{http://www.iho.int/s100/se/5.0}S100_SE_DigitalSignatureReference_PropertyType"/&gt;
 *         &lt;element name="digitalSignatureValue" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iho.int/s100/se/5.0}S100_SE_DigitalSignature"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="defaultLocale" type="{http://standards.iso.org/iso/19115/-3/lan/1.0}PT_Locale_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="supportedResource" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="resourcePurpose" type="{http://www.iho.int/s100/xc/5.0}S100_ResourcePurpose" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_SupportFileDiscoveryMetadata", propOrder = {
    "fileName",
    "revisionStatus",
    "editionNumber",
    "issueDate",
    "supportFileSpecification",
    "dataType",
    "otherDataTypeDescription",
    "comment",
    "compressionFlag",
    "digitalSignatureReference",
    "digitalSignatureValue",
    "defaultLocale",
    "supportedResource",
    "resourcePurpose"
})
public class S100SupportFileDiscoveryMetadata {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String fileName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected S100SupportFileRevisionStatus revisionStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger editionNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    protected S100SupportFileSpecification supportFileSpecification;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected S100SupportFileFormat dataType;
    protected String otherDataTypeDescription;
    protected CharacterStringPropertyType comment;
    protected boolean compressionFlag;
    @XmlElement(required = true)
    protected S100SEDigitalSignatureReferencePropertyType digitalSignatureReference;
    @XmlElement(required = true)
    protected List<S100SupportFileDiscoveryMetadata.DigitalSignatureValue> digitalSignatureValue;
    protected PTLocalePropertyType defaultLocale;
    protected List<String> supportedResource;
    @XmlSchemaType(name = "string")
    protected S100ResourcePurpose resourcePurpose;

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
     * Gets the value of the revisionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link S100SupportFileRevisionStatus }
     *     
     */
    public S100SupportFileRevisionStatus getRevisionStatus() {
        return revisionStatus;
    }

    /**
     * Sets the value of the revisionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100SupportFileRevisionStatus }
     *     
     */
    public void setRevisionStatus(S100SupportFileRevisionStatus value) {
        this.revisionStatus = value;
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
     * Gets the value of the supportFileSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link S100SupportFileSpecification }
     *     
     */
    public S100SupportFileSpecification getSupportFileSpecification() {
        return supportFileSpecification;
    }

    /**
     * Sets the value of the supportFileSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100SupportFileSpecification }
     *     
     */
    public void setSupportFileSpecification(S100SupportFileSpecification value) {
        this.supportFileSpecification = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link S100SupportFileFormat }
     *     
     */
    public S100SupportFileFormat getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100SupportFileFormat }
     *     
     */
    public void setDataType(S100SupportFileFormat value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the otherDataTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDataTypeDescription() {
        return otherDataTypeDescription;
    }

    /**
     * Sets the value of the otherDataTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDataTypeDescription(String value) {
        this.otherDataTypeDescription = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setComment(CharacterStringPropertyType value) {
        this.comment = value;
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
     * {@link S100SupportFileDiscoveryMetadata.DigitalSignatureValue }
     * 
     * 
     */
    public List<S100SupportFileDiscoveryMetadata.DigitalSignatureValue> getDigitalSignatureValue() {
        if (digitalSignatureValue == null) {
            digitalSignatureValue = new ArrayList<S100SupportFileDiscoveryMetadata.DigitalSignatureValue>();
        }
        return this.digitalSignatureValue;
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
     * Gets the value of the supportedResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedResource() {
        if (supportedResource == null) {
            supportedResource = new ArrayList<String>();
        }
        return this.supportedResource;
    }

    /**
     * Gets the value of the resourcePurpose property.
     * 
     * @return
     *     possible object is
     *     {@link S100ResourcePurpose }
     *     
     */
    public S100ResourcePurpose getResourcePurpose() {
        return resourcePurpose;
    }

    /**
     * Sets the value of the resourcePurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100ResourcePurpose }
     *     
     */
    public void setResourcePurpose(S100ResourcePurpose value) {
        this.resourcePurpose = value;
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
     *         &lt;element ref="{http://www.iho.int/s100/se/5.0}S100_SE_DigitalSignature"/&gt;
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

        @XmlElementRef(name = "S100_SE_DigitalSignature", namespace = "http://www.iho.int/s100/se/5.0", type = JAXBElement.class)
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
