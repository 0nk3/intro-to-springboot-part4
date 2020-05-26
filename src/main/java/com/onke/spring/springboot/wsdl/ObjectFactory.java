package com.onke.spring.springboot.wsdl;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: springbootpart3.wsdl
     *
     */
    public ObjectFactory() {

    }

    /**
     * Create an instance of {@link GetCountryRequest }
     *
     */
    public GetCountryRequest createGetCountryRequest() {
        return new GetCountryRequest();
    }

    /**
     * Create an instance of {@link GetCountryResponse }
     *
     */
    public GetCountryResponse createGetCountryResponse() {
        return new GetCountryResponse();
    }

    /**
     * Create an instance of {@link Country }
     *
     */
    public Country createCountry() {
        return new Country();
    }
}
