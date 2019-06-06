package Stepik3_5;

public abstract class KeywordAnalyzer implements  TextAnalyzer{

    private  String[] keywords;
    private String text;


    protected abstract String[] getKeywords();

    protected abstract String getLabel();

    public Label processText(String text){
        return null;
    }

}
