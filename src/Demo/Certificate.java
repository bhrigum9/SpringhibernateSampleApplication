package Demo;

public class Certificate {
int empId;
int cert_id;
String cert_name;
Employee emp;

public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getCert_name() {
	return cert_name;
}
public void setCert_name(String cert_name) {
	this.cert_name = cert_name;
}

public int getCert_id() {
	return cert_id;
}
public void setCert_id(int cert_id) {
	this.cert_id = cert_id;
}
public Employee getEmp() {
	return emp;
}
public void setEmp(Employee emp) {
	this.emp = emp;
}

@Override
public String toString(){
	return "empid is "+"  "+empId +"and certification name is "+"  "+cert_name ;
	
}

}
