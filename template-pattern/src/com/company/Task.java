package com.company;

public abstract class Task {
    private final AuditTrail auditTrail;

    public Task() {
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    protected abstract void doExecute();

    public void execute() {
        auditTrail.record();
        doExecute();
    }
}
