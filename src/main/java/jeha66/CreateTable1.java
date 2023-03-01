package jeha66;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CreateTable1 {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		   EntityManager em= emf.createEntityManager();
		   EntityTransaction et=em.getTransaction();
		   
		   CreateTable ct=new CreateTable();
		   
	       System.out.println("Table is created");
		}
	}

	


