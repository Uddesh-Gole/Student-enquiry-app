package in.uddesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.uddesh.entity.Registration;
import in.uddesh.repositories.CounselloreServiceRepo;
import in.uddesh.repositories.RegistrationRepo;

@Service
public class CounselloreService implements CounselloreServiceRepo {
     
	@Autowired
	 private RegistrationRepo rrepo;
	@Override
	public String savecounsellore(Registration registration) {
		                Registration save = rrepo.save(registration);
		                if(save!=null) {
		                	return"Registration Succesfull";
		                }
		return "Registration Failed";
	}

	
	
}
