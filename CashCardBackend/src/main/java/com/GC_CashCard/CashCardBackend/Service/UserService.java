package com.GC_CashCard.CashCardBackend.Service;


import com.GC_CashCard.CashCardBackend.Entities.User;

public interface UserService {
    void createUser(User user);
    User findUserByUsername(String username);
}
