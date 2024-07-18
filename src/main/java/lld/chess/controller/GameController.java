package lld.chess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lld.chess.service.User;

@RestController
@RequestMapping("game-controller")
public class GameController {
	
	@Autowired
	User user;

	@GetMapping("test")
	private ResponseEntity<String> test() {
		return user.test();
	}
}
