package com.example.producer.controller;

import com.example.producer.domain.MyAwesomeEntity;
import com.example.producerlib.Endpoints;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author: fabian.wilms
 */
@Controller
@RequestMapping(value = Endpoints.MyAwesomeEntityEndpoint)
public class EntityEndpointController {

    private final Random r = new Random(System.currentTimeMillis());

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<MyAwesomeEntity> getMyAwesomeEntity(@RequestParam(Endpoints.MyAwesomeEntityParam) String param) {
        MyAwesomeEntity myAwesomeEntity = new MyAwesomeEntity(param, r.nextInt(), LocalDateTime.of(1912, 04, 12, 15, 46, 23));
        return new ResponseEntity<>(myAwesomeEntity, HttpStatus.OK);
    }

}
