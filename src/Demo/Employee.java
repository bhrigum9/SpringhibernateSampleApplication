package Demo;
import java.io.Serializable;
import java.util.Set;


public class Employee implements Serializable {

	   private static final long serialVersionUID = 1L;

	int empId;
	String name;
	String designation;
	//Address Address;
	//Gender Gender; 
	public Set<Certificate> Certificate ;
	
	/*public String getGender() {
		return Gender.vals;
	}
	
	public void setGender(Gender gender) {
		Gender = gender;
	}
	public void setGender(String vals) {
		this.Gender.vals = vals;
	}
		*/

	public Set<Certificate> getCertificate() {
		return Certificate;
	}
	public void setCertificate(Set<Certificate> certificate) {
		Certificate = certificate;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/*public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	*/
    
@Override
	public String toString(){
		return "id="+empId+"     "+ "name="+name+"     "+ "Designation="+ designation;
		
	}

}

