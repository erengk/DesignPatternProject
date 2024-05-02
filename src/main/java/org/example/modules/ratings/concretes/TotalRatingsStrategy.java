package org.example.modules.ratings.concretes;

import org.example.entities.abstracts.Recipe;
import org.example.modules.ratings.abstracts.RatingComputationStrategy;

public class TotalRatingsStrategy implements RatingComputationStrategy {
    @Override
    public void updateRatings(Recipe recipe, int rating) {
        recipe.setTotalRatings(recipe.getTotalRatings() + 1);
    }

    @Override
    public double computeImpact(Recipe recipe) {
        return recipe.getTotalRatings();
    }

}
