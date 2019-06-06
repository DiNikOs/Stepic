public class Main {

    private TextAnalyzer[] analyzers;

    public static void main(String[] args) {
       // Label checkLabels = new Label(TextAnalyzer[] analyzers, String text);
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for(TextAnalyzer analyzer : analyzers){
            Label label = analyzer.processText(text);
            if(label!=Label.OK)
                return label;
        }
        return Label.OK;
    }

}
