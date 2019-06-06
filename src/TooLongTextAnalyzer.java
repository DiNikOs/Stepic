public class TooLongTextAnalyzer implements TextAnalyzer {

    public String text;
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    public Label processText(String text) {
        return (text.length() > this.maxLength) ? Label.TOO_LONG : Label.OK;
    }
}
