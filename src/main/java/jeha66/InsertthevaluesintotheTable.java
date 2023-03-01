package jeha66;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertthevaluesintotheTable 
{

	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		CreateTable ins=new CreateTable();
		ins.setStudent_Id(1);
		ins.setStudent_N("Yashaswini");
		ins.setStudent_E("Yashaswini@gmail.com");
		ins.setStudent_P(789456231);
		
		entityTransaction.begin();
		entityManager.persist(ins);
		entityTransaction.commit();
	}
}
