package randomvaluegenarator;

import query.QueryType;

public class RandomValueGenerator {

    private final double[] QUERY_SELECTOR_ARRAY = {0.3, 0.25, 0.35, 0.1};

    public RandomValueGenerator(){}


    /**
     * Generate a random value and compare it with our query type array, in order to check the type of query we will create.
     * @return Query type.
     */
    public QueryType generateValueMonteCarlo(){

        // Random value between 0 and 1.
        double rand = Math.random();
        // Variable to compare our random value.
        double accumulated = 0;

        // Check and compare each query value with the random number.
        for (int i = 0; i < QUERY_SELECTOR_ARRAY.length; i++) {

            // Add current query selector to the accumulated value.
            accumulated += QUERY_SELECTOR_ARRAY[i];

            // If the random value is less than the accumulated, then we know we found the type.
            if(rand < accumulated) {

                // Return the corresponding type of query.
                return QueryType.valueOf(i);
            }

        }

        // Default return
        return QueryType.valueOf(0);
    }


    /**
     * Generate a random value using a uniform distribution.
     * @param min Min value of the range.
     * @param max Max value of the range.
     * @return Generated value.
     */
    public double generateValueUniform(double min, double max) {

        // Random value between 0 and 1.
        double rand = Math.random();

        return min + (max - min) * rand;
    }


    /**
     * Generate a random integer value using a uniform distribution.
     * @param min Min value of the range.
     * @param max Max value of the range.
     * @return Generate integer.
     */
    public int generateValueUniformInt(int min, int max) {

        // Random value between 0 and 1.
        double rand = Math.random();

        return (int) Math.round(min + (max - min) * rand);
    }


    /**
     * Generate a random value using a normal distribution.
     * @param mean Mean of the function.
     * @param variance Variance of the function.
     * @return Random value generated using a normal distribution.
     */
    public double generateValueNormal(double mean, double variance) {

        // Random Z value.
        double zValue = 0;
        // Accumulated value of the sum of 12 random generated values.
        double accumulated = 0;

        // Generate and add each random value and then generate the Z value.
        for(int i = 0; i < 12; i++) {
            accumulated += Math.random();
        }
        zValue = accumulated - 6;

        // Function to generate a random normal value.
        return mean + zValue * Math.sqrt(variance);
    }


    /**
     * Generate a random value using an exponential distribution.
     * @param average Average time between arrivals. In seconds.
     * @return Random generated value using a exponential distribution.
     */
    public double generateRandomValueExponential(double average) {

        // Random value between 0 and 1.
        double rand = Math.random();

        // Our arrival rate of our exponential distribution.
        double arrivalRate = 1 / average;

        return -1 * Math.log(rand) / arrivalRate;
    }


    /**
     * Generate the required time to coordinate a transaction execution given a max number of concurrent elements.
     * @param maxElements Maximum number of concurrent elements that our transaction module can have.
     * @return The time required to coordinate an execution.
     */
    public double generateValueTransactionCoordination(int maxElements) {
        return maxElements * 0.03;
    }


    /**
     * Generate a random value for the query optimization process depending on the type of query.
     * @param queryType Type of query.
     * @return Time taken to execute the query optimization.
     */
    public double generateRandomValueQueryOptimization(QueryType queryType) {
        return queryType == QueryType.UPDATE ? 0.25 : 0.1;
    }


    /**
     * Time that takes to load a certain amount of blocks from disc.
     * @param numBlocks Number of blocks that are being load from disk.
     * @return Time that took to load the given amount of blocks.
     */
    public double generateValueLoadBlocks(int numBlocks) {
        return numBlocks * 0.1;
    }


    /**
     * Time that takes a query to be executed.
     * @param queryType Type of query that will be executed.
     * @param numBlocks Number of blocks that will be needed in the query.
     * @return Time to execute a query.
     */
    public double generateValueExecuteQuery(QueryType queryType, int numBlocks) {

        // Time that takes each query to execute.
        double queryTime = 0;
        // Time that takes to execute a query depending on the amount of blocks that need to be use.
        double executionTime = 0;

        // Check if the query type is either an update or a DDL.
        if(queryType ==  QueryType.DDL) {
            queryTime = 0.5;
        } else if (queryType == QueryType.UPDATE) {
            queryTime = 1;
        }

        // Since the result will be given in milliseconds, we need to pass it to seconds.
        executionTime = Math.pow(numBlocks, 2) / 1000;

        return queryTime + executionTime;
    }


    /**
     * Time that takes the connection administrator to send the result to the network.
     * @param numBlocks Number of blocks that are being send.
     * @return Time that takes to send the result to the network.
     */
    public double generateValueReturnResults(int numBlocks) {
        return numBlocks/64;
    }

    /**
     * Return the amount of time required to do a lexical validation in the Process Module.
     * @return Lexical validation time required.
     */
    public double getLexValidation() {
        return 0.1;
    }
}
