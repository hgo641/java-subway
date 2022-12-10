package subway.domain.station;

import java.util.Objects;

public class Station {
    private final String name;

    public Station(String name) {
        // TODO "역"으로 안끝나면 예외처리
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현

    @Override
    public boolean equals(Object o) {
        Station station = (Station) o;
        return Objects.equals(name, station.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
