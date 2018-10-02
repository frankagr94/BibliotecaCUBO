/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.controller;

import com.jwt.model.Usuario;
import com.jwt.service.UsuarioService;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ely
 */
@Controller("/login")
public class LoginController {
    
    private static final Logger logger = Logger
			.getLogger(LoginController.class);

	public LoginController() {
		System.out.println("LoginController()");
	}
        
        @Autowired
	private UsuarioService usuarioService;
    
     @RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView Raiz(ModelAndView model, HttpServletRequest request) throws IOException {
            String cedula = request.getParameter("cedula").trim();
            String password = request.getParameter("password").trim();
            Usuario usuario = usuarioService.loginUsuario(cedula);
            if(usuario.getCedula()!=null)
            {
                if(usuario.getCedula().equals(cedula) & usuario.getPassword().equals(password))
                {
                    model.addObject("usuario", usuario);
                    model.setViewName("index");                   
                }
                else
                   model.setViewName("errorlogin");
            }
            else
            { model.setViewName("errorlogin");}
            return model;
	}
}
