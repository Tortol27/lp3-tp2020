package py.edu.uc.lp3.users;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;

@Entity
public class Espectador extends Usuario implements Potenciable {
	
	public Espectador() {
		
	}
	
	public Espectador(String username, String password, List<String> roles, long id) {
		super(username, password, roles, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Premium HacerPremium(Date vencimiento, Espectador user) {
		// TODO Auto-generated method stub
		return null;
	}

}
