package com.kodedge.transaction_monitoring_kafka_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;

@SpringBootApplication
public class TransactionMonitoringKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionMonitoringKafkaConsumerApplication.class, args);
	}

	@Bean
	public Consumer<Transaction> transactionConsumer() {
		return transaction -> System.out.println("Transaction received: " + transaction);
	}

	@Bean
	public Function<Transaction, ComplianceReport> consumeAndReport() {
		return transaction -> new ComplianceReport(
                transaction.getTransactionId(),
                "Not Approved",
                "Transaction amount exceeds allowed limit"
        );
	}

	@Bean
	public Function<Transaction, FraudAlert> consumeAndReportFraud() {
		return transaction -> new FraudAlert(
                transaction.getTransactionId(),
                "FRAUD_FOUND",
                "Transaction amount exceeds allowed limit"
        );
	}

}
