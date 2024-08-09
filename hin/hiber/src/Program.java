import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Program {
    public static void main(String[] args)
    {
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
        Student s  =session.get(Student.class, 20);
        System.out.println(s);
		transaction.commit();

        }
        finally{
            //Closing Resources
            session.close();
            sessionFactory.close();
        }
    }
}
