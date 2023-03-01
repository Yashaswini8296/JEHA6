package jeha66;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class fetchthedetailsfromthetable {

	public static void main(String[] args) {
	
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager em=entityManagerFactory.createEntityManager();
		CreateTable ct=em.find(CreateTable.class,1);
		CreateTable ct1=em.find(CreateTable.class,2);
System.out.println("Id"+ct1.getStudent_Id()+" "+"Name"+ct1.getStudent_N()+" "+"email_id"+ct1.getStudent_E()+" "+"Ph_no"+ct1.getStudent_P());
	}
}