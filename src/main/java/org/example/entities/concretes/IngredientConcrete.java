package org.example.entities.concretes;

public class IngredientConcrete {
    private Long id;


    private String name;

    private double amount;

    private UnitConcrete unitConcrete;

    public IngredientConcrete(String name, double amount, UnitConcrete unitConcrete) {
        this.name = name;
        this.amount = amount;
        this.unitConcrete = unitConcrete;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public UnitConcrete getUnit() {
        return unitConcrete;
    }

    public void setUnit(UnitConcrete unitConcrete) {
        this.unitConcrete = unitConcrete;
    }
}
