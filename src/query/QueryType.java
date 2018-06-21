package query;

import java.util.HashMap;
import java.util.Map;

/**
 * Enum with the different type of queries that our DBMS can execute.
 */
public enum QueryType {

    // Type of queries.
    SELECT(0),
    UPDATE(1),
    JOIN(2),
    DDL(3);

    // Int value that represents each type of query.
    public final int value;
    // Hash map that let us get a query type by it's int value.
    private static Map map = new HashMap<>();

    // Private constructor.
    private QueryType(int value) { this.value = value; }

    // Fill our hash map.
    static {
        for (QueryType queryType : QueryType.values()) {
            map.put(queryType.value, queryType);
        }
    }

    /**
     * Return the type of query that correspond to a certain int.
     * @param queryValue Int value that we want to look for.
     * @return Query type of the given int.
     */
    public static QueryType valueOf(int queryValue) {
        return (QueryType) map.get(queryValue);
    }

    /**
     * Return the int value of a query type.
     * @return Int value of a query type.
     */
    public int getValue() {
        return value;
    }
}
