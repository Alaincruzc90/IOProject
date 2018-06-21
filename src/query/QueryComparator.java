package query;

import java.util.Comparator;

/**
 * Class used to compare where to add our queries in the priority queue of the transaction module.
 */
public class QueryComparator implements Comparator<Query> {

    @Override
    // Signature method of the Comparator interface.
    public int compare(Query o1, Query o2) {

        try {

            // Check if both queries are DDL.
            if(o1.getQueryType() == o2.getQueryType() && o1.getQueryType() == QueryType.DDL) {

                // Now, we need to check which one arrived first to the queue.
                if(o1.getInitialTimeInModule() < o2.getInitialTimeInModule()) {
                    return -1;
                } else {
                    return 1;
                }

            } else if (o1.getQueryType() == QueryType.DDL) { // If the first entry's type is DDL, then we just add it to the beginning of the queue.
                return -1;
            }

            // If nothing of the above works, simply add it the end.
            return 1;

        } catch (NullPointerException np) {
            System.out.println(np.toString());
        }
        return 0;
    }
}
