package com.facudev.freelanceflow.repository;

import com.facudev.freelanceflow.domain.model.Budget;
import com.facudev.freelanceflow.entity.BudgetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BudgetRepository extends JpaRepository<BudgetEntity, Long> {

List<Budget> findByAmount(float amount);
}
