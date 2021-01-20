package py.edu.uc.lp3.utils;

import java.util.List;

import py.edu.uc.lp3.content.Promocion;
import py.edu.uc.lp3.content.SitioReview;

public class Listar {
	public static void roles(List<String> rol) {
		 System.out.println(rol.toString());
	}
	public static void ratings(String url) { //te muestra las reseñas almacenadas por sitio 
		System.out.println(url); //cambiar mas adelante a realizar por iteracion
	}
	public static void promociones(List<Promocion> promos) { //te muestra las promociones de un usuario
		 System.out.println(promos.toString());//cambiar a un algoritmo iterable para mostrar la promo con su fecha de vencimiento
	}
}
