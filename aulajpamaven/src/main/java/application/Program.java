package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {

	public static void main(String[] args) {
//		Person p1 = new Person(null, "Carlos Silva", "carlos@gmail.com");
//		Person p2 = new Person(null, "Carlos Silva2", "carlos2@gmail.com");
//		Person p3 = new Person(null, "Carlos Silva3", "carlos3@gmail.com");
		
//		Same argument as in persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

// To find a person in the database
		Person p = em.find(Person.class, 2);
		System.out.println(p);
		
//		To remove the found person
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		
// To insert a person in the database
		//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();

		em.close();
		emf.close();
		
//		System.out.println("Ready!");
		
	}

}
