# Spring Cloud Stream With Apache Kafka Binder

## [Click here to watch the video for demonstration.]()


### Prerequisites:
- [Docker](https://docs.docker.com/engine/install/) or [Docker alternative - Colima](https://github.com/abiosoft/colima)
- IDE and JDK

### Running Kafka in docker
Start docker on your machine and run following commands in Terminal.

1. Pull kafka image
    ``` 
    docker pull apache/kafka:3.8.0 
    ```

2. Run kafka cluster
    ```
    docker run -d -p 9092:9092 --name broker apache/kafka:3.8.0
    ```

3. Execute command inside kafka container
    ```
    docker exec --workdir /opt/kafka/bin/ -it broker sh
    ```

### After running execute command, then only run following commands as per your requirement.

1. To produce message on topic.

   ```
   ./kafka-console-producer.sh --bootstrap-server localhost:9092 --topic your_topic_name
   ```

2. To consume message from topic
   ```
   ./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic your_topic_name --from-beginning
   ```

3. If you run this application, it will create topics automatically. But if you want to create it manually, then use command

   ```
   ./kafka-topics.sh --bootstrap-server localhost:9092 --create --topic your_topic_name
   ```

4. To list the topics:
   ```
   ./kafka-topics.sh --bootstrap-server=localhost:9092 --list
   ```