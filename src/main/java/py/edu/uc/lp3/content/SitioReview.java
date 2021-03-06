package py.edu.uc.lp3.content;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SitioReview implements Visible{
	String nombre; //nombre del sitio
	String url;
	String rating; //el rating del sitio
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	public SitioReview() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public void mostrarNombre(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
