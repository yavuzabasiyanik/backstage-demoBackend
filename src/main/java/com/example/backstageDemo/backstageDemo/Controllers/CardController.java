package com.example.backstageDemo.backstageDemo.Controllers;

import com.example.backstageDemo.backstageDemo.Entities.CardEntity;
import com.example.backstageDemo.backstageDemo.Repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CardController {

    private CardRepository cardRepository;


    @Autowired
    public CardController(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @GetMapping("/cards")
    public List<CardEntity> getAllCards() {
        return cardRepository.findAll();
    }

    @PostMapping(value = "/cards", consumes = "application/json", produces = "application/json")
    public CardEntity createCards(@RequestBody CardEntity card) {
        return cardRepository.save(card);
    }


    @DeleteMapping("/cards/{id}")
    public void deleteCard(@PathVariable("id") long id) {

        cardRepository.deleteById(id);

    }













}
