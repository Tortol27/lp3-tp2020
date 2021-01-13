package py.edu.uc.lp3.service;

import java.util.List;

import py.edu.uc.lp3.content.SitioReview;

public interface ReviewService {
	List<SitioReview> listAll();
	List<SitioReview> listByVideo(String video);
	
	void save (SitioReview sitioreview);
	
	void delete(int id); //aun no se segun que se va eliminar
	
}
