package org.example.modules.ratings.abstracts;

import org.example.entities.abstracts.RecipeAbstract;

public interface RatingComputationStrategyAbstract {
    void updateRatings(RecipeAbstract recipeAbstract, int rating);
    double computeImpact(RecipeAbstract recipeAbstract);
}
