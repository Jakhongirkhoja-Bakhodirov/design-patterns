package com.jakhongir.patterns.bahavioral.template;

public class TransferMoneyTask {
    private AuditTrail auditTrail;
    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        System.out.println("Transfer money");
    }
}
