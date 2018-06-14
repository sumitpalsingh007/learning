import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "orders", schema="ehr")
public class Orders {
	@Id
	@GeneratedValue
	@Column(name="O_Id")
   private String oredrId;
	@Column(name="orderNo")
   private String order_No;
   @Column(name="P_Id")
   private String pId;
   
   @OneToMany(fetch=FetchType.EAGER ,cascade = CascadeType.ALL,mappedBy="Id" )
	//@JoinColumn(name="P_Id")
	private Set<Department> departments;
   
   
public String getOrder_No() {
	return order_No;
}

public void setOrder_No(String order_No) {
	this.order_No = order_No;
}

public Set<Department> getDepartments() {
	return departments;
}

public void setDepartments(Set<Department> departments) {
	this.departments = departments;
}

public String getOredrId() {
	return oredrId;
}

public void setOredrId(String oredrId) {
	this.oredrId = oredrId;
}
public String getorder_No() {
	return order_No;
}


public void setorder_No(String order_No) {
	this.order_No = order_No;
}
public String getpId() {
	return pId;
}

public void setpId(String pId) {
	this.pId = pId;
}

}
