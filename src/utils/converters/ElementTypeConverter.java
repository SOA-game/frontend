package utils.converters;

import backend.ElementyEntity;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 * Created by Marek on 2015-06-03.
 *
 */
@ManagedBean
public class ElementTypeConverter implements javax.faces.convert.Converter {
    @EJB
    ElementTypeConvertrBean bean;


    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String name) {
        return bean.get(name);
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        ElementyEntity entity = (ElementyEntity) o;
        return entity.getNazwa();
    }
}
