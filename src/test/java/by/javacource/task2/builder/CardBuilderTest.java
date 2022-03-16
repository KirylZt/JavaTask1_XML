package by.javacource.task2.builder;

import by.javacource.task1.builder.CardDomBuilder;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CardBuilderTest {
    private CardDomBuilder cardDomBuilder;

    @BeforeTest
    public void init() {
        cardDomBuilder = new CardDomBuilder();
    }

    @Test
    public void buildSetCards() {
        int expected = 16;
        cardDomBuilder.buildSetCards("data/cards.xml");
        int actual = cardDomBuilder.getPostalCards().size();
        Assert.assertEquals(actual, expected, "data reading from XML file is invalid");
    }
}
