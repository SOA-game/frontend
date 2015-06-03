import backend.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by Marek on 2015-05-28.
 *
 */
@ManagedBean
@SessionScoped
public class IsertBean {
    private String name;
    private String attribute1;
    private String attribute2;

    public void sendCategoryType() {
//        KategorieEntity categoryType = new KategorieEntity();
//        categoryType.setAtrybut(attribute1);
//        categoryType.setNazwa(name);
//        indexManager.addCategoryType(categoryType);
    }

    public void sendElementType() {
        ElementyEntity elementy = new ElementyEntity();
        elementy.setAtrybut1(attribute1);
        elementy.setAtrybut2(attribute2);
        elementy.setNazwa(name);

//        indexManager.addElementType(elementy);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute) {
        this.attribute1 = attribute;
    }

    private static IndexManager indexManager = new IndexManagerService().getIndexManagerPort();

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }
}
