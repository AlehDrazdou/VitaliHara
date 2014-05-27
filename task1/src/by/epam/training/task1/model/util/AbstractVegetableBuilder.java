package by.epam.training.task1.model.util;

import by.epam.training.task1.exception.BuildException;
import by.epam.training.task1.model.Vegetable;
import by.epam.training.task1.util.DataStringUtil;

/**
 * Created with IntelliJ IDEA.
 * User: Senbon
 * Date: 18.05.14
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractVegetableBuilder {
    protected Vegetable vegetable;

    public Vegetable getVegetable() {
        return vegetable;
    }

    public abstract void createVegetable();

    public void buildWeightCapacity(int weight) {
    	getVegetable().setWeight(weight);
    }
    
    public void buildCalorieCapacity(int calorie) {
        getVegetable().setCalorie(calorie);
    }

    public abstract void buildColorCapacity(String color) throws BuildException ;

    public abstract void buildSalinityCapacity(String salinity) throws BuildException;

    public abstract void buildSizeCapacity(String size) throws BuildException;   

    public abstract void buildKindCapacity(String kind) throws BuildException;



}
