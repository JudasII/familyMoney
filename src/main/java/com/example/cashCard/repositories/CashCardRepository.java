package com.example.cashCard.repositories;


import com.example.cashCard.models.CashCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CashCardRepository extends CrudRepository<CashCard, Long>,PagingAndSortingRepository<CashCard, Long> {
}