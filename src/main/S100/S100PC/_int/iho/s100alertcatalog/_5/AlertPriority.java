//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.s100alertcatalog._5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AlertPriority"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Alarm"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Caution"/&gt;
 *     &lt;enumeration value="Indication"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AlertPriority")
@XmlEnum
public enum AlertPriority {


    /**
     * Indicates conditions requiring immediate attention and action by the bridge team (refer
     * 				to MSC.252(83) 19.1.2)
     * 
     */
    @XmlEnumValue("Alarm")
    ALARM("Alarm"),

    /**
     * Indicates changed conditions and should be presented for precautionary reasons
     * 				which are not immediately hazardous but which may become so, if no action is taken
     * 				(refer to MSC.252(83) 19.1.3)
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning"),

    /**
     * Indicates a condition which does not warrant an alarm or warning condition, but still
     * 				requires attention and out of the ordinary consideration of the situation or of given
     * 				information (refer to MSC.252(83) 19.1.4)
     * 
     */
    @XmlEnumValue("Caution")
    CAUTION("Caution"),

    /**
     * Display of regular information and conditions (refer to MSC.252(83) appendix 1)
     * 
     */
    @XmlEnumValue("Indication")
    INDICATION("Indication");
    private final String value;

    AlertPriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertPriority fromValue(String v) {
        for (AlertPriority c: AlertPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
