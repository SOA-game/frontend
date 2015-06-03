
package backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for elementyEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elementyEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atrybut1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atrybut2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "elementyEntity", propOrder = {
    "atrybut1",
    "atrybut2",
    "id",
    "nazwa"
})
public class ElementyEntity {

    protected String atrybut1;
    protected String atrybut2;
    protected int id;
    protected String nazwa;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ElementyEntity) {
            ElementyEntity entity = (ElementyEntity) obj;
            System.out.println(id +"="+entity.id);
            return id == entity.id;
        }
        System.out.println("inne elementy");
        return super.equals(obj);
    }

    /**
     * Gets the value of the atrybut1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtrybut1() {
        return atrybut1;
    }

    /**
     * Sets the value of the atrybut1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtrybut1(String value) {
        this.atrybut1 = value;
    }

    /**
     * Gets the value of the atrybut2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtrybut2() {
        return atrybut2;
    }

    /**
     * Sets the value of the atrybut2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtrybut2(String value) {
        this.atrybut2 = value;
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
