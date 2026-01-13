package model;

import java.util.Objects;

public class Event {
    private String name;
    private int availableSeats;

    public Event(String name, int availableSeats) {
        this.name = name;
        this.availableSeats = availableSeats;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableSeats() {
        return this.availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", availableSeats=" + availableSeats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return availableSeats == event.availableSeats && Objects.equals(name, event.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, availableSeats);
    }
}
