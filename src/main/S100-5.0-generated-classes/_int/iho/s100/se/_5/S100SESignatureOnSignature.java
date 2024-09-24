//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:20:02 PM PDT 
//


package _int.iho.s100.se._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_SE_SignatureOnSignature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_SE_SignatureOnSignature"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.iho.int/s100/se/5.0&gt;S100_SE_DigitalSignature"&gt;
 *       &lt;attribute name="signatureRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_SE_SignatureOnSignature")
public class S100SESignatureOnSignature
    extends S100SEDigitalSignature
{

    @XmlAttribute(name = "signatureRef")
    protected String signatureRef;

    /**
     * Gets the value of the signatureRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureRef() {
        return signatureRef;
    }

    /**
     * Sets the value of the signatureRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureRef(String value) {
        this.signatureRef = value;
    }

}
