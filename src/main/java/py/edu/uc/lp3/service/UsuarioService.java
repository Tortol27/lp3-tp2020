package py.edu.uc.lp3.service;

import java.util.List;

import py.edu.uc.lp3.users.Usuario;

public interface UsuarioService {
	List<Usuario> listAll();
	List<Usuario> listByRol(String rol);
	
	void save(Usuario user);
	
	void delete(int id);
	
	void saveList(List<Usuario> usuarios);
}
