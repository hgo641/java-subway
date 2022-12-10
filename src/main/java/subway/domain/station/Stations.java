package subway.domain.station;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Stations {
    private final List<Station> stations = new LinkedList<>();

    public void add(Station station) {
        stations.add(station);
    }

    public void add(int index, Station station) {
        // TODO index가 list범위를 넘을 경우 예외처리
        stations.add(index, station);
    }

    public void delete(Station targetStation) {
        stations.remove(targetStation);
    }

    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (Station station : stations) {
            names.add(station.getName());
        }
        return names;
    }
}
