package com.example.hometasks.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "value")  //почему-то не работает. Нужно понять почему и исправить
public record ApplicationProperties(String name, String description) {
}
