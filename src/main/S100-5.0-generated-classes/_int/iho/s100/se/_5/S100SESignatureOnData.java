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
 * <p>Java class for S100_SE_SignatureOnData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_SE_SignatureOnData"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.iho.int/s100/se/5.0&gt;S100_SE_DigitalSignature"&gt;
 *       &lt;attribute name="dataStatus" type="{http://www.iho.int/s100/se/5.0}DataStatus" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_SE_SignatureOnData")
public class S100SESignatureOnData
    extends S100SEDigitalSignature
{

    @XmlAttribute(name = "dataStatus")
    protected DataStatus dataStatus;

    /**
     * Gets the value of the dataStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DataStatus }
     *     
     */
    public DataStatus getDataStatus() {
        return dataStatus;
    }

    /**
     * Sets the value of the dataStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataStatus }
     *     
     */
    public void setDataStatus(DataStatus value) {
        this.dataStatus = value;
    }

}
