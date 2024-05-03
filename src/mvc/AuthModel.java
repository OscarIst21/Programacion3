package mvc;

import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class AuthModel {
	public AuthModel() {
		
	}
	public boolean login(String username,String password) {
			
	        try {
	            FileReader reader = new FileReader("src/usuario.json");
	            JSONObject jsonObject = new JSONObject(new JSONTokener(reader));
	            String user = jsonObject.getString("usuario");
	            String contrasena = jsonObject.getString("contrasena");
	            reader.close();
	            if (username.equals(user) && password.equals(contrasena)) {
	                //JOptionPane.showMessageDialog(null, "Bienvenido");
	                return true;
	            } else {
	            	//JOptionPane.showMessageDialog(null, "Usuario no encontrado");
	                return false;
	            }
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        } catch (JSONException ex) {
	            ex.printStackTrace();
	        }
	        return false;
	}
}
