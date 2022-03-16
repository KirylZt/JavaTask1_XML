package by.javacource.task2.validator;

import by.javacource.task1.exception.CardException;
import by.javacource.task1.validator.CardSchemeValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CardSchemeValidatorTest {

    @Test
    public void checkXMLFile() throws CardException {
        boolean actual = CardSchemeValidator.getInstance().checkXMLFile("data/cards.xml");
        Assert.assertTrue(actual, "validation of XML scheme failed.");
    }
}
