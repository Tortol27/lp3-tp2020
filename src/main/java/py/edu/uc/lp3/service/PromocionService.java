package py.edu.uc.lp3.service;

import java.util.List;

import py.edu.uc.lp3.content.Promocion;

public interface PromocionService {
	List<Promocion> listAll();
	List<Promocion> listByTipo (String tipo);
	List<Promocion> listBySitio (String sitio);
	
	void save(Promocion Promo);
	
	void delete(int id);
}
