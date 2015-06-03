package insert;

import backend.IndexManager;
import backend.IndexManagerService;
import backend.KategoriaEntity;
import backend.KategorieEntity;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Marek on 2015-05-30.
 * Bean managing categories
 */
@ManagedBean
@ViewScoped
public class CategoryBean implements Serializable {
    private IndexManager indexManager;

    @PostConstruct
    public void prepare() {
        indexManager = new IndexManagerService().getIndexManagerPort();
        types = indexManager.getCategoryTypes();
        if (types.size() > 0) {
            attributeDescription = types.get(0).getAtrybut();
        }
    }

    public String sendData() {
        KategoriaEntity kategoria = new KategoriaEntity();
        kategoria.setWartosc(attribute);
        kategoria.setTyp(type);
        indexManager.addCategory(kategoria);

        return "saved";
    }

    private Integer attribute;
    private String attributeDescription;
    private List<KategorieEntity> types;
    private KategorieEntity type;

    public List<KategorieEntity> getTypes() {
        return types;
    }

    public KategorieEntity getType() {
        return type;
    }

    public void setType(KategorieEntity type) {
        if (type != null) {
            System.out.println("type set to " + type.getNazwa() + " " + type.getAtrybut());
        } else {
            System.out.println("nul!!!!!!");
        }
        this.type = type;
    }

    public Integer getAttribute() {
        return attribute;
    }

    public void setAttribute(Integer attribute) {
        System.out.println("ustawienie atrybutu");
        this.attribute = attribute;
    }

    public String getAttributeDescription() {
        System.out.println("odczyt opisu atrybutu");
        return attributeDescription;
    }

    public void changeType(AjaxBehaviorEvent event) {
        System.out.println("zmieñ typ " + type.getAtrybut());
        attributeDescription = type.getAtrybut();
    }

    public String change(KategorieEntity entity) {
        changeType(null);
        return entity.getNazwa();
    }
}
