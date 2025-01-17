package producer;

import com.hortonworks.registries.schemaregistry.client.SchemaRegistryClient;
import com.hortonworks.registries.schemaregistry.serdes.avro.kafka.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;

import java.util.Collections;
import java.util.Properties;
import java.util.Random;

public class ProductProducer {

    private final Properties config = new Properties();
    private final String bootstrapServers = "localhost:9091";
    private final String schemaRegistryURL = "http://localhost:9090/api/v1";
    private final String productTopic = "product";

    private final Random random = new Random();

    public ProductProducer() {
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        config.putAll(Collections.singletonMap(SchemaRegistryClient.Configuration.SCHEMA_REGISTRY_URL.name(),schemaRegistryURL));
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
    }

    public void runProducer() {
        KafkaProducer<Integer, schema.Product> producer = new KafkaProducer<>(config);

        for (int i =0; i < 10; i++) {
            int productId = random.nextInt(1000) + 1;
            String productName = "product_" + productId;
            String description = "description_" + productId;

            schema.Product product = new schema.Product(productId, productName, description);
            ProducerRecord<Integer, schema.Product> record = new ProducerRecord<>(productTopic, productId, product);

            producer.send(record);
        }
    }

    public static void main(String[] args) {
        ProductProducer producer = new ProductProducer();
        producer.runProducer();
    }
}
