package com.facudev.freelanceflow.repository;

import com.facudev.freelanceflow.domain.model.Credentials;
import com.facudev.freelanceflow.entity.CredentialsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CredentialsRepository extends JpaRepository<CredentialsEntity, Long> {

    List<Credentials> findByEmail(String email);

}
