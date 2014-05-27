package by.epam.training.task1.parser;

import by.epam.training.task1.exception.BuildException;
import by.epam.training.task1.exception.SaladException;
import by.epam.training.task1.model.Vegetable;
import by.epam.training.task1.model.VegetableType;
import by.epam.training.task1.model.util.*;
import by.epam.training.task1.util.DataStringUtil;
import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * SaladHandler
 * User: Senbon
 * Date: 03.02.14
 * Time: 19:33
 * To change this template use File | Settings | File Templates.
 */

public class SaladHandler extends DefaultHandler {
    public static final Logger log = Logger.getLogger(SaladHandler.class);

    private List<Vegetable> vegetables;
    private String value;
    private AbstractVegetableBuilder vegetableBuilder;

    @Override
    public void startDocument() throws SAXException
    {
        vegetables = new ArrayList<Vegetable>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
        value = "";
        if (qName.equalsIgnoreCase(DataStringUtil.XML_ATTR_VEGETABLE)) {
            String type = attributes.getValue(DataStringUtil.XML_ATTR_TYPE);

            VegetableType vegetableType = VegetableType.getVegetableType(type);
            if (vegetableType != null) {
                switch (vegetableType){
                    case CARROT:
                        vegetableBuilder = new CarrotBuilder();
                        break;

                    case CUCUMBER:
                        vegetableBuilder = new CucumberBuilder();
                        break;

                    case ONION:
                        vegetableBuilder = new OnionBuilder();
                        break;

                    case PEPPER:
                        vegetableBuilder = new PepperBuilder();
                        break;

                    case RADISH:
                        vegetableBuilder = new RadishBuilder();
                        break;

                    case TOMATO:
                        vegetableBuilder = new TomatoBuilder();
                        break;
                }
                vegetableBuilder.createVegetable();
            } else {
                throw new SaladException(DataStringUtil.BAD_TYPE_VEGETABLE);
            }
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException
    {
       value = new String(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException
    {   try{
    	if (qName.equalsIgnoreCase(DataStringUtil.XML_ATTR_VEGETABLE)){
            vegetables.add(vegetableBuilder.getVegetable());
        } else if (qName.equalsIgnoreCase(DataStringUtil.XML_ATTR_WEIGHT)) {
            vegetableBuilder.buildWeightCapacity(Integer.valueOf(value));
        } else if (qName.equalsIgnoreCase(DataStringUtil.XML_ATTR_CALORIE)) {
            vegetableBuilder.buildCalorieCapacity(Integer.valueOf(value));
        } else if (qName.equalsIgnoreCase(DataStringUtil.XML_ATTR_SALINITY)) {
            vegetableBuilder.buildSalinityCapacity(value);
        } else if (qName.equalsIgnoreCase(DataStringUtil.XML_ATTR_KIND)) {
            vegetableBuilder.buildKindCapacity(value);
        } else if (qName.equalsIgnoreCase(DataStringUtil.XML_ATTR_COLOR)) {
            vegetableBuilder.buildColorCapacity(value);
        } else if (qName.equalsIgnoreCase(DataStringUtil.XML_ATTR_SIZE)) {
            vegetableBuilder.buildSizeCapacity(value);
        }} catch (BuildException e) {
			
			e.printStackTrace();
		}
    
    }

    @Override
    public void endDocument() throws SAXException
    {
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }


}
