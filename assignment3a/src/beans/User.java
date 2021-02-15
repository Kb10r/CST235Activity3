package beans;
import javax.faces.bean.*;
import javax.validation.constraints.*;

@ManagedBean
@ViewScoped
public class User {
	
	@NotNull(message = "Please enter a First Name!")
	@Size(min=2, max=20)
	private String firstName;
	
	@NotNull(message = "Please enter a Last Name!")
	@Size(min=2, max=20)
	private String lastName;
	
	public User() {
		this.firstName = "";
		this.lastName = "";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}	
