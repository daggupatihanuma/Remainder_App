import java.io.Serializable;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.Session;
public class oneToOne {
    public static void main(String[] args) {
        SessionFactory sessionFactory = null;
        Session session = null;

       try{
            sessionFactory = (SessionFactory) new Configuration()
            .configure().addAnnotatedClass(Customer.class)
            .addAnnotatedClass(CustomerDetails.class)
            .buildSessionFactory();

            session = sessionFactory.openSession();

            Transaction transaction = session.beginTransaction();


            //CRUD

            Customer c1 = new Customer(1,"teja");
            CustomerDetails cd1 = new CustomerDetails(501,"teja@gmail.com","3698498","kadapa");

            c1.setCustomerDetails(cd1);

            Serializable i = session.save(c1);
            System.out.println(i);

            transaction.commit();
       }    

       finally{

        session.close();
        sessionFactory.close();

       }
    }
}
