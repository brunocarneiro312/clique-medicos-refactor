package main.java.com.hepta.cliquemedicos.security;

import com.hepta.utilitarios.security.SessionFilter;
import main.java.com.hepta.cliquemedicos.entity.Usuario;

public class SessionFilterCM extends SessionFilter {
	
	private String urlLogin = "../registro.html";
	@Override
	public String authorize(String url) {
		Usuario user = (getSession() != null) ? (Usuario) getSession().getAttribute("user") : null;
		if(url.contains("/pages") && user == null)
			return urlLogin;
		
		//TODO::implementar sessionfilter depois
		if(url.contains("/private") && user == null)
			return "../../" + urlLogin;

			

		
		return url;
	}
}
