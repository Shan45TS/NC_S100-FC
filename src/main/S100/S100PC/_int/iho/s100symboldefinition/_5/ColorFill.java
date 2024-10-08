//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.s100symboldefinition._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Class defining a solid colour fill for an area
 * 
 * <p>Java class for ColorFill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColorFill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100SymbolDefinition/5.2}AreaFillBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="color" type="{http://www.iho.int/S100SymbolDefinition/5.2}Color"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorFill", propOrder = {
    "color"
})
public class ColorFill
    extends AreaFillBase
{

    @XmlElement(required = true)
    protected Color color;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link Color }
     *     
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link Color }
     *     
     */
    public void setColor(Color value) {
        this.color = value;
    }

}
