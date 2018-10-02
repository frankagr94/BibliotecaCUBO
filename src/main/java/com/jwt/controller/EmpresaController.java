/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.controller;

import com.jwt.model.Empresa;
import com.jwt.service.EmpresaService;
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
@Controller("/empresa")
public class EmpresaController {
    
    private static final Logger logger = Logger
			.getLogger(EmpresaController.class);

	public EmpresaController() {
		System.out.println("EmpresaController()");
	}

	@Autowired
	private EmpresaService empresaService;

	@RequestMapping(value = "/empresa")
	public ModelAndView listEmpresa(ModelAndView model) throws IOException {
		List<Empresa> listEmpresa = empresaService.getAllEmpresas();
		model.addObject("listEmpresa", listEmpresa);
                newRol(model);
		model.setViewName("empresa");
		return model;
	}

	@RequestMapping(value = "/newEmpresa", method = RequestMethod.GET)
	public ModelAndView newRol(ModelAndView model) {
		Empresa empresa = new Empresa();
		model.addObject("empresa", empresa);
		model.setViewName("empresa");
		return model;
	}

	@RequestMapping(value = "/saveEmpresa", method = RequestMethod.POST)
	public ModelAndView saveEmpresa(@ModelAttribute Empresa empresa) {          
		if (empresa.getCodigo_empresa() == 0) { // if rol id is 0 then creating the
			// rol other updating the rol
                        empresa.setEstatus(1);
			empresaService.addRol(empresa);
		} else {
                    
			empresaService.updateEmpresa(empresa);
		}
		return new ModelAndView("redirect:/empresa");
	}

	@RequestMapping(value = "/deleteEmpresa", method = RequestMethod.GET)
	public ModelAndView deleteEmpresa(HttpServletRequest request) {
		int empresaCod = Integer.parseInt(request.getParameter("id"));
		empresaService.deleteEmpresa(empresaCod);
		return new ModelAndView("redirect:/empresa");
	}

	@RequestMapping(value = "/editEmpresa", method = RequestMethod.GET)
	public ModelAndView editEmpresa(HttpServletRequest request) throws IOException {
		int empresaCod = Integer.parseInt(request.getParameter("id"));
		Empresa empresa = empresaService.getEmpresa(empresaCod);
                List<Empresa> listEmpresa = empresaService.getAllEmpresas();
		ModelAndView model = new ModelAndView("empresa");
                model.addObject("listEmpresa", listEmpresa);
		model.addObject("empresa", empresa);
		return model;
	}
        
        @RequestMapping(value = "/changeStatusEmpresa", method = RequestMethod.GET)
	public ModelAndView changeStatusEmpresa(HttpServletRequest request) {
            int empresaCod = Integer.parseInt(request.getParameter("id"));
            Empresa empresa = empresaService.getEmpresa(empresaCod);
		if (empresa.getEstatus() == 0) {
                        empresa.setEstatus(1);
			empresaService.updateEmpresa(empresa);
		} else {
                        empresa.setEstatus(0);
			empresaService.updateEmpresa(empresa);
		}
		return new ModelAndView("redirect:/empresa");
	}
    
}
