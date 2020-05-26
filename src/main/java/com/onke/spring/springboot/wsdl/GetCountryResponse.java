package com.onke.spring.springboot.wsdl;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "country"
})
@XmlRootElement(name = "getCountryResponse")
public class GetCountryResponse {
    @XmlElement(required = true)
    protected Country country;

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link Country }
     *
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link Country }
     *
     */
    public void setCountry(Country value) {
        this.country = value;
    }

}
