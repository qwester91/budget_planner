package com.gmail.harashchenia.dzmitry.pet.service;

import com.gmail.harashchenia.dzmitry.pet.dto.BudgetTransaction;
import com.gmail.harashchenia.dzmitry.pet.service.api.ITransactionSetvice;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class TransactionService implements ITransactionSetvice {
    @Override
    public BudgetTransaction getTransactionByUuid(UUID uuid) {
        return null;
    }
}
