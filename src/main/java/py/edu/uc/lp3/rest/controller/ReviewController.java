package py.edu.uc.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.content.SitioReview;
import py.edu.uc.lp3.service.ReviewService;


@RestController
public class ReviewController {
	
	@Autowired
    private ReviewService reviewService;
	//get all
	@RequestMapping(value = "/api/lp3/review", method = RequestMethod.GET)
    public List<SitioReview> list() {
        return reviewService.listAll();
    }
	//get por rol
	@RequestMapping(value = "/api/lp3/review/{video}", method = RequestMethod.GET)
    public List<SitioReview> list_rol(@PathVariable("video") String video) {
        return reviewService.listByVideo(video);
    }
	//guardar
    @RequestMapping(value = "/api/lp3/review", method = RequestMethod.POST)
    public void add(@RequestBody SitioReview user) {
    	reviewService.save(user);
    }
    //eliminar
    @RequestMapping(value = "/api/lp3/usuario/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
    	reviewService.delete(id);
    }

}
