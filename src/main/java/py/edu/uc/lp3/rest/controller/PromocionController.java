package py.edu.uc.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.content.Promocion;
import py.edu.uc.lp3.service.PromocionService;

@RestController
public class PromocionController {
	
	@Autowired
    private PromocionService promocionService;
	//get all
	@RequestMapping(value = "/api/lp3/promocion", method = RequestMethod.GET)
    public List<Promocion> list() {
        return promocionService.listAll();
    }
	//get por tipo
	@RequestMapping(value = "/api/lp3/promocion/{tipo}", method = RequestMethod.GET)
    public List<Promocion> list_tipo(@PathVariable("tipo") String tipo) {
        return promocionService.listByTipo(tipo);
    }
	//get por sitio
	@RequestMapping(value = "/api/lp3/promocion/{sitio}", method = RequestMethod.GET)
    public List<Promocion> list_sitio(@PathVariable("sitio") String sitio) {
        return promocionService.listBySitio(sitio);
    }
	//guardar
    @RequestMapping(value = "/api/lp3/promocion", method = RequestMethod.POST)
    public void add(@RequestBody Promocion institute) {
    	promocionService.save(institute);
    }
    //eliminar
    @RequestMapping(value = "/api/lp3/promocion/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
    	promocionService.delete(id);
    }
    
}
