package com.jakhongir.patterns.bahavioral.template;

public class GenerateReportTask implements Transaction{
    public void execute() {
        System.out.println("Generating Report");
    }
}
