package utils.converters;

import backend.KategoriaEntity;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 * Created by Marek on 2015-06-01.
 *
 */
@ManagedBean
public class CategoryConverter implements Converter {

    @EJB
    CategoryConverterBean bean;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String name) {
        return bean.getKategoria(name);
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        KategoriaEntity kategoria = (KategoriaEntity) o;
        return kategoria.getTyp().getNazwa() + " " + kategoria.getWartosc();
    }
}
