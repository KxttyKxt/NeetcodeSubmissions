class MyHashSet {
    private final List<Integer> underlyingList;

    public MyHashSet() {
        underlyingList = new ArrayList<>();
    }

    public void add(int key) {
        if (!contains(key))
            underlyingList.add(key);
    }

    public void remove(int key) {
        // box to avoid removing by index
        underlyingList.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        return underlyingList.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */