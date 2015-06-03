package utils.converters;

import backend.IndexManager;
import backend.IndexManagerService;
import backend.KategorieEntity;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Marek on 2015-06-02.
 * holds map locally to avoid frequesnt DB queries
 */
@Stateful
public class CategoryTypeConverterBean {
    private HashMap<String, KategorieEntity> typesMap;

    @PostConstruct
    public void prepare() {
        IndexManager indexManager = new IndexManagerService().getIndexManagerPort();
        typesMap = new HashMap<>();

        List<KategorieEntity> types = indexManager.getCategoryTypes();
        for (KategorieEntity type : types) {
            typesMap.put(type.getNazwa(), type);
        }
    }

    public KategorieEntity getKategorie(String name) {
        System.out.println("mam kategorie: " + typesMap);
        System.out.println(name);
        return typesMap.get(name);
    }
}
