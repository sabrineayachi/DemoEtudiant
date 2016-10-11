package servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author <a href="mailto:sabrinee.ayachi@gmail.com">Sabrine AYACHI</a>
 */
public class Etudiant {
	
	Connection con = null;
	static String url = "jdbc:mysql://localhost:3306/mabase";
	static String user = "root";
	static String pwd = "";
	
	int code;
	String nom;
	float moyenne;
	
public void connecter(){
		
		try {
			con = DriverManager.getConnection(url, user, pwd);
			if (con != null)
				System.out.println("connexion effectu�e");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public boolean succeed()
	{
		if (moyenne > 10)
			return true;
		else return false;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getMoyenne() {
		//moyenne = rs.getFloat("moyenne");
		return moyenne;
	}
	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}
	
}
