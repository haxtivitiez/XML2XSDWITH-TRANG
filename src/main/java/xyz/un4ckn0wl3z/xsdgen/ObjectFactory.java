//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.06 at 04:27:10 PM ICT 
//


package xyz.un4ckn0wl3z.xsdgen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xyz.un4ckn0wl3z.xsdgen package. 
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

    private final static QName _Desc_QNAME = new QName("http://tempuri.org/", "Desc");
    private final static QName _Code_QNAME = new QName("http://tempuri.org/", "Code");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xyz.un4ckn0wl3z.xsdgen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CardStatusBankResponse }
     * 
     */
    public CardStatusBankResponse createCardStatusBankResponse() {
        return new CardStatusBankResponse();
    }

    /**
     * Create an instance of {@link CardStatusBankResult }
     * 
     */
    public CardStatusBankResult createCardStatusBankResult() {
        return new CardStatusBankResult();
    }

    /**
     * Create an instance of {@link Envelope }
     * 
     */
    public Envelope createEnvelope() {
        return new Envelope();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Desc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDesc(String value) {
        return new JAXBElement<String>(_Desc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Code")
    public JAXBElement<Integer> createCode(Integer value) {
        return new JAXBElement<Integer>(_Code_QNAME, Integer.class, null, value);
    }

}
