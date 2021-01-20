package py.edu.uc.lp3.content;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Video implements Visible, Clasificable{
	String nombre;
	String genero;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ElementCollection
	List<String> ratings; //una list donde almacenar los url de rating de distintos sitios
	
	public Video() {
	}


	public Video(String nombre, String genero, long id, List<String> ratings) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.id = id;
		this.ratings = ratings;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	

	public List<String> getRatings() {
		return ratings;
	}


	public void setRatings(List<String> ratings) {
		this.ratings = ratings;
	}


	public long duracionTotal() {
		long duracion = 0l;
		return duracion;
	}


	@Override
	public void mostrarNombre(String name) { //va mostrar el nombre de la serie/pelicula
		// TODO Auto-generated method stub
		name = this.nombre; 
	}


	@Override
	public String getRating(SitioReview sitio) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		
	}

}
