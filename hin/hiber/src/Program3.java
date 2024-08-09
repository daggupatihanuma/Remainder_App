import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;

import antlr.collections.List;

public class Program3 {
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
		String s = "From Student s  SET s.marks = 50 where s.marks > 70";
        org.hibernate.query.Query query  = session.createQuery(s);
        java.util.List students = query.list();

        display(students);



		transaction.commit();

        }
        finally{
            //Closing Resources
            session.close();
            sessionFactory.close();
        }
    }

    private static void display(java.util.List students) {
        for (Object student : students) {
            System.out.println(student);
            
        }
    }

    }

    
    
    

