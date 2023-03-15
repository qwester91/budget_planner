package com.gmail.harashchenia.dzmitry.pet.service.api;

import com.gmail.harashchenia.dzmitry.pet.dto.BudgetTransactionDto;

import java.util.UUID;

public interface ITransactionSetvice {
    BudgetTransactionDto getTransactionByUuid(UUID uuid);
}
