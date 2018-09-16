package com.retail.core;

public class LineItem {
    private String description;
    private double cost;
    private String category;
    public LineItem(String description, double cost,String category) {
        this.description = description;
        this.cost = cost;
	this.category = category;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double costInCents) {
        this.cost = cost;
    }

    public void setCategory(String category)
    {
	this.category = category;
     }
      public String getCategory() {
        return category;
    }
}
