package mvc;
import sql.DataBase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBase.optenerIstancia().cargarBase();
		
		AuthController test=new AuthController();
		test.login();
	}

}