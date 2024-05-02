package org.example.entities.abstracts;

import org.example.entities.concretes.CategoryConcrete;
import org.example.entities.concretes.IngredientConcrete;
import org.example.entities.concretes.TagConcrete;
import org.example.modules.creation.concretes.RecipeTypeConcrete;
import org.example.modules.ratings.abstracts.RatingComputationStrategyAbstract;
import org.example.modules.ratings.concretes.AverageRatingStrategyAbstractConcrete;
import org.example.modules.ratings.concretes.TotalRatingsStrategyAbstractConcrete;

import java.util.*;

public abstract class RecipeAbstract {
    private Long id;

    private String name;

    private String description;

    private int size;

    private RecipeTypeConcrete type;

    private final List<IngredientConcrete> ingredientConcretes = new LinkedList<>();

    private final Set<CategoryConcrete> categories = new HashSet<>(3);

    private final Set<TagConcrete> tagConcretes = new HashSet<>(3);

    private ArrayList<String> instructions = new ArrayList<>();


    private RatingComputationStrategyAbstract ratingComputationStrategyAbstract;
    private int totalRatings;
    private double averageRating;

    public RecipeAbstract(String name, String description, int size) {
        this.id = new Random().nextLong();
        this.name = name;
        this.description = description;
        this.size = size;
        ratingComputationStrategyAbstract = new AverageRatingStrategyAbstractConcrete(); // default strategy
        categories.add(CategoryConcrete.NONE);
    }

    // Handling ratings and its impact with strategy pattern
    public void setRatingComputationStrategy(TotalRatingsStrategyAbstractConcrete strategy) {
        ratingComputationStrategyAbstract = strategy;
    }

    public void addRating(int rating) {
        // Update average rating and total ratings
        ratingComputationStrategyAbstract.updateRatings(this, rating);
    }

    public double getImpact() {
        return ratingComputationStrategyAbstract.computeImpact(this);
    }

    public double getAverageRating() {
        return averageRating;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }
    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }




    public ArrayList<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(ArrayList<String> instructions) {
        this.instructions = instructions;
    }

    public void addIngredient(IngredientConcrete ingredientConcrete) {
        ingredientConcretes.add(ingredientConcrete);
    }

    public void addCategory(CategoryConcrete categoryConcrete) {
        categories.remove(CategoryConcrete.NONE);

        if (categories.size() < 3) {
            categories.add(categoryConcrete);
        } else {
            System.out.println("You can't add more than 3 categories");
        }

    }

    public void addTag(TagConcrete tagConcrete) {
        if (tagConcretes.size() < 3) {
            tagConcretes.add(tagConcrete);
        } else {
            System.out.println("You can't add more than 3 tagConcretes");
        }
    }

    public void setCategories(HashSet<CategoryConcrete> categories) {
        this.categories.clear();
        for (CategoryConcrete categoryConcrete : categories) {
            this.categories.add(categoryConcrete);
        }
    }

    public void setTags(HashSet<TagConcrete> tagConcretes) {
        this.tagConcretes.clear();
        for (TagConcrete tagConcrete : tagConcretes) {
            this.tagConcretes.add(tagConcrete);
        }
    }

    public void removeIngredient(IngredientConcrete ingredientConcrete) {
        ingredientConcretes.remove(ingredientConcrete);
    }

    public void removeCategory(CategoryConcrete categoryConcrete) {
        categories.remove(categoryConcrete);
    }

    public void removeTag(TagConcrete tagConcrete) {
        tagConcretes.remove(tagConcrete);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<IngredientConcrete> getIngredients() {
        return ingredientConcretes;
    }

    public void setIngredients(List<IngredientConcrete> ingredientConcretes) {
        this.ingredientConcretes.clear();
        this.ingredientConcretes.addAll(ingredientConcretes);
    }

    public Set<CategoryConcrete> getCategories() {
        return categories;
    }

    public Set<TagConcrete> getTags() {
        return tagConcretes;
    }

    public RecipeTypeConcrete getType() {
        return type;
    }

    public void setType(RecipeTypeConcrete type) {
        this.type = type;
    }
}
