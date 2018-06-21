package event;

/**
 * Enum that represents the different type of events that we have in our system.
 */
public enum EventType {
    CONNECTION_ARRIVAL,
    THREAD_CONNECTION,
    QUERY_VALIDATION,
    CONCURRENCE_COORDINATION,
    QUERY_EXECUTION,
    RETURN_RESULTS,
}
