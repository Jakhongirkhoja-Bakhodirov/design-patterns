package com.jakhongir.patterns.bahavioral.iterator;

public class ArrayIterator implements Iterator {
    private BrowserHistory history;
    private int index;

    public ArrayIterator(BrowserHistory history) {
        history = history;
    }

    @Override
    public boolean hasNext() {
        return (index < history.getUrls().size());
    }

    @Override
    public String current() {
        return history.getUrls().get(index);
    }

    @Override
    public void next() {
        index++;
    }
}
