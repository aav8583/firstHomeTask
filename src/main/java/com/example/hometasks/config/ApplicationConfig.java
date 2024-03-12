package com.example.hometasks.config;

import org.springframework.web.client.RestTemplate;

//тут нужно сделать класс конфигурацией и как-то пометить наши RestTemplate что бы мы могли их спокойно внедрять и не было конфликтов

public class ApplicationConfig {

    public RestTemplate simpleRestTemplate() {
        return new RestTemplate();
    }


    public RestTemplate hardRestTemplate() {
        return new RestTemplate();
    }
}
