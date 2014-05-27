package by.epam.training.task1.exception;

import org.xml.sax.SAXException;

/**
 * Created with IntelliJ IDEA.
 * User: Senbon
 * Date: 18.05.14
 * Time: 14:39
 * To change this template use File | Settings | File Templates.
 */
public class SaladException extends SAXException {
    /**
     *
     * Constructor for Depot exception
     * @param text
     */
    public SaladException(String text){
        super(text);
    }

    /**
     *
     * Constructor for Depot exception
     * @param text
     * @param exception
     */
    public SaladException(String text, Exception exception){
        super(text,exception);
    }
}
