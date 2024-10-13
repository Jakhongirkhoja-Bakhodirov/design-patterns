package com.jakhongir.patterns.bahavioral.strategy.compressor;

import com.jakhongir.patterns.bahavioral.strategy.compressor.Compressor;

public class JpegCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using JPEG to " + fileName + " file");
    }
}
