package by.epam.training.task1.parser;

import by.epam.training.task1.model.Vegetable;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * SAXInputParser
 * User: Senbon
 * Date: 03.02.14
 * Time: 18:05
 * To change this template use File | Settings | File Templates.
 */
public class SAXInputParser {
    private SaladHandler saladHandler;

    /**
     *
     * @param path
     * @throws java.io.IOException
     * @throws org.xml.sax.SAXException
     * @throws javax.xml.parsers.ParserConfigurationException
     */
        public SAXInputParser(String path) throws IOException, SAXException, ParserConfigurationException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        factory.setValidating(true);
        factory.setNamespaceAware(false);
        factory.setXIncludeAware(false);
        saladHandler = new SaladHandler();
        parser.parse(new File(path), saladHandler);
    }

    public List<Vegetable> getVegetables() {
        return saladHandler.getVegetables();
    }

}
