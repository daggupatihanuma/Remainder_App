import java.io.Serializable;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import antlr.collections.List;

public class Program2 {
    public static void main(String[] args){
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
		String query = "from Student";
        org.hibernate.query.Query creatQuery = session.createQuery(query);
		java.util.List students = creatQuery.list();
        
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
        // TODO Auto-generated method stub
        for (Object student : students) {
            System.out.println(student);
        }
    }
}
