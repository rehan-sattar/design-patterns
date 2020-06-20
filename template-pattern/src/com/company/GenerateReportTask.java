package com.company;

public class GenerateReportTask {
    private final AuditTrail auditTrail;

    public GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();

        System.out.println("Generate the report.");
    }
}
