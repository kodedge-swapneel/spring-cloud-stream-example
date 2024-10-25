package com.kodedge.transaction_monitoring_kafka_producer;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Timestamp;
import java.util.function.Supplier;

@SpringBootApplication
public class TransactionMonitoringKafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionMonitoringKafkaProducerApplication.class, args);
	}

	@Bean
	public Supplier<Transaction> sendTransaction() {
		return this::getTransaction;
	}


	public Transaction getTransaction() {
		Transaction transaction = new Transaction();
		transaction.setTransactionId(getRandomString() + RandomUtils.nextInt());
		transaction.setSenderId(getRandomString());
		transaction.setReceiverId(getRandomString());
		transaction.setType("transfer");
		transaction.setAmount(RandomUtils.nextDouble());
		transaction.setCurrency("USD");
		transaction.setTimestamp(new Timestamp(System.currentTimeMillis()));
		return transaction;


	}

	public String getRandomString() {
		return RandomStringUtils.randomAlphanumeric(8);
	}

}
