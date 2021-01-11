package py.edu.uc.lp3.repository;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import py.edu.uc.lp3.content.SitioReview;
import py.edu.uc.lp3.content.Video;

@Repository
public interface SitioReviewRepository extends PagingAndSortingRepository<SitioReview, Long> {
	List<SitioReview> findByVideo(Video video);
}
