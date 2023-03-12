package com.gmail.harashchenia.dzmitry.pet.service.api;

import com.gmail.harashchenia.dzmitry.pet.dto.BudgetTransaction;
import jakarta.transaction.Transaction;

import java.util.UUID;

public interface ITransactionSetvice {
    BudgetTransaction getTransactionByUuid(UUID uuid);
}
