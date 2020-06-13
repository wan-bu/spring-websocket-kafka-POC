package ma.intelligentdeed.tutorials.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import ma.intelligentdeed.tutorials.service.MessagingService;
import ma.intelligentdeed.tutorials.service.dto.PositionDTO;

@Controller
public class PositionController {

	@Autowired
	MessagingService messagingService;

	@MessageMapping("/positions")
	@SendTo("/topic/positions")
	public PositionDTO updatePosition(PositionDTO newPosition) throws Exception {
		System.out.println(newPosition);
		messagingService.sendPosition(newPosition);
		return newPosition;
	}

}