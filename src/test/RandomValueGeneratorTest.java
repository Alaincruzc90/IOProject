package test;

import randomvaluegenarator.RandomValueGenerator;

public class RandomValueGeneratorTest {


    public static void main(String args[]) {

        RandomValueGenerator randomValueGenerator = new RandomValueGenerator();
        System.out.println(randomValueGenerator.generateValueNormal(1,0.01));

    }
}
