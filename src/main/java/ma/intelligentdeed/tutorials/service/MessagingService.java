package ma.intelligentdeed.tutorials.service;

import org.springframework.stereotype.Service;

import ma.intelligentdeed.tutorials.service.dto.PositionDTO;

@Service
public class MessagingService {

//	@Autowired
//	private KafkaTemplate<String, PositionDTO> kafkaTemplate;
//
//	@Value(value = "${app.topic.name}")
//	private String topicName;

	public void sendPosition(PositionDTO newPosition) {

//		Message<PositionDTO> message = MessageBuilder.withPayload(newPosition).setHeader(KafkaHeaders.TOPIC, topicName)
//				.build();
//
//		ListenableFuture<SendResult<String, PositionDTO>> future = kafkaTemplate.send(message);
//
//		future.addCallback(new ListenableFutureCallback<SendResult<String, PositionDTO>>() {
//
//			@Override
//			public void onSuccess(SendResult<String, PositionDTO> result) {
//				System.out.println(
//						"Sent message=[" + newPosition + "] with offset=[" + result.getRecordMetadata().offset() + "]");
//			}
//
//			@Override
//			public void onFailure(Throwable ex) {
//				System.out.println("Unable to send message=[" + newPosition + "] due to : " + ex.getMessage());
//			}
//		});
	}

}
