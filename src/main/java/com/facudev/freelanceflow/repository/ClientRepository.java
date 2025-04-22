package com.facudev.freelanceflow.repository;

import com.facudev.freelanceflow.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends JpaRepository<ClientEntity, Long> {



}
