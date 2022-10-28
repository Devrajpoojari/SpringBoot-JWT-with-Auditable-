package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	
	@Query(value = "SELECT o FROM user_entity o where name=:name")
	public User getUserByName(@Param("name") String name);

}
