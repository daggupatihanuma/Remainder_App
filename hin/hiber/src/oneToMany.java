import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class oneToMany {
    public static void main(String[] args) {
        SessionFactory sessionFactory = null;
        Session session = null;

       try{
            sessionFactory = (SessionFactory) new Configuration()
            .configure()
            .addAnnotatedClass(Customer.class)
            .addAnnotatedClass(CustomerDetails.class)
            .addAnnotatedClass(orders.class)
            .buildSessionFactory();

            session = sessionFactory.openSession();

            Transaction transaction = session.beginTransaction();


            //CRUD
            orders o1 =new orders(701,"Burger",300);
            orders o2 =new orders(702,"pizza",350);
            orders o3 =new orders(703,"Burger",300);
           
           // Fetch Customer Object

           Customer alex=session.get(Customer.class,1);

           //Set customer to orders
            o1.setCustomer(alex);
            o2.setCustomer(alex);
            o3.setCustomer(alex);
            
            //Save to Databases into orders table
            System.out.println(session.save(o1));
            System.out.println(session.save(o2));
            System.out.println(session.save(o3));
            
            transaction.commit();
       }    

       finally{

        session.close();
        sessionFactory.close();

       }
    }
}
