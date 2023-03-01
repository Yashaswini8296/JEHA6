package jeha66;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class deleteallthevaluespresentintable {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager em=entityManagerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		CreateTable ct=em.find(CreateTable.class,1);
		et.begin();
		Query ct1=em.createQuery("delete from CreateTable");
		ct1. executeUpdate();
		et.commit();
	    }
		}

