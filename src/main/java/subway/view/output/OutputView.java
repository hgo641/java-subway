package subway.view.output;

import java.util.List;

public class OutputView {
    OutputPrinter outputPrinter = new OutputPrinter();

    public void printStations(List<String> stations) {
        outputPrinter.printAll(stations);
    }
}
