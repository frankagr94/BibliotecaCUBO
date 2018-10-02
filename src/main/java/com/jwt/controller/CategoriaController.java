/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.controller;

import com.jwt.model.Categoria;
import com.jwt.service.CategoriaService;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Frank
 */
@Controller("/categoria")
public class CategoriaController {
    
    private static final Logger logger = Logger
			.getLogger(CategoriaController.class);

	public CategoriaController() {
		System.out.println("CategoriaController()");
	}

	@Autowired
	private CategoriaService categoriaService;

	@RequestMapping(value = "/categoria")
	public ModelAndView listCategoria(ModelAndView model) throws IOException {
		List<Categoria> listCategoria = categoriaService.getAllCategorias();
		model.addObject("listCategoria", listCategoria);
                newCategoria(model);
		model.setViewName("categoria");
		return model;
	}

	@RequestMapping(value = "/newCategoria", method = RequestMethod.GET)
	public ModelAndView newCategoria(ModelAndView model) {
		Categoria categoria = new Categoria();
		model.addObject("categoria", categoria);
		model.setViewName("categoria");
		return model;
	}

	@RequestMapping(value = "/saveCategoria", method = RequestMethod.POST)
	public ModelAndView saveCategoria(@ModelAttribute Categoria categoria) {          
		if (categoria.getCodigo_categoria() == 0) { // if Categoria id is 0 then creating the
			// Categoria other updating the Categoria
                        categoria.setEstatus(1);
			categoriaService.addCategoria(categoria);
		} else {
                    
			categoriaService.updateCategoria(categoria);
		}
		return new ModelAndView("redirect:/categoria");
	}

	@RequestMapping(value = "/deleteCategoria", method = RequestMethod.GET)
	public ModelAndView deleteCategoria(HttpServletRequest request) {
		int categoriaCod = Integer.parseInt(request.getParameter("id"));
		categoriaService.deleteCategoria(categoriaCod);
		return new ModelAndView("redirect:/categoria");
	}

	@RequestMapping(value = "/editCategoria", method = RequestMethod.GET)
	public ModelAndView editCategoria(HttpServletRequest request) throws IOException {
		Integer categoriaCod = Integer.parseInt(request.getParameter("id"));
		Categoria categoria = categoriaService.getCategoria(categoriaCod);
                List<Categoria> listCategoria = categoriaService.getAllCategorias();
		ModelAndView model = new ModelAndView("categoria");
                model.addObject("listCategoria", listCategoria);
		model.addObject("categoria", categoria);
		return model;
	}
        
        @RequestMapping(value = "/changeStatusCategoria", method = RequestMethod.GET)
	public ModelAndView changeStatusCategoria(HttpServletRequest request) {
            Integer categoriaCod = Integer.parseInt(request.getParameter("id"));
            Categoria categoria = categoriaService.getCategoria(categoriaCod);
		if (categoria.getEstatus() == 0) {
                        categoria.setEstatus(1);
			categoriaService.updateCategoria(categoria);
		} else {
                        categoria.setEstatus(0);
			categoriaService.updateCategoria(categoria);
		}
		return new ModelAndView("redirect:/categoria");
	}
    
}
