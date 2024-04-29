package org.example.module.ratings;

import org.example.entity.abstracts.Recipe;

public interface RatingComputationStrategy {
    void updateRatings(Recipe recipe, int rating);
    double computeImpact(Recipe recipe);
}
