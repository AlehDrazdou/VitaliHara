package by.epam.training.task1.model;

import by.epam.training.task1.util.DataStringUtil;

/**
 * Created with IntelliJ IDEA.
 * User: Senbon
 * Date: 18.05.14
 * Time: 13:08
 * To change this template use File | Settings | File Templates.
 */
public class Tomato extends Vegetable {
    private String color;
    private String size;

    public Tomato(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        Tomato tomato = (Tomato) o;

        if (color != null ? !color.equals(tomato.color) : tomato.color != null){
            return false;
        }
        if (size != null ? !size.equals(tomato.size) : tomato.size != null){
            return false;
        }
        if(!(super.equals(o))){
        	return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : DataStringUtil.EMPTY;
        result = DataStringUtil.HASH_CODE_RANDOM_NUMBER * result + (size != null ? size.hashCode() : DataStringUtil.EMPTY);
        return result+super.hashCode();
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName()+"{" +
                "weight=" + this.getWeight() +
                ", calorie=" + this.getCalorie() +
                ", calorieAboutWeight=" + this.getCalorieAboutWeight() +
                ", color=" + this.getColor() +
                ", size=" + this.getSize() +
                '}';
    }
}
