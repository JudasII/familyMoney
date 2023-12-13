package com.example.cashCard.repositories;


import com.example.cashCard.models.CashCard;
import org.springframework.data.repository.CrudRepository;

public interface CashCardRepository extends CrudRepository<CashCard, Long> {
}