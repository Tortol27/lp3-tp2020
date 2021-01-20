package py.edu.uc.lp3.content;

import java.util.List;
import javax.persistence.Entity;

@Entity
public class Pelicula extends Video{
	int emision; //fecha en la que salio
	
	public Pelicula() {
		
	}
	
	public Pelicula(String nombre, String genero, long id, List<String> ratings, int emision) {
		super(nombre, genero, id, ratings);
		this.emision = emision;
	}

	public int getEmision() {
		return emision;
	}

	public void setEmision(int emision) {
		this.emision = emision;
	}

	@Override
	public long duracionTotal() {
		//se suma la duracion las peliculas de la saga
		long duracion= 360l;
		return duracion;
	}

}
