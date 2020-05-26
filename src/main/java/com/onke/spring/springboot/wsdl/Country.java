package com.onke.spring.springboot.wsdl;

import javax.xml.bind.annotation.*;
import java.util.Currency;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "country", propOrder = {
        "name",
        "population",
        "capital",
        "currency"
})
public class Country {
    @XmlElement(required = true)
    protected String name;
    protected int population;
    @XmlElement(required = true)
    protected String capital;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Currency currency;

    /**
     * Gets the value of the name property.
     * @return
     *     possible object is
     *     {@link String }
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the population property.
     *
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Sets the value of the population property.
     *
     */
    public void setPopulation(int value) {
        this.population = value;
    }

    /**
     * Gets the value of the capital property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Sets the value of the capital property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCapital(String value) {
        this.capital = value;
    }

    /**
     * Gets the value of the currency property.
     *
     * @return
     *     possible object is
     *     {@link Currency }
     *
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     *
     * @param value
     *     allowed object is
     *     {@link Currency }
     *
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }
}
