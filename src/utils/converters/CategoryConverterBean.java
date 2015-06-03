package utils.converters;

import backend.IndexManager;
import backend.IndexManagerService;
import backend.KategoriaEntity;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Marek on 2015-06-01.
 *
 */
@Stateful
public class CategoryConverterBean {
    private HashMap<String, KategoriaEntity> categoryMap;

    @PostConstruct
    public void prepare() {
        IndexManager indexManager = new IndexManagerService().getIndexManagerPort();
        categoryMap = new HashMap<>();

        List<KategoriaEntity> categories = indexManager.getCategories();
        for (KategoriaEntity category : categories) {
            categoryMap.put(category.getTyp().getNazwa() + " " + category.getWartosc(), category);
        }
    }

    public KategoriaEntity getKategoria(String name) {
        return categoryMap.get(name);
    }
}
