package in.uddesh.repositories;

import org.springframework.stereotype.Repository;

import in.uddesh.entity.Registration;

@Repository
public interface CounselloreServiceRepo {

	public String savecounsellore(Registration registration);
}
