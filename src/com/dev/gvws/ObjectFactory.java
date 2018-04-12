
package com.dev.gvws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dev.gvws package. 
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

    private final static QName _GetVoucherDetailINTO_QNAME = new QName("http://dev.com/voucherdetail", "getVoucherDetail_INTO");
    private final static QName _VoucherDetailTO_QNAME = new QName("http://dev.com/voucherdetail", "voucherDetail_TO");
    private final static QName _VoucherDetailFault_QNAME = new QName("http://dev.com/voucherdetail", "voucherDetailFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dev.gvws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetVoucherDetailINTO }
     * 
     */
    public GetVoucherDetailINTO createGetVoucherDetailINTO() {
        return new GetVoucherDetailINTO();
    }

    /**
     * Create an instance of {@link VoucherDetailFault }
     * 
     */
    public VoucherDetailFault createVoucherDetailFault() {
        return new VoucherDetailFault();
    }

    /**
     * Create an instance of {@link VoucherDetailTO }
     * 
     */
    public VoucherDetailTO createVoucherDetailTO() {
        return new VoucherDetailTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVoucherDetailINTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.com/voucherdetail", name = "getVoucherDetail_INTO")
    public JAXBElement<GetVoucherDetailINTO> createGetVoucherDetailINTO(GetVoucherDetailINTO value) {
        return new JAXBElement<GetVoucherDetailINTO>(_GetVoucherDetailINTO_QNAME, GetVoucherDetailINTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoucherDetailTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.com/voucherdetail", name = "voucherDetail_TO")
    public JAXBElement<VoucherDetailTO> createVoucherDetailTO(VoucherDetailTO value) {
        return new JAXBElement<VoucherDetailTO>(_VoucherDetailTO_QNAME, VoucherDetailTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoucherDetailFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.com/voucherdetail", name = "voucherDetailFault")
    public JAXBElement<VoucherDetailFault> createVoucherDetailFault(VoucherDetailFault value) {
        return new JAXBElement<VoucherDetailFault>(_VoucherDetailFault_QNAME, VoucherDetailFault.class, null, value);
    }

}
