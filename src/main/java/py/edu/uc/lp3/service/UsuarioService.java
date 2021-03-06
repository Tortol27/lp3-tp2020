package py.edu.uc.lp3.service;

import java.util.List;

import py.edu.uc.lp3.users.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService {
	List<Usuario> listAll();
	List<Usuario> listByRol(String rol);
	
	void save(Usuario user);
	
	void delete(long id);
	
	void saveList(List<Usuario> usuarios);
}
