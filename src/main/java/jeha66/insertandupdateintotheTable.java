package jeha66;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insertandupdateintotheTable {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		CreateTable ins=new CreateTable();

		if(ins!=null)
		{
			ins.setStudent_Id(2);
			ins.setStudent_N("Yash");
			ins.setStudent_E("Yash@gmail.com");
			ins.setStudent_P(231456789);
		}
		//else
			//System.out.println("Data not found to update");
		
			entityTransaction.begin();
			entityManager.merge(ins);
			entityTransaction.commit();
		}		
		}
	


