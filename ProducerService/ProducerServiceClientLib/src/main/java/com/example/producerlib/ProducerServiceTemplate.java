package com.example.producerlib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author: fabian.wilms
 */
@Service
public class ProducerServiceTemplate<T> {

    @Autowired
    RestTemplate restTemplate;

    @Value("${producerservice.basepath}")
    String basePath;

    public ResponseEntity<T> getMyAwesomeEntity(String param, Class<T> returnClazz) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(basePath + Endpoints.MyAwesomeEntityEndpoint)
                .queryParam(Endpoints.MyAwesomeEntityParam, param);
        return restTemplate.getForEntity(builder.toUriString(), returnClazz);
    }

}
