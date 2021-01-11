package py.edu.uc.lp3.users;

import java.util.Date;
import java.util.List;

public class Espectador extends Usuario implements Potenciable {
	
	public Espectador(String username, String password, List<String> roles, int id) {
		super(username, password, roles, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Premium HacerPremium(Date vencimiento, Espectador user) {
		// TODO Auto-generated method stub
		return null;
	}

}
