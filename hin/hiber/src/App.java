import java.io.Serializable;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Session;
public class App {
    public static void main(String[] args) {
		SessionFactory sessionFactory = null;
        Session session = null;
		
		try{
            //Create  Session Factory
		 sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		
        //Create Session
		 session = sessionFactory.openSession();
		
        //Create Transcation
		org.hibernate.Transaction transaction = (org.hibernate.Transaction) session.beginTransaction();
		
        //CRUD Operation
		Student s1 = new Student(2,"teja","teja@gmail.com",60);
		Serializable id = session.save(s1);
		System.out.println(id);
		
		transaction.commit();

        }
        finally{
            //Closing Resources
            session.close();
            sessionFactory.close();
        }

        


	}

}
