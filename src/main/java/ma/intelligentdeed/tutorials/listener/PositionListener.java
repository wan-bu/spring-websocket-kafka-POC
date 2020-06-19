package ma.intelligentdeed.tutorials.listener;

import org.springframework.stereotype.Service;

@Service
public class PositionListener {
//
//	@KafkaListener(topics = "intelligentdeed", groupId = "web", containerFactory = "kafkaListenerContainerFactory", topicPartitions = {
//			@TopicPartition(topic = "intelligentdeed", partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0")) })
//	public void listen(@Payload PositionDTO newPosition, @Headers MessageHeaders headers) {
//		System.out.println("Received Messasge X coordinates + 1000 : " + Math.addExact(newPosition.getPosX(), 1000));
//	}

}
