package py.edu.uc.lp3.users;

import java.util.List;
import javax.persistence.Entity;

import py.edu.uc.lp3.content.SitioReview;
import py.edu.uc.lp3.content.Video;

@Entity
public class Curador extends Usuario implements Modificable{
	String[] categorias; //lista de categorias a moderar
	
	public Curador() {
		
	}
	
	public Curador(String username, String password, List<String> roles, String[] categorias, long id) {
		super(username, password, roles, id);
		this.categorias = categorias;
	}

	public String[] getCategorias() {
		return categorias;
	}

	public void setCategorias(String[] categorias) {
		this.categorias = categorias;
	}

	@Override
	public Video cambiarGenero(Video video) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Video cambiarRating(Video video, SitioReview sitio) {
		// TODO Auto-generated method stub
		return null;
	}
}
