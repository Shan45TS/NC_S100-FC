//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:21:01 PM PDT 
//


package _int.iho.s100.se._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Elements of this type can be used within the dataset discovery metadata elements of an exchanges set catalogue.
 * 
 * <p>Java class for S100_SE_AdditionalSignature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_SE_AdditionalSignature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="signatureOnSignature" type="{http://www.iho.int/s100/se/5.2}S100_SE_SignatureOnSignature"/&gt;
 *         &lt;element name="signatureOnData" type="{http://www.iho.int/s100/se/5.2}S100_SE_SignatureOnData"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_SE_AdditionalSignature", propOrder = {
    "signatureOnSignature",
    "signatureOnData"
})
public class S100SEAdditionalSignature {

    protected S100SESignatureOnSignature signatureOnSignature;
    protected S100SESignatureOnData signatureOnData;

    /**
     * Gets the value of the signatureOnSignature property.
     * 
     * @return
     *     possible object is
     *     {@link S100SESignatureOnSignature }
     *     
     */
    public S100SESignatureOnSignature getSignatureOnSignature() {
        return signatureOnSignature;
    }

    /**
     * Sets the value of the signatureOnSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100SESignatureOnSignature }
     *     
     */
    public void setSignatureOnSignature(S100SESignatureOnSignature value) {
        this.signatureOnSignature = value;
    }

    /**
     * Gets the value of the signatureOnData property.
     * 
     * @return
     *     possible object is
     *     {@link S100SESignatureOnData }
     *     
     */
    public S100SESignatureOnData getSignatureOnData() {
        return signatureOnData;
    }

    /**
     * Sets the value of the signatureOnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100SESignatureOnData }
     *     
     */
    public void setSignatureOnData(S100SESignatureOnData value) {
        this.signatureOnData = value;
    }

}
