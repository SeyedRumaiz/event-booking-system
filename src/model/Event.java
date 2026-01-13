package model;

import java.util.Objects;

public class Event {
    private String name;
    private int availableSeats;
    private double ticketPrice;

    public Event(String name, int availableSeats, double ticketPrice) {
        this.name = name;
        this.availableSeats = availableSeats;
        this.ticketPrice = ticketPrice;
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

    public double getTicketPrice() {
        return this.ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", availableSeats=" + availableSeats +
                ", ticketPrice=" + ticketPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return availableSeats == event.availableSeats && Double.compare(ticketPrice, event.ticketPrice) == 0 && Objects.equals(name, event.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, availableSeats, ticketPrice);
    }
}
