package com.gmail.harashchenia.dzmitry.pet.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class BudgetTransactionDto {
    private UUID uuid;
    private LocalDateTime timeOfTransaction;
    private BigDecimal amount;

    public BudgetTransactionDto(UUID uuid, LocalDateTime timeOfTransaction, BigDecimal amount) {
        this.uuid = uuid;
        this.timeOfTransaction = timeOfTransaction;
        this.amount = amount;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public LocalDateTime getTimeOfTransaction() {
        return timeOfTransaction;
    }

    public void setTimeOfTransaction(LocalDateTime timeOfTransaction) {
        this.timeOfTransaction = timeOfTransaction;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
