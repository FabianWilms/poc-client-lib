package com.example.secondconsumer.controller;

import com.example.producerlib.ProducerServiceTemplate;
import com.example.secondconsumer.domain.MyEnhancedEntity;
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
@RequestMapping(value = "getEnhanced")
public class EnhancedController {

    @Autowired
    ProducerServiceTemplate<MyEnhancedEntity> producerServiceTemplate;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<MyEnhancedEntity> getReduced() throws URISyntaxException {
        ResponseEntity<MyEnhancedEntity> myAwesomeEntity = producerServiceTemplate.getMyAwesomeEntity("reduziert!", MyEnhancedEntity.class);
        myAwesomeEntity.getBody().setEnhancement(myAwesomeEntity.getBody().getImportantNumber() + .123);
        return myAwesomeEntity;
    }

}
