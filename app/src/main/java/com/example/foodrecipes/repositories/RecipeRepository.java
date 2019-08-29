package com.example.foodrecipes.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.foodrecipes.models.Recipe;

import java.util.List;

public class RecipeRepository {
    private static RecipeRepository instance;
    private MutableLiveData<List<Recipe>> mRecipes;

    public static RecipeRepository getInstance() {
        if(instance == null) {
            instance = new RecipeRepository();
        }
        return instance;
    }

    public RecipeRepository() {
        mRecipes = new MutableLiveData<>();
    }

    public LiveData<List<Recipe>> getRecipes() {
        return mRecipes;
    }
}
