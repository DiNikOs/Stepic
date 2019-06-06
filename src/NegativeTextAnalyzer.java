public class NegativeTextAnalyzer extends  KeywordAnalyzer {

    private  String[] keywords;
    private  String text;

    public NegativeTextAnalyzer(String[] keywords, String text) {
        this.keywords = keywords;
        this.text = text;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public String getLabel() {
        return text;
    }

    public Label processText(String text) {
        return (text.length()<=this.maxLength) ? Label.NEGATIVE_TEXT: Label.OK;
    }
}
