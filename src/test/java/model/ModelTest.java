package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class ModelTest {
    @Test
    public void compareInputMonography() {
        Model model = new Model();
        assertTrue(model.compareInput("Einstein"));
    }
//    @Test
//    public void compareInputArticle(){
//        Model model = new Model();
//        assertTrue(model.compareInput("asd"));
//    }
//    @Test
//    public void startSearchInMonography() {
//
//    }
//
//    @Test
//    public void startSearchInArticle() {
//
//    }
}