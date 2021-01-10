package py.edu.uc.lp3.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import py.edu.uc.lp3.content.Promocion;

@Repository
public interface PromocionRepository extends PagingAndSortingRepository<Promocion, Long> {
	List<Promocion> listByType(String tipo);
	List<Promocion> listAll();
}
