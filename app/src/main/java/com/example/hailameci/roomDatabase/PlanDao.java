package com.example.hailameci.roomDatabase;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.hailameci.roomDatabase.Plan;

import java.util.List;

@Dao
public interface PlanDao {

    @Insert
    void insert(Plan plan);

    @Update
    void update(Plan plan);

    @Delete
    void delete(Plan plan);

    @Query("DELETE FROM plan_table")
    void deleteAllPlans();

    @Query("SELECT * FROM plan_table ORDER BY arrivalDate")
    LiveData<List<Plan>> getAllPlans();

}
