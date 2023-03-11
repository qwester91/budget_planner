package com.gmail.harashchenia.dzmitry.pet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping ("/planner/")
public class PlannerController {

    @GetMapping("operations/{id}")
    public String getTransactionById(@PathVariable (name = "id") UUID uuid){
       return "ghjldfjhdskh";
    }
}
