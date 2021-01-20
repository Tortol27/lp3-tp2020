package py.edu.uc.lp3.content;

import java.util.List;
import javax.persistence.Entity;

@Entity
public class Serie extends Video{
	
	int episodios;
	int temporadas;
	int [] emision; //fecha en la que salio al aire y fecha en la que se termino de emitir 
	
	public Serie() {
		
	}
	
	public Serie(String nombre, String genero, long id, List<String> ratings, int episodios, int temporadas,
			int[] emision) {
		super(nombre, genero, id, ratings);
		this.episodios = episodios;
		this.temporadas = temporadas;
		this.emision = emision;
	}

	public int getEpisodios() {
		return episodios;
	}
	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public int[] getEmision() {
		return emision;
	}
	public void setEmision(int[] emision) {
		this.emision = emision;
	}
	@Override
	public long duracionTotal() {
		//se suma la duracion de todos los capitulos de todas las temporadas
		long duracion= 0l;
		return duracion;
	}
}
