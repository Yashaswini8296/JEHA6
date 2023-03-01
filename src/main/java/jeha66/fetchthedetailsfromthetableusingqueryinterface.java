package jeha66;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class fetchthedetailsfromthetableusingqueryinterface {

	public static void main(String[] args) {
	
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
	    Query ct= entityManager.createQuery("select ct from CreateTable ct",CreateTable.class);
	    List<CreateTable>lt=ct.getResultList();
	    for(CreateTable ct1:lt)
	  	{
	   System.out.println("Id"+ct1.getStudent_Id()+" "+"Name"+ct1.getStudent_N()+" "+"email_id"+ct1.getStudent_E()+" "+"Ph_no"+ct1.getStudent_P());
		}
	   	}
	}


