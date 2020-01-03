/*
 * Copyright 2019 (C) by Julian Horner.
 * All Rights Reserved.
 */

package de.rtuni.ms.ds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller that handles all requests for the dummy service.
 * 
 * @author Julian
 *
 */
@Controller
public class HomeController {
    //---------------------------------------------------------------------------------------------
    
    /**
     * Catch the request for the start page and return the name of the corresponding
     * template.
     * 
     * @return The name of the template to show
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     * Catch the request for the secure page and return the name of the corresponding
     * template.
     * 
     * @return The name of the template to show
     */
    @RequestMapping("/securedPage")
    public String securedPage() {
        return "securedPage";
    }

    //---------------------------------------------------------------------------------------------
}