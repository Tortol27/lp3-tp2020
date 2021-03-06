package py.edu.uc.lp3.content;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import py.edu.uc.lp3.utils.Notificar;

@Entity
public class Promocion implements Visible, Expirable {
	String tipo; //si es mes gratis, descuento, etc
	Date vencimiento; 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	String url; //url del sitio en el que se canjea la promo
	
	public Promocion() {
		
	}
	
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public Promocion(String tipo, Date vencimiento, int id, String sitio) {
		super();
		this.tipo = tipo;
		this.vencimiento = vencimiento;
		this.id = id;
		this.url = sitio;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Date getVencimiento() {
		return vencimiento;
	}


	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	@Override
	public void mostrarNombre(String name) { //mostrar el tipo de promo
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mostrarDatos() { //mostrar la url del sitio
		
		
	}


	@Override
	public boolean controlVencimiento(Date vencimiento, Date hoy) {
		// TODO Auto-generated method stub
		if(vencimiento.equals(hoy)) {
			Notificar.estaVencido(this);
			return true;
		}
		return false;
	}
	
}
