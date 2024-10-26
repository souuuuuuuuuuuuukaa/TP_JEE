
package proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour etudiant complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="etudiant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filiere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nomComplet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etudiant", propOrder = {
    "cin",
    "dateNaissance",
    "filiere",
    "id",
    "nomComplet"
})
public class Etudiant {

    @XmlElement(name = "CIN")
    protected String cin;
    protected String dateNaissance;
    protected String filiere;
    protected int id;
    protected String nomComplet;

    /**
     * Obtient la valeur de la propri�t� cin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIN() {
        return cin;
    }

    /**
     * D�finit la valeur de la propri�t� cin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIN(String value) {
        this.cin = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateNaissance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateNaissance() {
        return dateNaissance;
    }

    /**
     * D�finit la valeur de la propri�t� dateNaissance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateNaissance(String value) {
        this.dateNaissance = value;
    }

    /**
     * Obtient la valeur de la propri�t� filiere.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiliere() {
        return filiere;
    }

    /**
     * D�finit la valeur de la propri�t� filiere.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiliere(String value) {
        this.filiere = value;
    }

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� nomComplet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomComplet() {
        return nomComplet;
    }

    /**
     * D�finit la valeur de la propri�t� nomComplet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomComplet(String value) {
        this.nomComplet = value;
    }

}
