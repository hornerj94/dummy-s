/*
 * Copyright 2019 (C) by Julian Horner.
 * All Rights Reserved.
 */

package de.rtuni.ms.ds;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Dummy controller.
 * 
 * @author Julian
 *
 */
@RestController
public class DummyController {
    //---------------------------------------------------------------------------------------------
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from SB";
    }
    
    //---------------------------------------------------------------------------------------------
}
