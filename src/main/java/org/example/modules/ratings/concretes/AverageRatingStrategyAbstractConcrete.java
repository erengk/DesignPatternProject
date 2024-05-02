package org.example.modules.ratings.concretes;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.modules.ratings.abstracts.RatingComputationStrategyAbstract;

public class AverageRatingStrategyAbstractConcrete implements RatingComputationStrategyAbstract {
    @Override
    public void updateRatings(RecipeAbstract recipeAbstract, int rating) {
        recipeAbstract.setTotalRatings(recipeAbstract.getTotalRatings() + 1);
        recipeAbstract.setAverageRating((recipeAbstract.getAverageRating() * (recipeAbstract.getTotalRatings() - 1) + rating) / recipeAbstract.getTotalRatings());
    }

    @Override
    public double computeImpact(RecipeAbstract recipeAbstract) {
        return recipeAbstract.getAverageRating();
    }
}
