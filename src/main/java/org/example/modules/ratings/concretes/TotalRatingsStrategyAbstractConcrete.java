package org.example.modules.ratings.concretes;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.modules.ratings.abstracts.RatingComputationStrategyAbstract;

public class TotalRatingsStrategyAbstractConcrete implements RatingComputationStrategyAbstract {
    @Override
    public void updateRatings(RecipeAbstract recipeAbstract, int rating) {
        recipeAbstract.setTotalRatings(recipeAbstract.getTotalRatings() + 1);
    }

    @Override
    public double computeImpact(RecipeAbstract recipeAbstract) {
        return recipeAbstract.getTotalRatings();
    }

}
