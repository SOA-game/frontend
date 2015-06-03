import backend.IndexManager;
import backend.IndexManagerService;
import backend.KategoriaEntity;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

/**
 * Created by Marek on 2015-06-01.
 *
 */
@ManagedBean
@RequestScoped
public class IndexBean {

    private IndexManager indexManager;

    @PostConstruct
    public void prepare() {
        indexManager = new IndexManagerService().getIndexManagerPort();
    }

    public List<KategoriaEntity> getCategories() {
        return indexManager.getCategories();
    }

    public String delete(KategoriaEntity entity) {


        return null;
    }
}
