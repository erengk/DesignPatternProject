package org.example.modules.ratings.abstracts;

import org.example.entities.abstracts.Recipe;

public interface RatingComputationStrategy {
    void updateRatings(Recipe recipe, int rating);
    double computeImpact(Recipe recipe);
}
