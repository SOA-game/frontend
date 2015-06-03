package utils.converters;

import backend.ElementyEntity;
import backend.IndexManager;
import backend.IndexManagerService;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Marek on 2015-06-03.
 * holds map locally to avoid frequesnt DB queries
 */
@Stateful
public class ElementTypeConvertrBean {

    private HashMap<String, ElementyEntity> typesMap;

    @PostConstruct
    public void prepare() {
        IndexManager indexManager = new IndexManagerService().getIndexManagerPort();
        typesMap = new HashMap<>();

        List<ElementyEntity> types = indexManager.getElementTypes();
        for (ElementyEntity type : types) {
            typesMap.put(type.getNazwa(), type);
        }

    }

    public ElementyEntity get(String name) {
        return typesMap.get(name);
    }
}
