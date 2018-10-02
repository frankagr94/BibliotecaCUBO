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
 * @author ely
 */
@Controller("/inventariolibro")
public class InventarioLibroController {
     @RequestMapping(value = "/inventariolibro")
	public ModelAndView Raiz(ModelAndView model) throws IOException {
		model.setViewName("inventariolibro");
		return model;
	}
}
