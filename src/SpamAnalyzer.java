public class SpamAnalyzer extends KeywordAnalyzer {

    private  String[] keywords;
    private  String text;

    public SpamAnalyzer(String[] keywords, String text) {
        this.keywords = keywords;
        this.text = text;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public String getLabel() {
        return text;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
