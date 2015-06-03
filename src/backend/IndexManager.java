
package backend;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IndexManager", targetNamespace = "http://test")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IndexManager {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeCategory", targetNamespace = "http://test", className = "backend.RemoveCategory")
    @ResponseWrapper(localName = "removeCategoryResponse", targetNamespace = "http://test", className = "backend.RemoveCategoryResponse")
    public void removeCategory(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<backend.KategorieEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCategoryTypes", targetNamespace = "http://test", className = "backend.GetCategoryTypes")
    @ResponseWrapper(localName = "getCategoryTypesResponse", targetNamespace = "http://test", className = "backend.GetCategoryTypesResponse")
    public List<KategorieEntity> getCategoryTypes();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeElement", targetNamespace = "http://test", className = "backend.RemoveElement")
    @ResponseWrapper(localName = "removeElementResponse", targetNamespace = "http://test", className = "backend.RemoveElementResponse")
    public void removeElement(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns backend.KategoriaEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCategoryEntity", targetNamespace = "http://test", className = "backend.GetCategoryEntity")
    @ResponseWrapper(localName = "getCategoryEntityResponse", targetNamespace = "http://test", className = "backend.GetCategoryEntityResponse")
    public KategoriaEntity getCategoryEntity(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addCategory", targetNamespace = "http://test", className = "backend.AddCategory")
    @ResponseWrapper(localName = "addCategoryResponse", targetNamespace = "http://test", className = "backend.AddCategoryResponse")
    public void addCategory(
        @WebParam(name = "arg0", targetNamespace = "")
        KategoriaEntity arg0);

    /**
     * 
     * @return
     *     returns java.util.List<backend.ElementyEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getElementTypes", targetNamespace = "http://test", className = "backend.GetElementTypes")
    @ResponseWrapper(localName = "getElementTypesResponse", targetNamespace = "http://test", className = "backend.GetElementTypesResponse")
    public List<ElementyEntity> getElementTypes();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addElement", targetNamespace = "http://test", className = "backend.AddElement")
    @ResponseWrapper(localName = "addElementResponse", targetNamespace = "http://test", className = "backend.AddElementResponse")
    public void addElement(
        @WebParam(name = "arg0", targetNamespace = "")
        ElementEntity arg0);

    /**
     * 
     * @return
     *     returns java.util.List<backend.KategoriaEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCategories", targetNamespace = "http://test", className = "backend.GetCategories")
    @ResponseWrapper(localName = "getCategoriesResponse", targetNamespace = "http://test", className = "backend.GetCategoriesResponse")
    public List<KategoriaEntity> getCategories();

}
