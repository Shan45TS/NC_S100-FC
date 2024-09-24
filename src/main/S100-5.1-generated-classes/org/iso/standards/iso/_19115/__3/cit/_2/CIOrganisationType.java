//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:44:06 PM PDT 
//


package org.iso.standards.iso._19115.__3.cit._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.mcc._1.MDBrowseGraphicPropertyType;


/**
 * <p>Java class for CI_Organisation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI_Organisation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/cit/2.0}AbstractCI_Party_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="logo" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}MD_BrowseGraphic_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="individual" type="{http://standards.iso.org/iso/19115/-3/cit/2.0}CI_Individual_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Organisation_Type", propOrder = {
    "logo",
    "individual"
})
public class CIOrganisationType
    extends AbstractCIPartyType
{

    protected List<MDBrowseGraphicPropertyType> logo;
    protected List<CIIndividualPropertyType> individual;

    /**
     * Gets the value of the logo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDBrowseGraphicPropertyType }
     * 
     * 
     */
    public List<MDBrowseGraphicPropertyType> getLogo() {
        if (logo == null) {
            logo = new ArrayList<MDBrowseGraphicPropertyType>();
        }
        return this.logo;
    }

    /**
     * Gets the value of the individual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIIndividualPropertyType }
     * 
     * 
     */
    public List<CIIndividualPropertyType> getIndividual() {
        if (individual == null) {
            individual = new ArrayList<CIIndividualPropertyType>();
        }
        return this.individual;
    }

}
