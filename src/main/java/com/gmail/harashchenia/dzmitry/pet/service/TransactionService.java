package com.gmail.harashchenia.dzmitry.pet.service;

import com.gmail.harashchenia.dzmitry.pet.dto.BudgetTransactionDto;
import com.gmail.harashchenia.dzmitry.pet.service.api.ITransactionSetvice;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class TransactionService implements ITransactionSetvice {
    @Override
    public BudgetTransactionDto getTransactionByUuid(UUID uuid) {
        return null;
    }
}
