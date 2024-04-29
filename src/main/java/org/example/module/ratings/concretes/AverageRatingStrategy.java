package org.example.module.ratings.concretes;

import org.example.entity.abstracts.Recipe;
import org.example.module.ratings.RatingComputationStrategy;

public class AverageRatingStrategy implements RatingComputationStrategy {
    @Override
    public void updateRatings(Recipe recipe, int rating) {
        recipe.setTotalRatings(recipe.getTotalRatings() + 1);
        recipe.setAverageRating((recipe.getAverageRating() * (recipe.getTotalRatings() - 1) + rating) / recipe.getTotalRatings());
    }

    @Override
    public double computeImpact(Recipe recipe) {
        return recipe.getAverageRating();
    }
}
