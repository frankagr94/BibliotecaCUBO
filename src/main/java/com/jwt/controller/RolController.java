
package com.jwt.controller;

import com.jwt.model.Rol;
import com.jwt.service.RolService;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.zkoss.bind.annotation.ExecutionParam;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelArray;
import org.zkoss.zul.Textbox;

/**
 *
 * @author Frank
 */
@Controller("/rol")
public class RolController extends SelectorComposer{
    
    @Wire
    Textbox nombre; 
    
    private static final Logger logger = Logger
			.getLogger(RolController.class);

	

	@Autowired
	private RolService rolService;
        
        public RolController() {
		System.out.println("RolController()");
                ListModel listRol = new ListModelArray(rolService.getAllRoles());
	}
        
	@RequestMapping(value = "/rol")
	public ModelAndView listRol(ModelAndView model) throws IOException {
		/*ListModel listRol = new ListModelArray(rolService.getAllRoles());
		model.addObject("listRol", listRol);
                newRol(model);*/
		model.setViewName("rol");
		return model;
	}
        
        

	@RequestMapping(value = "/newRol", method = RequestMethod.GET)
	public ModelAndView newRol(ModelAndView model) {
		Rol rol = new Rol();
		model.addObject("rol", rol);
		model.setViewName("rol");
		return model;
	}


        @Listen("onClick=#BtnGrabar")
	public void Grabar() { 
                Rol rol = new Rol();
                        rol.setNombre(nombre.getText());
			rolService.addRol(rol);
	}


	@RequestMapping(value = "/deleteRol", method = RequestMethod.GET)
	public ModelAndView deleteRol(HttpServletRequest request) {
		int rolId = Integer.parseInt(request.getParameter("id"));
		rolService.deleteRol(rolId);
		return new ModelAndView("redirect:/rol");
	}

	@RequestMapping(value = "/editRol", method = RequestMethod.GET)
	public ModelAndView editRol(HttpServletRequest request) throws IOException {
		int rolId = Integer.parseInt(request.getParameter("id"));
		Rol rol = rolService.getRol(rolId);
                List<Rol> listRol = rolService.getAllRoles();
		ModelAndView model = new ModelAndView("rol");
                model.addObject("listRol", listRol);
		model.addObject("rol", rol);
		return model;
	}
        
        @RequestMapping(value = "/changeStatusRol", method = RequestMethod.GET)
	public ModelAndView changeStatusRol(HttpServletRequest request) {
            int rolId = Integer.parseInt(request.getParameter("id"));
            Rol rol = rolService.getRol(rolId);
		if (rol.getEstatus() == 0) {
                        rol.setEstatus(1);
			rolService.updateRol(rol);
		} else {
                        rol.setEstatus(0);
			rolService.updateRol(rol);
		}
		return new ModelAndView("redirect:/rol");
	}
    
}
