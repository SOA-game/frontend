package utils.converters;

import backend.KategorieEntity;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 * Created by Marek on 2015-06-02.
 *
 */
@ManagedBean
public class CategoryTypeConverter implements Converter {

    @EJB
    CategoryTypeConverterBean bean;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        return bean.getKategorie(s);
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        System.out.println("nos" +
                " " + ((KategorieEntity) o).getNazwa());
        return ((KategorieEntity) o).getNazwa();
    }
}
