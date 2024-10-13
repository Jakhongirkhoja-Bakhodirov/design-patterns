package com.jakhongir.patterns.bahavioral.template;

public class GenerateReportTask {
    private AuditTrail auditTrail;
    public GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        System.out.println("Generating Report");
    }
}
