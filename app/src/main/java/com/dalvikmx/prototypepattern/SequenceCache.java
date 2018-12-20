package com.dalvikmx.prototypepattern;

import java.util.Hashtable;

public class SequenceCache {

    private static Hashtable<String, Sequence> sequenceHashtable = new Hashtable<String, Sequence>();

    public static Sequence getSequence(String sequenceId) {
        return (Sequence) sequenceHashtable.get(sequenceId).clone();
    }

    public static void loadCache() {
        Prime prime = new Prime();
        prime.setId("1");
        sequenceHashtable.put(prime.getId(), prime);

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.setId("2");
        sequenceHashtable.put(fibonacci.getId(), fibonacci);
    }
}
