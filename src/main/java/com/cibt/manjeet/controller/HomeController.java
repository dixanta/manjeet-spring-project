/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.manjeet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author USER
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "index";
    }
    
    @RequestMapping(value="/about",method = RequestMethod.GET)
    public String about(){
        return "about";
    }
}
