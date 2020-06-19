package ma.intelligentdeed.tutorials.config;

//@Configuration
public class KafkaProducerConfig {
//
//	@Value(value = "${spring.kafka.bootstrap-servers}")
//	private String bootstrapAddress;
//
//	@Bean
//	public ProducerFactory<String, PositionDTO> producerFactory() {
//		Map<String, Object> configProps = new HashMap<>();
//		configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
//		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
//
//		return new DefaultKafkaProducerFactory<>(configProps);
//	}
//
//	@Bean
//	public KafkaTemplate<String, PositionDTO> kafkaTemplate() {
//		return new KafkaTemplate<>(producerFactory());
//	}
}