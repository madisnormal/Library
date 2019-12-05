package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class ModelTest {
    @Test
    public void compareInputMonography() {
        Model model = new Model();
        assertTrue(model.compareInput("Einstein"));
    }
    @Test
    public void compareInputArticle(){
        Model model = new Model();
        assertTrue(model.compareInput("asd"));
    }
    @Test
    public void compareNullInput(){
        Model model = new Model();
        assertFalse(model.compareInput(""));
    }
    @Test
    public void startSearchInMonography() {
        Model model = new Model();
        assertNotNull(model.startSearchInMonography("Einstein"));
    }
    @Test
    public void startSearchInArticle() {
        Model model = new Model();
        assertNotNull(model.startSearchInArticle("qwerty"));

    }
}