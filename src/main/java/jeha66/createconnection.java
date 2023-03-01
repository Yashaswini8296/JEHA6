package jeha66;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class createconnection {

	public static void main(String[] args) {
	   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	  
       System.out.println("connection established");
	}
}
