package model;

import view.StringConstants;
import view.View;

public class Model {
    private View view = new View();
    private LinksFinders linksFinders = new LinksFinders();

    public Model() {
    }

    //Utility variables
    boolean indicator = false;
    boolean isLinkFound = false;

    /**
     *
     * @param input
     * @return
     */
    public boolean compareInput(String input){
        if (input.trim().length() == 0) return false;
        view.printBundle(StringConstants.INPUT_ANSWER);
        Monography monography = startSearchInMonography(input);
        Article article = startSearchInArticle(input);
        if (!indicator) {
            view.printBundle(StringConstants.INPUT_WRONG);
            return false;
        }
        return decideFinder(monography, article);
    }

    /**
     *
     * @param input
     * @return
     */
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

    /**
     *
     * @param input
     * @return
     */
    public Article startSearchInArticle(String input){
        Article articleTemp = null;
        isLinkFound = false;
        for (EnumArticle temp : EnumArticle.values()){
            articleTemp = new Article(temp.getTitle(), temp.getAuthor(), temp.getPublisher(), temp.getLinks());
            if (articleTemp.compareStr().contains(input)){
                view.printMessage(StringConstants.ANSI_BRIGHT_PURPLE + articleTemp.toString() + StringConstants.ANSI_RESET + "");
                indicator = isLinkFound = true;
                break;
            }
        }
        return !isLinkFound ? null : articleTemp;
    }

    /**
     *
     * @param monography
     * @param article
     * @return
     */
    private boolean decideFinder(Monography monography, Article article) {
        if (monography != null && article != null) linksFinders.linksFinder(monography, article);
        else if (monography != null) linksFinders.linksFinder(monography);
        else if (article != null) linksFinders.linksFinder(article);
        return true;
    }
}