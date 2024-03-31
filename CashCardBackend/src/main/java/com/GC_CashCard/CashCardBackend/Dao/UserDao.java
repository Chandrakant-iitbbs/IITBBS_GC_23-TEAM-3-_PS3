package com.GC_CashCard.CashCardBackend.Dao;


import com.GC_CashCard.CashCardBackend.Entities.User;

public interface UserDao {
    void saveUser(User user);
    User findByUsername(String username);
}
