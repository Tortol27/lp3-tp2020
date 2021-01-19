package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uc.lp3.repository.UsuarioRepository;
import py.edu.uc.lp3.service.UsuarioService;
import py.edu.uc.lp3.users.Usuario;


@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> listAll() {
		List<Usuario> usuarios = new ArrayList<>();
		Iterator<Usuario> usuariosIterator = usuarioRepository.findAll().iterator();
		while (usuariosIterator.hasNext()) {
			usuarios.add(usuariosIterator.next());
		}
		return usuarios;
	}

	@Override
	public void save(Usuario user) {
		usuarioRepository.save(user);
	}


	@Override
	public void delete(long id) {
		usuarioRepository.deleteById(id);
		
	}

	@Override
	public List<Usuario> listByRol(String rol) {
		List<Usuario> usuarios = new ArrayList<>();
		Iterator<Usuario> usuariosIterator = usuarioRepository.findAll().iterator();
		while (usuariosIterator.hasNext()) {
			List <String> roles = usuariosIterator.next().getRoles();
			Iterator<String> rolesIterator=roles.iterator();
			while (rolesIterator.hasNext()) {
				if (rol == rolesIterator.next()) {
					usuarios.add(usuariosIterator.next());
				}
			}
		}
		return usuarios;
	}

	@Override
	public void saveList(List<Usuario> usuarios) {
		// TODO Auto-generated method stub
		
	}


}