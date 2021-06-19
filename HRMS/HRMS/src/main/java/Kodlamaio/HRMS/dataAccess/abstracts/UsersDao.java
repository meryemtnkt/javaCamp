package Kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlamaio.HRMS.entities.concretes.Users;

public interface UsersDao extends JpaRepository<Users, Integer> {

}
