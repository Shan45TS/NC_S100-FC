//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:22:14 PM PDT 
//


package _int.iho.s100fc._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_FC_ComplexAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_FC_ComplexAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100FC/5.2}S100_FC_Attribute"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subAttributeBinding" type="{http://www.iho.int/S100FC/5.2}S100_FC_AttributeBinding" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_FC_ComplexAttribute", propOrder = {
    "subAttributeBinding"
})
public class S100FCComplexAttribute
    extends S100FCAttribute
{

    @XmlElement(required = true)
    protected List<S100FCAttributeBinding> subAttributeBinding;

    /**
     * Gets the value of the subAttributeBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subAttributeBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAttributeBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100FCAttributeBinding }
     * 
     * 
     */
    public List<S100FCAttributeBinding> getSubAttributeBinding() {
        if (subAttributeBinding == null) {
            subAttributeBinding = new ArrayList<S100FCAttributeBinding>();
        }
        return this.subAttributeBinding;
    }

}
