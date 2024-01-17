package in.uddesh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.uddesh.entity.Registration;

public interface RegistrationRepo extends JpaRepository<Registration, Integer> {

}
