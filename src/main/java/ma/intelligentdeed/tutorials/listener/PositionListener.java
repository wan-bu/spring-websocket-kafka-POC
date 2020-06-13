package ma.intelligentdeed.tutorials.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import ma.intelligentdeed.tutorials.service.dto.PositionDTO;

@Service
public class PositionListener {

	@KafkaListener(topics = "intelligentdeed", groupId = "web", containerFactory = "kafkaListenerContainerFactory", topicPartitions = {
			@TopicPartition(topic = "intelligentdeed", partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0")) })
	public void listen(@Payload PositionDTO newPosition, @Headers MessageHeaders headers) {
		System.out.println("Received Messasge X coordinates + 1000 : " + Math.addExact(newPosition.getPosX(), 1000));
	}

}
