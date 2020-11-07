package generics;

import java.util.ArrayList;

public class MyHashTable<K, V> {

    private ArrayList<HashTableNode<Integer, V>> hashTableNodes = new ArrayList<>();

    void put(K key, V value) {
        Integer hashKey = key.hashCode();
        hashTableNodes.add(new HashTableNode<>(hashKey, value));
    }

    V get(K key) {
        return hashTableNodes.stream().findFirst().filter(kvHashTableNode -> kvHashTableNode.getKey().equals(key.hashCode())).get().getValue();
    }

    void remove(K key) {
        hashTableNodes.removeIf(kvHashTableNode -> kvHashTableNode.getKey().equals(key.hashCode()));
    }

}

class HashTableNode<Integer, V> {

    private Integer key;
    private V value;

    HashTableNode(Integer key, V value) {
        this.key = key;
        this.value = value;
    }


    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
