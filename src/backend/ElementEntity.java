
package backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for elementEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elementEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kategoria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parametr1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parametr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typ" type="{http://test}elementyEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elementEntity", propOrder = {
    "id",
    "kategoria",
    "parametr1",
    "parametr2",
    "typ"
})
public class ElementEntity {

    protected int id;
    protected int kategoria;
    protected int parametr1;
    protected String parametr2;
    protected ElementyEntity typ;

    @Override
    public boolean equals(Object obj) {
        ElementEntity entity = (ElementEntity) obj;
        System.out.println(id + "=" + entity.id + ", " +
                    kategoria + "=" + entity.kategoria + ", " +
                    parametr1 + "=" + entity.parametr1 + ", " +
                    parametr2 + "=" + entity.parametr2 + ", " +
                          typ + "=" + entity.typ);
        return id == entity.id;
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
     * Gets the value of the kategoria property.
     * 
     */
    public int getKategoria() {
        return kategoria;
    }

    /**
     * Sets the value of the kategoria property.
     * 
     */
    public void setKategoria(int value) {
        this.kategoria = value;
    }

    /**
     * Gets the value of the parametr1 property.
     * 
     */
    public int getParametr1() {
        return parametr1;
    }

    /**
     * Sets the value of the parametr1 property.
     * 
     */
    public void setParametr1(int value) {
        this.parametr1 = value;
    }

    /**
     * Gets the value of the parametr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametr2() {
        return parametr2;
    }

    /**
     * Sets the value of the parametr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametr2(String value) {
        this.parametr2 = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link ElementyEntity }
     *     
     */
    public ElementyEntity getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementyEntity }
     *     
     */
    public void setTyp(ElementyEntity value) {
        this.typ = value;
    }

}
