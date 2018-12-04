package Demo;




import java.util.HashSet;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Action {

	public static void main(String[] args) {
		
ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Hibernate.xml");

PersonDAO person=(PersonDAO)context.getBean("id");
Employee emp=new Employee();
//emp.setGender(Gender.female);
emp.setName("Semantifi");
emp.setDesignation("sse");
//Address addr=new Address();
//emp.setAddress(addr);
Set<Certificate> certif=new HashSet<Certificate>();
Certificate cert=new Certificate();
cert.setCert_name("Perl");
//cert.setCert_name("PHP");
//cert.setCert_name("dotnet");
cert.setEmp(emp);
certif.add(cert);
emp.setCertificate(certif);
//person.fetchcert();
/*addr.setCity("HYD");
addr.setCountry("india");
addr.setLocality("KP");
addr.setPin(500036);
addr.setEmp(emp);
person.saveAddr(addr);*/
//person.saveEmp(emp);
//person.saveCert(certif);
//person.fetchEmp();
person.updateEmp(6);


//person.updateEmp(22);
//person.getById(16);
//person.display();
//person.updateCert(12);;
	}
	
}
