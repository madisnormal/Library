package model;

import view.StringConstants;
import view.View;

public class Model {
    private View view = new View();
    private LinksFinders linksFinders = new LinksFinders();

    public Model() {
    }
    boolean indicator = false;
    boolean isLinkFound = false;
    public boolean compareInput(String input){
        view.printMessage(StringConstants.INPUT_ANSWER);
        Monography monography = startSearchInMonography(input);
        Article article = startSearchInArticle(input);
        if (!indicator) {
            view.printMessage(StringConstants.INPUT_WRONG);
            return false;
        }
        return decideFinder(monography, article);
    }

    public Monography startSearchInMonography(String input){
        Monography monographyTemp = null;
        isLinkFound = false;
        for (EnumMonography temp : EnumMonography.values()){
            monographyTemp = new Monography(temp.getTitle(), temp.getAuthor(), temp.getPublisher(), temp.getLinks());
            if (monographyTemp.compareStr().contains(input)){
                view.printMessage(StringConstants.ANSI_BRIGHT_BLUE + monographyTemp.toString() + StringConstants.ANSI_RESET);
                indicator = isLinkFound = true;
                break;
            }
        }
        return !isLinkFound ? null : monographyTemp;
    }
    public Article startSearchInArticle(String input){
        Article articleTemp = null;
        isLinkFound = false;
        for (EnumArticle temp : EnumArticle.values()){
            articleTemp = new Article(temp.getTitle(), temp.getAuthor(), temp.getPublisher(), temp.getLinks());
            if (articleTemp.compareStr().contains(input)){
                view.printMessage(StringConstants.ANSI_BRIGHT_PURPLE + articleTemp.toString() + StringConstants.ANSI_RESET);
                indicator = isLinkFound = true;
                break;
            }
        }
        return !isLinkFound ? null : articleTemp;
    }
    private boolean decideFinder(Monography monography, Article article) {
        if (monography != null && article != null) linksFinders.linksFinder(monography, article);
        else if (monography != null) linksFinders.linksFinder(monography);
        else if (article != null) linksFinders.linksFinder(article);
        return true;
    }
}