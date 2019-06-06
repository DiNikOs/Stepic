public abstract class KeywordAnalyzer implements  TextAnalyzer{

    protected abstract String[] getKeywords(String[] keywords);

    protected abstract String getLabel();

    public Label processText(String text){
        return null;
    }


}
