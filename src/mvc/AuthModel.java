package mvc;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

import sql.DataBase;


public class AuthModel {
	public AuthModel() {
		
	}
	public boolean login(String username,String password) {
			Usuario user=DataBase.optenerIstancia().validarNombre(username);
	       if(user!=null && user.getContraseña().equals(password))
	       {
	    	   return true;
	       }
	       return false;
	}
}