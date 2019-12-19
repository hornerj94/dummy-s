/*
 * Copyright 2019 (C) by Julian Horner.
 * All Rights Reserved.
 */

package de.rtuni.ms.ds;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class that handles all kind of requests.
 * 
 * @author Julian
 *
 */
@Controller
public class HomeController {
    //---------------------------------------------------------------------------------------------
    
    /**
     * Catches the request for the start page and returns the name of the corresponding template.
     * 
     * @return The name of the template
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     * Catches the request for the secure page and returns the name of the corresponding template.
     * 
     * @return The name of the template
     */
    @RequestMapping("/securedPage")
    public String securedPage() {
        return "securedPage";
    }

    /**
     * Catches the request for the login page and returns the name of the corresponding template.
     * 
     * @return The name of the template
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    //---------------------------------------------------------------------------------------------
}