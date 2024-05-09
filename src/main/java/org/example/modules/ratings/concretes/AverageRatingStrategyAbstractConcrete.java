package org.example.modules.ratings.concretes;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.modules.ratings.abstracts.RatingComputationStrategyAbstract;

public class AverageRatingStrategyAbstractConcrete implements RatingComputationStrategyAbstract {
    public void updateRatings(RecipeAbstract recipe, int rating) {
        int totalRatings = recipe.getTotalRatings() + 1;
        double newAverage = (recipe.getAverageRating() * (totalRatings - 1) + rating) / (double) totalRatings;

        recipe.setTotalRatings(totalRatings);
        recipe.setAverageRating(newAverage);
    }

    @Override
    public double computeImpact(RecipeAbstract recipe) {
        return recipe.getAverageRating();
    }
}
