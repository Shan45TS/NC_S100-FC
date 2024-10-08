//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:22:14 PM PDT 
//


package _int.iho.s100ci._5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TelephoneTypeCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="voice"/&gt;
 *     &lt;enumeration value="fax"/&gt;
 *     &lt;enumeration value="sms"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TelephoneTypeCode")
@XmlEnum
public enum TelephoneTypeCode {


    /**
     * telephone provides voice service
     * 
     */
    @XmlEnumValue("voice")
    VOICE("voice"),

    /**
     * telephone provides facsimile service
     * 
     */
    @XmlEnumValue("fax")
    FAX("fax"),

    /**
     * telephone provides sms service
     * 
     */
    @XmlEnumValue("sms")
    SMS("sms");
    private final String value;

    TelephoneTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelephoneTypeCode fromValue(String v) {
        for (TelephoneTypeCode c: TelephoneTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
