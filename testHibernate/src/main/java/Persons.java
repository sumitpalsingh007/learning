import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "persons", schema="ehr")
public class Persons {
	
	public Set<Orders> getOrders() {
		return orders;
	}
	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}
	@Id
	@GeneratedValue 
	@Column(name="P_Id")
	private String PId;
	@Column(name="LastName")
	private String LastName;
	@Column(name="FirstName")
	private String FirstName;
	private String Address;
	private String City;
	@OneToMany(fetch=FetchType.EAGER ,cascade = CascadeType.ALL,mappedBy="pId" )
	//@JoinColumn(name="P_Id")
	private Set<Orders> orders;
	
	public String getPId() {
		return PId;
	}
	public void setPId(String pId) {
		PId = pId;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	

}
