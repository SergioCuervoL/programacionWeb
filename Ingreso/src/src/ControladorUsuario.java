package src;
import java.util.ArrayList;
import java.util.Scanner;

public class ControladorUsuario {
	
	ArrayList<Usuario> ual = new ArrayList<Usuario>();
	
	public ArrayList<Usuario> agregarUsuario(String username, String password, ArrayList<Usuario> us) {
		Usuario u = null;
		String iden="";
		iden=identificarse(username, password, us);
		System.out.println(iden);
		if(iden.equals("")) {
			u = new Usuario(username, password);
			ual.add(u);
			iden = "Usuario Agregado";
			us = ual;
		}
		return us;
	}
	
	public String identificarse(String username, String password, ArrayList<Usuario> users) {
		Usuario u = null;
		ual = users;
		String res="";
		for(int i = 0; i < ual.size(); i++) {
			String user="";
			String pass="";
			u = ual.get(i);
			user = u.getUsuario();
			pass = u.getPassword();
			if(user.equals(username)) {
				if(pass.equals(password)) {
					res = "Ingreso Correctamente";
				}
				else {
					res = "Contraseña Incorrecta";
				}
			}
		}	
		return res;
	}
	
	public Boolean modificarUsuario(String username, String password, ArrayList<Usuario> users) {
		Usuario u = null;
		Scanner sc = new Scanner (System.in);
		Boolean res = false;
		String us="";
		String ps="";
		for(int i = 0; i < users.size(); i++) {
			u = users.get(i);
			if(u.getUsuario().equals(username)) {
				System.out.println("Ingrese nuevo nombre");
				us = sc.nextLine();
				System.out.println("Ingrese nuevo password");
				ps = sc.nextLine();
				u.setUsuario(us);
				u.setPassword(ps);
				res= true;
			}
		}
		return res;
	}
	
	public Boolean eliminarUsuario(String username, String password, ArrayList<Usuario> users) {
		Usuario u = null;
		Scanner sc = new Scanner (System.in);
		Boolean res = false;
		for(int i = 0; i < users.size(); i++) {
			u = users.get(i);
			if(u.getUsuario().equals(username)) {
				users.remove(i);
				res = true;
			}
		}
		return res;
	}
	
	/*public void menu() {
		String r ="";
		String au = "";
		System.out.println("1.Submit \n2.Exit");
		Scanner sc = new Scanner (System.in);
		int res = sc.nextInt();
		switch (res) {
		case 1:
			System.out.println("Username: ");
			String username = sc.nextLine();
			username = sc.nextLine();
			System.out.println("Password: ");
			String password = sc.nextLine();
			resp = agregarUsuario(username, password, );	
			System.out.println(au);
			menu();
			break;

		default:
			System.exit(0);
			break;
		}
	}*/

}
