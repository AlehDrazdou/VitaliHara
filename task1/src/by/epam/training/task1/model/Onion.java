package by.epam.training.task1.model;

import by.epam.training.task1.util.DataStringUtil;

/**
 * Created with IntelliJ IDEA.
 * User: Senbon
 * Date: 18.05.14
 * Time: 13:15
 * To change this template use File | Settings | File Templates.
 */
public class Onion extends Vegetable {
    private String kind;

    public Onion(){

    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "weight=" + this.getWeight() +
                ", calorie=" + this.getCalorie() +
                ", calorieAboutWeight=" + this.getCalorieAboutWeight() +
                ", kind=" + this.getKind() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        Onion onion = (Onion) o;

        if (this.getKind() != null ? !this.getKind().equals(onion.getKind()) : onion.getKind() != null){
            return false;
        }
        if(!(super.equals(o))){
        	return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = this.getKind() != null ? this.getKind().hashCode() : DataStringUtil.EMPTY;
        result = DataStringUtil.HASH_CODE_RANDOM_NUMBER * result;
        return result+super.hashCode();
    }

}