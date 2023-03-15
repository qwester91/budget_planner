package com.gmail.harashchenia.dzmitry.pet.controllers;

import com.gmail.harashchenia.dzmitry.pet.dto.BudgetTransactionDto;
import com.gmail.harashchenia.dzmitry.pet.service.api.ITransactionSetvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping ("/planner/")
public class PlannerController {
    private ITransactionSetvice service;

    public PlannerController(ITransactionSetvice service) {
        this.service = service;
    }

    @GetMapping("operations/{id}")
    public BudgetTransactionDto getTransactionById(@PathVariable (name = "id") UUID uuid){
       return service.getTransactionByUuid(uuid);
    }
}
