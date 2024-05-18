
package sql;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.code.advancedsql.*;
import com.code.advancedsql.query.Select;

import mvc.Usuario;
public class DataBase {
	private static DataBase Istance=new DataBase();
	
	static List<Usuario> user = new ArrayList<Usuario>();
	
	public static DataBase optenerIstancia() {
		return Istance;
	}
	
	public void cargarBase() {
		try {
		    MySQL mySQL = new MySQL("sql.freedb.tech", 3306, "freedb_OscarIst", "#uaSA$!eU24sdaS", "freedb_Programacion");

		    if (mySQL.isConnected()) {
		        System.out.println("Connected!");
		    
		    Select nombreTabla=mySQL.table("usuario").select();
		    List<Map<String, Object>> resultTableUser = nombreTabla.fetchAllAsList();
		    for (Map<String, Object> map : resultTableUser) {
				map.get("usuario");
				String nombre=((String)map.get("usuario"));
				String contraseña=((String)map.get("contraseña"));
				System.out.println(nombre);
				System.out.println(contraseña);
				user.add(new Usuario(nombre,contraseña));
			}
		    }
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	}
	public Usuario validarNombre(String nombre) {
		for (Usuario usuario2 : user) {
			if(usuario2.getNombre().equals(nombre)) {
			return usuario2;
			}
		}
		return null;
	}
	

}
