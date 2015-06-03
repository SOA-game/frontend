package insert;

import backend.*;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;
import java.io.Serializable;
import java.util.*;

/**
 * Created by Marek on 2015-05-30.
 * Bean managing categories
 */
@ManagedBean
@ViewScoped
public class ElementBean implements Serializable {

    private List<ElementyEntity> elementTypes;
    private ElementyEntity elementType;

    @PostConstruct
    public void prepare() {
        System.out.println("priper for fajt!!!");
        indexManager = new IndexManagerService().getIndexManagerPort();

//        categories = new ArrayList<>();
        categories = indexManager.getCategories();

        elementTypes = indexManager.getElementTypes();

        if (elementTypes.size() != 0) {
            ElementyEntity entity = elementTypes.get(0);
            attribute1Description = entity.getAtrybut1();
            attribute2Description = entity.getAtrybut2();
        }
    }

    public String sendData() {
        ElementEntity element = new ElementEntity();
        element.setKategoria(category.getId());
        element.setParametr1(attribute1);
        element.setParametr2(attribute2);
        element.setTyp(elementType);
        indexManager.addElement(element);

        return "saved";
    }

    public void changeType(AjaxBehaviorEvent event) {
        attribute1Description = elementType.getAtrybut1();
        attribute2Description = elementType.getAtrybut2();
    }

    private IndexManager indexManager;

    private KategoriaEntity category;
    private List<KategoriaEntity> categories;

    private Integer attribute1;
    private String attribute1Description;

    private String attribute2;
    private String attribute2Description;

    public List<ElementyEntity> getElementTypes() {
        return elementTypes;
    }

    public ElementyEntity getElementType() {
        return elementType;
    }

    public void setElementType(ElementyEntity elementType) {
        this.elementType = elementType;
    }

    public KategoriaEntity getCategory() {
        return category;
    }

    public void setCategory(KategoriaEntity category) {
        this.category = category;
    }

    public List<KategoriaEntity> getCategories() {
        return categories;
    }

    public Integer getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(Integer attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute1Description() {
        return attribute1Description;
    }
    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute2Description() {
        return attribute2Description;
    }
}
