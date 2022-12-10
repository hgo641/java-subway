package subway.domain;

import subway.domain.station.Station;
import subway.domain.station.Stations;

import java.util.List;

public class Subway {
    Stations stations;

    public Subway() {
        this.stations = new Stations();
    }

    public void addStation(Station station) {
        stations.add(station);
    }

    public void addStation(int index, Station station) {
        stations.add(index, station);
    }

    public void deleteStation(Station station) {
        // TODO 역이 노선에 포함되어있으면 삭제 불가능
        stations.delete(station);
    }

    public List<String> getNamesOfStations() {
        return stations.getNames();
    }
}
