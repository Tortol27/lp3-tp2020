package py.edu.uc.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.service.UsuarioService;
import py.edu.uc.lp3.users.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
    private UsuarioService usuarioService;
	//get all
	@RequestMapping(value = "/api/lp3/usuario", method = RequestMethod.GET)
    public List<Usuario> list() {
        return usuarioService.listAll();
    }
	//get por rol
	@RequestMapping(value = "/api/lp3/usuario/{rol}", method = RequestMethod.GET)
    public List<Usuario> list_rol(@PathVariable("rol") String rol) {
        return usuarioService.listByRol(rol);
    }
	//guardar
    @RequestMapping(value = "/api/lp3/usuario", method = RequestMethod.POST)
    public void add(@RequestBody Usuario user) {
    	usuarioService.save(user);
    }
    //eliminar
    @RequestMapping(value = "/api/lp3/usuario/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
    	usuarioService.delete(id);
    }

}
