package lld.chess.serviceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lld.chess.service.User;

@Service
public class UserImpl implements User {

	@Override
	public ResponseEntity<String> test() {
		return new ResponseEntity<>("Acknowledged", HttpStatus.OK);
	}

}
