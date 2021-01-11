package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void save(Video institute) {
		videoRepository.save(institute);
	}

	@Override
	public List<Video> listByGenero(String genero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
