package com.kodedge.transaction_monitoring_kafka_consumer;

public class ComplianceReport {
    String transactionId;
    String status;
    String remark;

    public ComplianceReport(String transactionId, String status, String remark) {
        this.transactionId = transactionId;
        this.status = status;
        this.remark = remark;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ComplianceReport{" +
                "transactionId='" + transactionId + '\'' +
                ", status='" + status + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
