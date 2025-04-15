package com.facudev.freelanceflow.repository;

import com.facudev.freelanceflow.domain.model.User;
import com.facudev.freelanceflow.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRespository extends JpaRepository<UserEntity,Long> {

    List<User> findByName(String name);

}
