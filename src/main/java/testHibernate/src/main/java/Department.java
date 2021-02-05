import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import entity.Customer;

@Entity
@Table(name = "department", schema="new_schema")
public class Department {
	@Id
	@GeneratedValue
	@Column(name="ID")
   private String Id;
	
	@Column(name="name")
	   private String name;

	@OneToMany(fetch=FetchType.EAGER ,cascade = CascadeType.ALL,mappedBy="custId" )
	//@Fetch(value = FetchMode.SUBSELECT)
	//@JoinColumn(name="P_Id")
	private Set<Customer> customer;
	
	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
