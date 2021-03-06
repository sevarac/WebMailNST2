
package ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "wst", targetNamespace = "http://ws/", wsdlLocation = "file:/C:/Users/P/Documents/NetBeansProjects/WebMailNST2/src/wsdl/localhost_8080/WebmailS/wst.wsdl")
public class Wst
    extends Service
{

    private final static URL WST_WSDL_LOCATION;
    private final static WebServiceException WST_EXCEPTION;
    private final static QName WST_QNAME = new QName("http://ws/", "wst");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/P/Documents/NetBeansProjects/WebMailNST2/src/wsdl/localhost_8080/WebmailS/wst.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WST_WSDL_LOCATION = url;
        WST_EXCEPTION = e;
    }

    public Wst() {
        super(__getWsdlLocation(), WST_QNAME);
    }

    public Wst(WebServiceFeature... features) {
        super(__getWsdlLocation(), WST_QNAME, features);
    }

    public Wst(URL wsdlLocation) {
        super(wsdlLocation, WST_QNAME);
    }

    public Wst(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WST_QNAME, features);
    }

    public Wst(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Wst(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServiceTest
     */
    @WebEndpoint(name = "WebServiceTestPort")
    public WebServiceTest getWebServiceTestPort() {
        return super.getPort(new QName("http://ws/", "WebServiceTestPort"), WebServiceTest.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceTest
     */
    @WebEndpoint(name = "WebServiceTestPort")
    public WebServiceTest getWebServiceTestPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "WebServiceTestPort"), WebServiceTest.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WST_EXCEPTION!= null) {
            throw WST_EXCEPTION;
        }
        return WST_WSDL_LOCATION;
    }

}
