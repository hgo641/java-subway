package subway.view.output;

import java.util.List;

public class OutputPrinter {
    static final String INFO_HEADER = "[INFO] ";

    public void print(String text) {
        System.out.println(INFO_HEADER + text);
    }

    public void printAll(List<String> texts) {
        for (String text : texts) {
            print(text);
        }
    }
}
