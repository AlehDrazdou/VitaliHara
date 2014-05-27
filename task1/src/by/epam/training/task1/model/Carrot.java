package by.epam.training.task1.model;

/**
 * Created with IntelliJ IDEA.
 * User: Senbon
 * Date: 18.05.14
 * Time: 13:14
 * To change this template use File | Settings | File Templates.
 */
public class Carrot extends Vegetable {

    public Carrot(){

    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "weight=" + this.getWeight() +
                ", calorie=" + this.getCalorie() +
                ", calorieAboutWeight=" + this.getCalorieAboutWeight() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if(!(super.equals(o))){
        	return false;
        }
        return true;
    }




}