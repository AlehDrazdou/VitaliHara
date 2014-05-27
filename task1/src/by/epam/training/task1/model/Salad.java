package by.epam.training.task1.model;

import by.epam.training.task1.util.DataStringUtil;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Senbon
 * Date: 18.05.14
 * Time: 13:58
 * To change this template use File | Settings | File Templates.
 */
public class Salad {
    private List<Vegetable> vegetables;
    private float calorie;

    public Salad(){

    }

    public Salad(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    public float getCalorie() {
        calorie = (float) DataStringUtil.EMPTY;
        for(Vegetable vegetable : vegetables){
            calorie+=vegetable.getCalorieAboutWeight();
        }
        return calorie;
    }
}
