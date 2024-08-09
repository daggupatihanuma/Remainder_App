import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.CollectionId;
import org.hibernate.cfg.Configuration;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "customer_details")
public class CustomerDetails {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "Address")
    private String Address;

    public CustomerDetails() {
    }

    public CustomerDetails(int id, String email, String phone, String address) {
        super();
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.Address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "CustomerDetails [id=" + id + ", email=" + email + ", phone=" + phone + ", Address=" + Address + "]";
    }

    
    
}
