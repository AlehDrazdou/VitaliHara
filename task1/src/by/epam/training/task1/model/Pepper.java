package by.epam.training.task1.model;

import by.epam.training.task1.util.DataStringUtil;

/**
 * Created with IntelliJ IDEA.
 * User: Senbon
 * Date: 18.05.14
 * Time: 13:14
 * To change this template use File | Settings | File Templates.
 */
public class Pepper extends Vegetable {
    private String color;

    public Pepper(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "weight=" + this.getWeight() +
                ", calorie=" + this.getCalorie() +
                ", calorieAboutWeight=" + this.getCalorieAboutWeight() +
                ", color=" + this.getColor() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Pepper pepper = (Pepper) o;

        if (this.getColor() != null ? !this.getColor().equals(pepper.getColor()) : pepper.getColor() != null){
            return false;
        }
        if(!(super.equals(o))){
        	return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = this.getColor() != null ? this.getColor().hashCode() : DataStringUtil.EMPTY;
        result = DataStringUtil.HASH_CODE_RANDOM_NUMBER * result;
        return result+super.hashCode();
    }
}