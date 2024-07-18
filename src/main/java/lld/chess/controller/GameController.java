package lld.chess.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lld.chess.service.User;

@RestController
@RequestMapping("game-controller")
public class GameController {
	
	private static final Logger LOG = LoggerFactory.getLogger(GameController.class);
	
	@Autowired
	User user;

	@GetMapping("test")
	private ResponseEntity<String> test() {
		
		LOG.debug("In game-controller");
		return user.test();
	}
}
