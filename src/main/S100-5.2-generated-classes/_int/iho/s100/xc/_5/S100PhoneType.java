//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:21:01 PM PDT 
//


package _int.iho.s100.xc._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.cit._2.CITelephoneType;


/**
 * phone type, derived from CI_Telephone
 * 
 * <p>Java class for S100_Phone_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_Phone_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/cit/2.0}CI_Telephone_Type"&gt;
 *       &lt;attribute ref="{http://standards.iso.org/iso/19115/-3/gco/1.0}isoType default="cit:CI_Telephone""/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_Phone_Type")
public class S100PhoneType
    extends CITelephoneType
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
            return "cit:CI_Telephone";
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
