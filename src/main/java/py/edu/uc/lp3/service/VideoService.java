package py.edu.uc.lp3.service;

import java.util.List;

import py.edu.uc.lp3.content.Video;



public interface VideoService {

	List<Video> listAll();
	List<Video> listByGenero(String genero);

	void save(Video institute);
	
	void delete(int id);
}
