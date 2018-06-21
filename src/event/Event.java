package event;

import query.Query;

/**
 * Object that represents an event in our system.
 */
public class Event {

    // Type of event.
    private EventType eventType;
    // Time when the event started.
    private double initialTime;
    // Time when the event ends.
    private double endTime;
    // Query that is being executed.
    private Query query;

    public Event(EventType eventType, double initialTime, double endTime, Query query) {
        this.eventType = eventType;
        this.initialTime = initialTime;
        this.endTime = endTime;
        this.query = query;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public double getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(double initialTime) {
        this.initialTime = initialTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
}
