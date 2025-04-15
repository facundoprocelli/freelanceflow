package com.facudev.freelanceflow.repository;

import com.facudev.freelanceflow.domain.model.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CredentialsRepository extends JpaRepository<CredentialsRepository, Long> {

    List<Credentials> findByEmail(String email);

}
