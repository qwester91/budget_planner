package com.gmail.harashchenia.dzmitry.pet.dao.api;

import com.gmail.harashchenia.dzmitry.pet.dao.entity.BudgetTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ITransactionDao extends JpaRepository<BudgetTransaction, UUID> {
}
