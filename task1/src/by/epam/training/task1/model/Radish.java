package by.epam.training.task1.model;

import by.epam.training.task1.util.DataStringUtil;

/**
 * Created with IntelliJ IDEA.
 * User: Senbon
 * Date: 18.05.14
 * Time: 13:15
 * To change this template use File | Settings | File Templates.
 */
public class Radish extends Vegetable {
    private String size;

    public Radish(){

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "weight=" + this.getWeight() +
                ", calorie=" + this.getCalorie() +
                ", calorieAboutWeight=" + this.getCalorieAboutWeight() +
                ", size=" + this.getSize() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        Radish radish = (Radish) o;

        if (this.getSize() != null ? !this.getSize().equals(radish.getSize()) : radish.getSize() != null){
            return false;
        }
        if(!(super.equals(o))){
        	return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = this.getSize() != null ? this.getSize().hashCode() : DataStringUtil.EMPTY;
        result = DataStringUtil.HASH_CODE_RANDOM_NUMBER * result;
        return result+super.hashCode();
    }
}