package Demo;

import java.util.List;
import java.util.Set;

public interface PersonDAO {
	public void saveEmp(Employee emp);
	public void saveAddr(Address addr);
	public  List<Address> getById(int id);
	public List<Address> display();
	public void saveCert(Set<Certificate> cert);
	public void updateCert(int Id);
	public void updateEmp(int id);
	public List<Employee> fetchEmp();
	public List<Certificate> fetchcert();
	public void  deleteEmp(int id);



}
