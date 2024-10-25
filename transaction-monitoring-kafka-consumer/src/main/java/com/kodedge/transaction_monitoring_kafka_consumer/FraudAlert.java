package com.kodedge.transaction_monitoring_kafka_consumer;

public class FraudAlert {
    String transactionId;
    String type;
    String details;

    public FraudAlert(String transactionId, String type, String details) {
        this.transactionId = transactionId;
        this.type = type;
        this.details = details;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "FraudAlert{" +
                "transactionId='" + transactionId + '\'' +
                ", type='" + type + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
