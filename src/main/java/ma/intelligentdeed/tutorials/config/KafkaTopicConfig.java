package ma.intelligentdeed.tutorials.config;

//@Configuration
public class KafkaTopicConfig {

//	@Value(value = "${spring.kafka.bootstrap-servers}")
//	private String bootstrapAddress;
//
//	@Value(value = "${app.topic.name}")
//	private String topicName;
//
//	@Bean
//	public KafkaAdmin kafkaAdmin() {
//		Map<String, Object> configs = new HashMap<>();
//		configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
//		return new KafkaAdmin(configs);
//	}
//
//	@Bean
//	public NewTopic topic() {
//		return new NewTopic(topicName, 1, (short) 1);
//	}
}