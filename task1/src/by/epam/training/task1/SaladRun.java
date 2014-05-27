package by.epam.training.task1;

import by.epam.training.task1.exception.SaladException;
import by.epam.training.task1.model.Salad;
import by.epam.training.task1.model.Vegetable;
import by.epam.training.task1.model.Chef;
import by.epam.training.task1.parser.SAXInputParser;
import by.epam.training.task1.util.DataStringUtil;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Senbon
 * Date: 18.05.14
 * Time: 14:43
 * To change this template use File | Settings | File Templates.
 */
public class SaladRun {
    public static final Logger log = Logger.getLogger(SaladRun.class);

    public static void main(String [] args) throws ParserConfigurationException, SAXException, IOException {
        try{
        SAXInputParser saxInputParser = new SAXInputParser(DataStringUtil.XML_READ_FILE);
        List<Vegetable> vegetables = saxInputParser.getVegetables();
        Chef chef = new Chef(vegetables); 
        if(chef.getSalad().getVegetables().size() == DataStringUtil.EMPTY){
            System.err.print(DataStringUtil.SALAD_EMPTY_MESSAGE);
        }
        sortData(chef.getSalad().getVegetables());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range of calories: ");
        float firstRange;
        firstRange = Float.parseFloat(scanner.next());
        float secondRange;
        secondRange = Float.parseFloat(scanner.next());
        List<Vegetable> checkedVegetables = checkVegetables(chef.getSalad().getVegetables(), firstRange, secondRange);
            if(checkedVegetables.size()==DataStringUtil.EMPTY){
                System.err.println(DataStringUtil.VEGETABLES_EMPTY_MESSAGE);
            } else {
                for (Vegetable vegetable : checkedVegetables){
                    System.out.println(vegetable.toString());
                }
            }
        } catch (SaladException de){
            log.error(DataStringUtil.INCORRECT_DATA_INPUT, de.fillInStackTrace());
        } catch (SAXException se){
            log.error(DataStringUtil.INCORRECT_DATA_INPUT, se.fillInStackTrace());
        } catch (NumberFormatException nfe){
            log.error(DataStringUtil.INCORRECT_DATA_INPUT, nfe.fillInStackTrace());
        } catch (NullPointerException e){
            log.error(DataStringUtil.INCORRECT_DATA_INPUT, e.fillInStackTrace());
        }
    }

    /**
     *
     * @param vegetables
     */
    private static void sortData(List<Vegetable> vegetables){
        Collections.sort(vegetables, new Comparator<Vegetable>() {
            @Override
            public int compare(Vegetable o1, Vegetable o2) {
                return (int) (o1.getCalorieAboutWeight() - o2.getCalorieAboutWeight());
            }
        });
    }

    /**
     *
     * @param vegetables
     * @param firstRange
     * @param secondRange
     */
    private static List<Vegetable> checkVegetables(List<Vegetable> vegetables, float firstRange, float secondRange){
        List<Vegetable> checkedVegetables = new ArrayList<Vegetable>();
        for(Vegetable vegetable: vegetables){
            if((vegetable.getCalorieAboutWeight()>=firstRange) && (vegetable.getCalorieAboutWeight()<=secondRange)){
                checkedVegetables.add(vegetable);
            }
        }
        return checkedVegetables;
    }
}
