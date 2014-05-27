package by.epam.training.task1.model;

import by.epam.training.task1.util.DataStringUtil;

/**
 * Created with IntelliJ IDEA.
 * User: Senbon
 * Date: 18.05.14
 * Time: 12:50
 * To change this template use File | Settings | File Templates.
 */
public abstract class Vegetable {
    private int weight;
    private int calorie;
    private float calorieAboutWeight;

    public Vegetable() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public float getCalorieAboutWeight() {
        this.calorieAboutWeight = (float) this.getWeight()*this.getCalorie()/ DataStringUtil.CALORIE_COUNT;
        return this.calorieAboutWeight;
    }

    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vegetable)) return false;

        Vegetable vegetable = (Vegetable) o;

        if (calorie != vegetable.calorie) return false;
        if (Float.compare(vegetable.calorieAboutWeight, calorieAboutWeight) != 0) return false;
        if (weight != vegetable.weight) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + calorie;
        result = 31 * result + (calorieAboutWeight != +0.0f ? Float.floatToIntBits(calorieAboutWeight) : 0);
        return result;
    }
}

