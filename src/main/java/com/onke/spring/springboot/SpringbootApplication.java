package com.onke.spring.springboot;

import com.onke.spring.springboot.wsdl.CountriesPortService;
import com.onke.spring.springboot.wsdl.CountryPort;
import com.onke.spring.springboot.wsdl.GetCountryRequest;
import com.onke.spring.springboot.wsdl.GetCountryResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Currency;

import static java.lang.System.out;
@SpringBootApplication
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
    @Bean
    public RestTemplate GitApi(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    CommandLineRunner find() throws MalformedURLException {
        URL url = new URL("http://localhost:9090/ws/countries.wsdl");


        CountriesPortService employee_Service = new CountriesPortService(url);
        CountryPort employeeServiceProxy = employee_Service.getCountriesPortSoap11();

        GetCountryRequest request = new GetCountryRequest();
        request.setName("United Kingdom");

        GetCountryResponse response = employeeServiceProxy.getCountry(request);

        Currency currency = response.getCountry().getCurrency();
        String capital = response.getCountry().getCapital();
        int population = response.getCountry().getPopulation();


        out.println(" currency " +currency);
        out.println("capital "   +capital);
        out.println("population "+population);

        return null;
    }
}
