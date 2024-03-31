package com.GC_CashCard.CashCardBackend.Service;


import com.GC_CashCard.CashCardBackend.Entities.CashCard;

import java.util.List;

public interface CashCardService {
    List<CashCard> getAllCashCards(String owner);
    void createCashCard(CashCard cashCard);
    void updateCashCard(CashCard cashCard);
    void deleteCashCard(int id);
    CashCard getById(int id);
}
