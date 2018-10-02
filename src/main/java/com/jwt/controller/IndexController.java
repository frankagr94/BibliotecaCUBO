/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.controller;

import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Frank
 */
@Controller("/index")
public class IndexController {
    
    @RequestMapping(value = "/")
	public ModelAndView Raiz(ModelAndView model) throws IOException {
		model.setViewName("login");
		return model;
	}
        
    @RequestMapping(value = "/principal")
	public ModelAndView Principal(ModelAndView model) throws IOException {
		model.setViewName("index");
		return model;
	}
    
}
