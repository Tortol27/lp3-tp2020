package py.edu.uc.lp3.service;

import java.util.List;

import py.edu.uc.lp3.content.Pelicula;
import py.edu.uc.lp3.content.Serie;
import py.edu.uc.lp3.content.Video;



public interface VideoService {

	List<Video> listAll();
	List<Video> listByGenero(String genero);

	void savePelicula(Pelicula pelicula);
	void saveSerie(Serie serie);
	
	void delete(int id);
}
