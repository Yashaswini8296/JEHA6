package jeha66;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class deletethevaluesfromthetable {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager em=entityManagerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		CreateTable ct=em.find(CreateTable.class,1);
		if(ct!=null)
		{
		et.begin();
		em.remove(ct);
		et.commit();
		}
		else {
			System.out.println("data not found");
		}
	}
}
	

