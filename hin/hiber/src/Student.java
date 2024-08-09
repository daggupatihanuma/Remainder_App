import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")

public class Student {
	@Id
	@Column(name = "roll")
	private int roll;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;

	@Column(name = "marks")
	private int marks;
	
	//Constuctors
	public Student() {
		
	}

	public Student(int roll, String name, String email,int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return roll + " ,"+ name+ " ,"+email+" ,"+marks;
	}
	
}

