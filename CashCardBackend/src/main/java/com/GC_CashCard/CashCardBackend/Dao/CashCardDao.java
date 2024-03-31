package com.GC_CashCard.CashCardBackend.Dao;



import com.GC_CashCard.CashCardBackend.Entities.CashCard;

import java.util.List;

public interface CashCardDao {
    List<CashCard> allCashCards(String owner);
    void saveCashCard(CashCard cashCard);
    void updateCashCardDao(CashCard cashCard);
    void deleteCashCardDao(int id);
    CashCard findById(int id);
}
