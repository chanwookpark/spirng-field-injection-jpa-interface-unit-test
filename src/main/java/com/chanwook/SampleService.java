package com.chanwook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chanwook
 */
@Service
public class SampleService {

    @Autowired
    SampleRepository repository;

    public Sample findOneWithLogic(String name) {
        Sample entity = repository.findByName(name);

        // 로직..

        return entity;
    }
}
