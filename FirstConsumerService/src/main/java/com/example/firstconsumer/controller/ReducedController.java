package com.example.firstconsumer.controller;

import com.example.firstconsumer.domain.MyReducedEntity;
import com.example.producerlib.ProducerServiceTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.URISyntaxException;

/**
 * @author: fabian.wilms
 */
@Controller
@RequestMapping(value = "getReduced")
public class ReducedController {

    @Autowired
    ProducerServiceTemplate<MyReducedEntity> producerServiceTemplate;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<MyReducedEntity> getReduced () throws URISyntaxException {
        return producerServiceTemplate.getMyAwesomeEntity("reduziert!", MyReducedEntity.class);
    }

}
