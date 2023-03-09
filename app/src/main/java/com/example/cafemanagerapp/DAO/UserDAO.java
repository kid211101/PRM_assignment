package com.example.cafemanagerapp.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cafemanagerapp.Entity.User;

import java.util.List;

@Dao
public interface UserDAO {
    @Query("SELECT * FROM User")
    List<User> getAll();

    @Insert
    void insert(User user);

    @Update
    void update(User user);

    @Delete
    void delete(User user);

    @Query("SELECT * FROM User WHERE username = (:username) AND password = (:password)")
    int KiemTraDN(String username, String password);

    @Query("SELECT * FROM User WHERE user_id=(:user_id)")
    User LayNVTheoMa(int user_id);

    @Query("SELECT COUNT(*) FROM User")
    int getUserCount();

}
