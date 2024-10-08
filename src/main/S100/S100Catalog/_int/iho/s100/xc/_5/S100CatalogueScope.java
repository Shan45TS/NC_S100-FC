//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:27:16 PM PDT 
//


package _int.iho.s100.xc._5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_CatalogueScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="S100_CatalogueScope"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="featureCatalogue"/&gt;
 *     &lt;enumeration value="portrayalCatalogue"/&gt;
 *     &lt;enumeration value="interoperabilityCatalogue"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "S100_CatalogueScope")
@XmlEnum
public enum S100CatalogueScope {


    /**
     * S-100 feature catalogue
     * 
     */
    @XmlEnumValue("featureCatalogue")
    FEATURE_CATALOGUE("featureCatalogue"),

    /**
     * S-100 portrayal catalogue
     * 
     */
    @XmlEnumValue("portrayalCatalogue")
    PORTRAYAL_CATALOGUE("portrayalCatalogue"),

    /**
     * S-100 interoperability information
     * 
     */
    @XmlEnumValue("interoperabilityCatalogue")
    INTEROPERABILITY_CATALOGUE("interoperabilityCatalogue");
    private final String value;

    S100CatalogueScope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static S100CatalogueScope fromValue(String v) {
        for (S100CatalogueScope c: S100CatalogueScope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
