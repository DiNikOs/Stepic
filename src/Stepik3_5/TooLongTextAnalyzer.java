package Stepik3_5;

public class TooLongTextAnalyzer implements TextAnalyzer {

    public String text;
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        return (text.length() > this.maxLength) ? Label.TOO_LONG : Label.OK;
    }
}
