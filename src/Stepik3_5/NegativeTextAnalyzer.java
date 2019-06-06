package Stepik3_5;

public class NegativeTextAnalyzer extends  KeywordAnalyzer {

    private  String[] keywords;
    private  String text;
    private String[] negativeKeywords = {":(", "=(", ":|"};

    public NegativeTextAnalyzer() {
    }

    public String[] getKeywords() {
        return keywords;
    }

    public String getLabel() {
        return text;
    }

    @Override
    public Label processText(String text) {
        keywords = text.split(" ");
        for (String keyword : keywords) {
            for (String negativeKeyword : negativeKeywords) {
                if (keyword.equals(negativeKeyword)) return Label.NEGATIVE_TEXT;
            }
        }
        return Label.OK;
    }
}
