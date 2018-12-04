package Demo;

import java.util.*;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class PersonDAOImpl implements PersonDAO {
private HibernateTemplate template;



public HibernateTemplate getTemplate() {
	return template;
}

public void setTemplate(HibernateTemplate template) {
	this.template = template;
}


@Override
public void saveEmp(Employee emp) {
	template.saveOrUpdate(emp);
	System.out.println("Epmloyee saved in database");
}

@Override
public void saveAddr(Address addr) {
template.saveOrUpdate(addr);
System.out.println("Address saved in DB");

}

@Override
public void saveCert(Set<Certificate> cert) {
template.save(cert);
System.out.println("certificate saved in table"); 

}

@Override
public void updateCert(int id) {
	Certificate cert=(Certificate)template.get(Certificate.class, id);
cert.setCert_name("Hive");
template.update(cert);
}

public void updateEmp(int id)
{
	Employee emp=(Employee)template.get(Employee.class, id);
	emp.setName("testing");
	emp.setDesignation("BA");
	emp.setEmpId(16);
	template.update(emp);
	//String query=("Update emp_cert_count set cert_count="+1+ "where empid="+id);
    //template.find(query);
	
}


@Override
public List<Address> display() {
	String query=("from Address");
	@SuppressWarnings("unchecked")
	List<Address> addr=(List<Address>)template.find(query);
	for(int i=0; i< addr.size();i++){
		System.out.println("val is "+ addr.get(i).toString());	}
	return addr;
}

@SuppressWarnings("unchecked")
@Override
public List<Address> getById(int id) {
	String query=("from Address Where empId="+ id);
	List<Address> e=(List<Address>)template.find(query);
	for(int i=0; i< e.size();i++){
System.out.println("val is "+ e.get(i).toString());	}
return e ;	
}

@Override
public List<Employee> fetchEmp() {
	String query=("from Employee");
	@SuppressWarnings("unchecked")
	List<Employee> emp=(List<Employee>)template.find(query);
	for(int i=0; i< emp.size();i++){
		System.out.println("val is "+ emp.get(i).toString());	}
	return emp;
}

@Override
public List<Certificate> fetchcert() {
	String query=("from certificate");
	@SuppressWarnings("unchecked")
	List<Certificate> cert=(List<Certificate>)template.find(query);
	for(int i=0; i< cert.size();i++){
		System.out.println("val is "+ cert.get(i).toString());	}

	return null;
	

}

@Override
public void deleteEmp(int id) {
		Employee emp=(Employee) template.get(Employee.class, id);
		template.delete(emp);
}





}
