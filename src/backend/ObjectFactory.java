
package backend;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the backend package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddCategoryResponse_QNAME = new QName("http://test", "addCategoryResponse");
    private final static QName _GetCategoryEntity_QNAME = new QName("http://test", "getCategoryEntity");
    private final static QName _GetElementTypes_QNAME = new QName("http://test", "getElementTypes");
    private final static QName _GetElementTypesResponse_QNAME = new QName("http://test", "getElementTypesResponse");
    private final static QName _GetCategoryEntityResponse_QNAME = new QName("http://test", "getCategoryEntityResponse");
    private final static QName _AddElementResponse_QNAME = new QName("http://test", "addElementResponse");
    private final static QName _GetCategoryTypes_QNAME = new QName("http://test", "getCategoryTypes");
    private final static QName _AddElement_QNAME = new QName("http://test", "addElement");
    private final static QName _AddCategory_QNAME = new QName("http://test", "addCategory");
    private final static QName _GetCategories_QNAME = new QName("http://test", "getCategories");
    private final static QName _GetCategoryTypesResponse_QNAME = new QName("http://test", "getCategoryTypesResponse");
    private final static QName _GetCategoriesResponse_QNAME = new QName("http://test", "getCategoriesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: backend
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddElementResponse }
     * 
     */
    public AddElementResponse createAddElementResponse() {
        return new AddElementResponse();
    }

    /**
     * Create an instance of {@link GetCategoryTypes }
     * 
     */
    public GetCategoryTypes createGetCategoryTypes() {
        return new GetCategoryTypes();
    }

    /**
     * Create an instance of {@link AddElement }
     * 
     */
    public AddElement createAddElement() {
        return new AddElement();
    }

    /**
     * Create an instance of {@link GetCategories }
     * 
     */
    public GetCategories createGetCategories() {
        return new GetCategories();
    }

    /**
     * Create an instance of {@link AddCategory }
     * 
     */
    public AddCategory createAddCategory() {
        return new AddCategory();
    }

    /**
     * Create an instance of {@link GetCategoryTypesResponse }
     * 
     */
    public GetCategoryTypesResponse createGetCategoryTypesResponse() {
        return new GetCategoryTypesResponse();
    }

    /**
     * Create an instance of {@link GetCategoriesResponse }
     * 
     */
    public GetCategoriesResponse createGetCategoriesResponse() {
        return new GetCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetElementTypesResponse }
     * 
     */
    public GetElementTypesResponse createGetElementTypesResponse() {
        return new GetElementTypesResponse();
    }

    /**
     * Create an instance of {@link GetElementTypes }
     * 
     */
    public GetElementTypes createGetElementTypes() {
        return new GetElementTypes();
    }

    /**
     * Create an instance of {@link GetCategoryEntity }
     * 
     */
    public GetCategoryEntity createGetCategoryEntity() {
        return new GetCategoryEntity();
    }

    /**
     * Create an instance of {@link AddCategoryResponse }
     * 
     */
    public AddCategoryResponse createAddCategoryResponse() {
        return new AddCategoryResponse();
    }

    /**
     * Create an instance of {@link GetCategoryEntityResponse }
     * 
     */
    public GetCategoryEntityResponse createGetCategoryEntityResponse() {
        return new GetCategoryEntityResponse();
    }

    /**
     * Create an instance of {@link KategorieEntity }
     * 
     */
    public KategorieEntity createKategorieEntity() {
        return new KategorieEntity();
    }

    /**
     * Create an instance of {@link ElementEntity }
     * 
     */
    public ElementEntity createElementEntity() {
        return new ElementEntity();
    }

    /**
     * Create an instance of {@link KategoriaEntity }
     * 
     */
    public KategoriaEntity createKategoriaEntity() {
        return new KategoriaEntity();
    }

    /**
     * Create an instance of {@link ElementyEntity }
     * 
     */
    public ElementyEntity createElementyEntity() {
        return new ElementyEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test", name = "addCategoryResponse")
    public JAXBElement<AddCategoryResponse> createAddCategoryResponse(AddCategoryResponse value) {
        return new JAXBElement<AddCategoryResponse>(_AddCategoryResponse_QNAME, AddCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test", name = "getCategoryEntity")
    public JAXBElement<GetCategoryEntity> createGetCategoryEntity(GetCategoryEntity value) {
        return new JAXBElement<GetCategoryEntity>(_GetCategoryEntity_QNAME, GetCategoryEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetElementTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test", name = "getElementTypes")
    public JAXBElement<GetElementTypes> createGetElementTypes(GetElementTypes value) {
        return new JAXBElement<GetElementTypes>(_GetElementTypes_QNAME, GetElementTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetElementTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test", name = "getElementTypesResponse")
    public JAXBElement<GetElementTypesResponse> createGetElementTypesResponse(GetElementTypesResponse value) {
        return new JAXBElement<GetElementTypesResponse>(_GetElementTypesResponse_QNAME, GetElementTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test", name = "getCategoryEntityResponse")
    public JAXBElement<GetCategoryEntityResponse> createGetCategoryEntityResponse(GetCategoryEntityResponse value) {
        return new JAXBElement<GetCategoryEntityResponse>(_GetCategoryEntityResponse_QNAME, GetCategoryEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddElementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test", name = "addElementResponse")
    public JAXBElement<AddElementResponse> createAddElementResponse(AddElementResponse value) {
        return new JAXBElement<AddElementResponse>(_AddElementResponse_QNAME, AddElementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test", name = "getCategoryTypes")
    public JAXBElement<GetCategoryTypes> createGetCategoryTypes(GetCategoryTypes value) {
        return new JAXBElement<GetCategoryTypes>(_GetCategoryTypes_QNAME, GetCategoryTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test", name = "addElement")
    public JAXBElement<AddElement> createAddElement(AddElement value) {
        return new JAXBElement<AddElement>(_AddElement_QNAME, AddElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test", name = "addCategory")
    public JAXBElement<AddCategory> createAddCategory(AddCategory value) {
        return new JAXBElement<AddCategory>(_AddCategory_QNAME, AddCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test", name = "getCategories")
    public JAXBElement<GetCategories> createGetCategories(GetCategories value) {
        return new JAXBElement<GetCategories>(_GetCategories_QNAME, GetCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test", name = "getCategoryTypesResponse")
    public JAXBElement<GetCategoryTypesResponse> createGetCategoryTypesResponse(GetCategoryTypesResponse value) {
        return new JAXBElement<GetCategoryTypesResponse>(_GetCategoryTypesResponse_QNAME, GetCategoryTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test", name = "getCategoriesResponse")
    public JAXBElement<GetCategoriesResponse> createGetCategoriesResponse(GetCategoriesResponse value) {
        return new JAXBElement<GetCategoriesResponse>(_GetCategoriesResponse_QNAME, GetCategoriesResponse.class, null, value);
    }

}
