package jeha66;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdatethevaluesintotheTable {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		CreateTable ins=entityManager.find(CreateTable.class,1);
		ins.setStudent_Id(1);
		ins.setStudent_N("Yashu");
		ins.setStudent_E("Yashu@gmail.com");
		ins.setStudent_P(987654321);
		
		entityTransaction.begin();
		entityManager.merge(ins);
		entityTransaction.commit();
	}
}

	
