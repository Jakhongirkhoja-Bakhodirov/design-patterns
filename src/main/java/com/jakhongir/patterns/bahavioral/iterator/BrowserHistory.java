package com.jakhongir.patterns.bahavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private  List<String> urls = new ArrayList<>();

    public List<String> getUrls() {
        return urls;
    }

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

}
