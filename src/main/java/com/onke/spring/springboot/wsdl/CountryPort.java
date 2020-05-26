package com.onke.spring.springboot.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

import javax.naming.spi.ObjectFactory;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "CountriesPort", targetNamespace = "http://spring.io/guides/gs-producing-web-service")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
        ObjectFactory.class
})
public class CountryPort {
    @WebMethod
    @WebResult(name = "getCountryResponse", targetNamespace = "http://spring.io/guides/gs-producing-web-service", partName = "getCountryResponse")
    public GetCountryResponse getCountry(
            @WebParam(name = "getCountryRequest", targetNamespace = "http://spring.io/guides/gs-producing-web-service", partName = "getCountryRequest")
                    GetCountryRequest getCountryRequest) {
        return null;
    }
}
