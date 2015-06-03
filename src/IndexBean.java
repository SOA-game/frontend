import backend.ElementEntity;
import backend.IndexManager;
import backend.IndexManagerService;
import backend.KategoriaEntity;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.FacesComponent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.beans.beancontext.BeanContext;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Marek on 2015-06-01.
 *
 */
@ManagedBean
@ViewScoped
public class IndexBean implements Serializable {

    @PostConstruct
    public void asd() {
        FacesContext.getCurrentInstance().getExternalContext().getSession(true);
    }

    private IndexManager indexManager;

    @PostConstruct
    public void prepare() {
        indexManager = new IndexManagerService().getIndexManagerPort();
    }

    public List<KategoriaEntity> getCategories() {
        return indexManager.getCategories();
    }

    public String deleteCategory(KategoriaEntity entity) {
        indexManager.removeCategory(entity.getId());
        return null;
    }

    public String deleteElement(ElementEntity entity) {
        indexManager.removeElement(entity.getId());
        return null;
    }
}
