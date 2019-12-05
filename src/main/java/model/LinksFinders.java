package model;

import view.StringConstants;
import view.View;

public class LinksFinders {
    public LinksFinders() {
    }

    private View view = new View();

    public void linksFinder(Monography monoTemp){
        String[] monoLinksArray = monoTemp.getLinks().split(",");
        StringBuilder result = new StringBuilder();
        searchMonography(monoLinksArray, result);
        searchArticle(monoLinksArray, result);
        examineResult(result);
    }

    public void linksFinder(Article artTemp){
        String[] artLinksArray = artTemp.getLinks().split(",");
        StringBuilder result = new StringBuilder();
        searchMonography(artLinksArray, result);
        searchArticle(artLinksArray, result);
        examineResult(result);
    }

    public void linksFinder(Monography monoTemp, Article artTemp){
        String[] monoLinksArray = monoTemp.getLinks().split(",");
        String[] artLinksArray = artTemp.getLinks().split(",");
        StringBuilder result = new StringBuilder();
        searchMonography(monoLinksArray, result);
        searchArticle(artLinksArray, result);
        examineResult(result);
    }

    private void examineResult(StringBuilder result) {
        if (!result.toString().equals("") && !result.toString().equals("-")) {
            view.printBundle(StringConstants.INPUT_LINKS);
            view.printMessage(result.toString());
        } else view.printBundle(StringConstants.INPUT_HAS_NO_LINKS);
    }
    private void searchArticle(String[] monoLinksArray, StringBuilder result) {
        for (EnumArticle temp : EnumArticle.values()) {
            for (String kek : monoLinksArray) {
                if (kek.equals(temp.getTitle())) {
                    result.append(StringConstants.ANSI_BRIGHT_PURPLE).append(temp.toString()).append(StringConstants.ANSI_RESET);
                    result.append("\n");
                }
            }
        }
    }

    private void searchMonography(String[] monoLinksArray, StringBuilder result) {
        for (EnumMonography temp : EnumMonography.values()) {
            for (String lol : monoLinksArray) {
                if (lol.equals(temp.getTitle())) {
                    result.append(StringConstants.ANSI_BRIGHT_BLUE).append(temp.toString()).append(StringConstants.ANSI_RESET);
                    result.append("\n");
                }
            }
        }
    }
}
