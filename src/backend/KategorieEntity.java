
package backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kategorieEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kategorieEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atrybut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nazwa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kategorieEntity", propOrder = {
    "atrybut",
    "id",
    "nazwa"
})
public class KategorieEntity {

    protected String atrybut;
    protected int id;
    protected String nazwa;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof KategorieEntity) {
            KategorieEntity entity = (KategorieEntity) obj;
            System.out.println(id + "=" + entity.getId() + ", " +
                          atrybut + "=" + entity.atrybut + ", " +
                            nazwa + "=" + entity.nazwa);
            return id == entity.id;
        } else {
            System.out.println("inny walidator");
            return super.equals(obj);
        }
    }

    /**
     * Gets the value of the atrybut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtrybut() {
        return atrybut;
    }

    /**
     * Sets the value of the atrybut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtrybut(String value) {
        this.atrybut = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the nazwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * Sets the value of the nazwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwa(String value) {
        this.nazwa = value;
    }

}
