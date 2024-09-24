//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:44:06 PM PDT 
//


package _int.iho.s100.xc._5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_SupportFileRevisionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="S100_SupportFileRevisionStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="new"/&gt;
 *     &lt;enumeration value="replacement"/&gt;
 *     &lt;enumeration value="deletion"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "S100_SupportFileRevisionStatus")
@XmlEnum
public enum S100SupportFileRevisionStatus {


    /**
     * A file which is new
     * 
     */
    @XmlEnumValue("new")
    NEW("new"),

    /**
     * A file which replaces an existing file
     * 
     */
    @XmlEnumValue("replacement")
    REPLACEMENT("replacement"),

    /**
     * Deletes an existing file
     * 
     */
    @XmlEnumValue("deletion")
    DELETION("deletion");
    private final String value;

    S100SupportFileRevisionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static S100SupportFileRevisionStatus fromValue(String v) {
        for (S100SupportFileRevisionStatus c: S100SupportFileRevisionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
