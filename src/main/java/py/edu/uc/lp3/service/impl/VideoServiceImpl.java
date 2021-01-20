package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uc.lp3.content.Pelicula;
import py.edu.uc.lp3.content.Serie;
import py.edu.uc.lp3.content.Video;
import py.edu.uc.lp3.repository.VideoRepository;
import py.edu.uc.lp3.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService {

	@Autowired
	private VideoRepository videoRepository;
	
	@Override
	public List<Video> listAll() {
		List<Video> videos = new ArrayList<>();
		Iterator<Video> videosIterator = videoRepository.findAll().iterator();
		while (videosIterator.hasNext()) {
			videos.add(videosIterator.next());
		}
		return videos;
	}

	@Override
	public void saveSerie(Serie serie) {
		videoRepository.save(serie);
	}

	@Override
	public void savePelicula(Pelicula pelicula) {

		videoRepository.save(pelicula);
	}
	
	@Override
	public List<Video> listByGenero(String genero) {
		List<Video> videos = new ArrayList<>();
		Iterator<Video> videosIterator = videoRepository.findAll().iterator();
		while (videosIterator.hasNext()) {
			if (genero == videosIterator.next().getGenero()) {
				videos.add(videosIterator.next());
			}
		}
		return videos;
	}

	@Override
	public void delete(long id) {
		videoRepository.deleteById(id);
		
	}

	public Video findById(long id) {
		Video video = null;
		Optional<Video> optional = videoRepository.findById(id);
		if (optional.isPresent()) {
			video = optional.get();
		}
		return video;
	}



}
