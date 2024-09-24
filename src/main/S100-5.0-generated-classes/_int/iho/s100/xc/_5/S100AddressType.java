//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:20:02 PM PDT 
//


package _int.iho.s100.xc._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.cit._2.CIAddressType;


/**
 * address type, derived from CI_Address
 * 
 * <p>Java class for S100_Address_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_Address_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/cit/2.0}CI_Address_Type"&gt;
 *       &lt;attribute ref="{http://standards.iso.org/iso/19115/-3/gco/1.0}isoType default="cit:CI_Address""/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_Address_Type")
public class S100AddressType
    extends CIAddressType
{

    @XmlAttribute(name = "isoType", namespace = "http://standards.iso.org/iso/19115/-3/gco/1.0")
    protected String isoType;

    /**
     * Gets the value of the isoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoType() {
        if (isoType == null) {
            return "cit:CI_Address";
        } else {
            return isoType;
        }
    }

    /**
     * Sets the value of the isoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoType(String value) {
        this.isoType = value;
    }

}
