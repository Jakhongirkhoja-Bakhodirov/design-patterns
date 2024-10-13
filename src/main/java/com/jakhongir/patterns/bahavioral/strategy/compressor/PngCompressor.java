package com.jakhongir.patterns.bahavioral.strategy.compressor;

import com.jakhongir.patterns.bahavioral.strategy.compressor.Compressor;

public class PngCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using PNG to " + fileName + " file");
    }
}
