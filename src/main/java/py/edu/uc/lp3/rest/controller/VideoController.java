package py.edu.uc.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.content.Pelicula;
import py.edu.uc.lp3.content.Serie;
import py.edu.uc.lp3.content.Video;
import py.edu.uc.lp3.service.VideoService;

@RestController
public class VideoController {
	
	@Autowired
    private VideoService videoService;
	//get all
	@RequestMapping(value = "/api/lp3/video", method = RequestMethod.GET)
    public List<Video> list() {
        return videoService.listAll();
    }
	//get por genero
	@RequestMapping(value = "/api/lp3/video/{gen}", method = RequestMethod.GET)
    public List<Video> list_rol(@PathVariable("gen") String gen) {
        return videoService.listByGenero(gen);
    }
	//guardar
    @RequestMapping(value = "/api/lp3/pelicula", method = RequestMethod.POST)
    public void add(@RequestBody Pelicula pelicula) {
    	videoService.savePelicula(pelicula);
    }
    @RequestMapping(value = "/api/lp3/serie", method = RequestMethod.POST)
    public void add(@RequestBody Serie serie) {
    	videoService.saveSerie(serie);
    }
    //eliminar
    @RequestMapping(value = "/api/lp3/video/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
    	videoService.delete(id);
    }
    
}
