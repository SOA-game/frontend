
package backend;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kategoriaEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kategoriaEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elementy" type="{http://test}elementEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="typ" type="{http://test}kategorieEntity" minOccurs="0"/>
 *         &lt;element name="wartosc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kategoriaEntity", propOrder = {
    "elementy",
    "id",
    "typ",
    "wartosc"
})
public class KategoriaEntity {

    @XmlElement(nillable = true)
    protected List<ElementEntity> elementy;
    protected int id;
    protected KategorieEntity typ;
    protected int wartosc;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof KategoriaEntity) {
            KategoriaEntity entity = (KategoriaEntity) obj;
            System.out.println(id + "=" + entity.getId() + ", " +
                    typ + "=" + entity.typ + ", " +
                    wartosc + "=" + entity.wartosc + ", " +
                    elementy + "=" + entity.elementy);
            return id == entity.id;
        } else {
            System.out.println("inny walidator");
            return super.equals(obj);
        }
    }

    /**
     * Gets the value of the elementy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementEntity }
     * 
     * 
     */
    public List<ElementEntity> getElementy() {
        if (elementy == null) {
            elementy = new ArrayList<ElementEntity>();
        }
        return this.elementy;
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
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link KategorieEntity }
     *     
     */
    public KategorieEntity getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link KategorieEntity }
     *     
     */
    public void setTyp(KategorieEntity value) {
        this.typ = value;
    }

    /**
     * Gets the value of the wartosc property.
     * 
     */
    public int getWartosc() {
        return wartosc;
    }

    /**
     * Sets the value of the wartosc property.
     * 
     */
    public void setWartosc(int value) {
        this.wartosc = value;
    }

}
