package org.example;


public class Record<K, V> {
    private K key;
    private V value;

    public Record(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
