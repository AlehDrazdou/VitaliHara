package by.epam.training.task1.model;

import by.epam.training.task1.util.DataStringUtil;

/**
 * Created with IntelliJ IDEA.
 * User: Senbon
 * Date: 18.05.14
 * Time: 13:14
 * To change this template use File | Settings | File Templates.
 */
public class Cucumber extends Vegetable {
    private String salinity;

    public Cucumber(){

    }

    public String getSalinity() {
        return salinity;
    }

    public void setSalinity(String salinity) {
        this.salinity = salinity;
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "weight=" + this.getWeight() +
                ", calorie=" + this.getCalorie() +
                ", calorieAboutWeight=" + this.getCalorieAboutWeight() +
                ", salinity=" + this.getSalinity() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        Cucumber cucumber = (Cucumber) o;

        if (this.getSalinity() != null ? !this.getSalinity().equals(cucumber.getSalinity()) : cucumber.getSalinity() != null){
            return false;
        }
        if(!(super.equals(o))){
        	return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = this.getSalinity() != null ? this.getSalinity().hashCode() : DataStringUtil.EMPTY;
        result = DataStringUtil.HASH_CODE_RANDOM_NUMBER * result ;
        return result+super.hashCode();
    }

}