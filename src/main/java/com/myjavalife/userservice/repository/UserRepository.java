package com.myjavalife.userservice.repository;

import com.myjavalife.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
