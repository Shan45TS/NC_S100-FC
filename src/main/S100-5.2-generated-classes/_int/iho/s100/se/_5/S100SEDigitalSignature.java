//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:21:01 PM PDT 
//


package _int.iho.s100.se._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *         Type contains the signature value, an identifier and a reference to the certificate that contains the public key.
 *         The value is an base64 encoded ASN.1
 *         Dss-Sig-Value  ::=  SEQUENCE  {
 *         r       INTEGER,
 *         s       INTEGER  }
 *       
 * 
 * <p>Java class for S100_SE_DigitalSignature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_SE_DigitalSignature"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;base64Binary"&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="certificateRef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_SE_DigitalSignature", propOrder = {
    "value"
})
@XmlSeeAlso({
    S100SESignatureOnSignature.class,
    S100SESignatureOnData.class,
    S100SEDigitalSignaturePropertyType.class
})
public class S100SEDigitalSignature {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "certificateRef", required = true)
    protected String certificateRef;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the certificateRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateRef() {
        return certificateRef;
    }

    /**
     * Sets the value of the certificateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateRef(String value) {
        this.certificateRef = value;
    }

}
