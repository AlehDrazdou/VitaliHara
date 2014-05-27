package by.epam.training.task1.model;

/**
 * Created with IntelliJ IDEA.
 * User: Senbon
 * Date: 18.05.14
 * Time: 12:56
 * To change this template use File | Settings | File Templates.
 */
public enum VegetableType {
    TOMATO("Tomato"), CARROT("Carrot"), RADISH("Radish"), CUCUMBER("Cucumber"), ONION("Onion"), PEPPER("Pepper") ;
    private String type;

    private VegetableType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * @return
     */
    public static VegetableType getVegetableType(String type){
        VegetableType result = null;
        for (VegetableType vegetableType : values()) {
            if (vegetableType.getType().equalsIgnoreCase(type)) {
                result = vegetableType;
                break;
            }
        }
        return result;
    }
}
