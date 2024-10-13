package com.jakhongir.patterns.bahavioral.template;

public class TransactionExecutor {
    private  AuditTrail auditTrail;

    public TransactionExecutor(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(Transaction transaction) {
        auditTrail.record();
        transaction.execute();
    }
}
