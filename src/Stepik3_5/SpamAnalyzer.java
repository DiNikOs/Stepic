package Stepik3_5;

public class SpamAnalyzer extends KeywordAnalyzer {

    private  String[] keywords;
    private String text;
    private String[] spamKeywords;

    public SpamAnalyzer(String[] spamKeywords) {
        this.spamKeywords = spamKeywords;
    }

    protected String[] getKeywords() {
        return keywords;
    }

    protected String getLabel() {
        return text;
    }

    @Override
    public Label processText(String text) {
        keywords = text.split(" ");
        for (int i = 0; i < keywords.length; i++) {
            String keyword = keywords[i];
            if (keyword.equals(spamKeywords[0])||keyword.equals(spamKeywords[1])) return Label.SPAM;
        }
        return Label.OK;
    }
}
