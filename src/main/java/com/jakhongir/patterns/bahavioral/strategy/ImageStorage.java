package com.jakhongir.patterns.bahavioral.strategy;

import com.jakhongir.patterns.bahavioral.strategy.compressor.Compressor;
import com.jakhongir.patterns.bahavioral.strategy.filter.Filter;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;
    public void store(String fileName,Compressor compressor,Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
