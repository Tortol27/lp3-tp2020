package py.edu.uc.lp3.service;

import java.util.List;

import py.edu.uc.lp3.content.SitioReview;
import py.edu.uc.lp3.content.Video;

public interface ReviewService {
	List<SitioReview> listAll();
	List<SitioReview> listByVideo(Video video);
	
	void save (SitioReview sitioreview);
	
	void delete(Video video); //aun no se segun que se va eliminar
	
}
