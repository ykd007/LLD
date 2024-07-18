package lld.chess.service.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lld.chess.service.User;

@Service
public class UserImpl implements User {

	private static final Logger LOG = LoggerFactory.getLogger(UserImpl.class);
	
	@Override
	public ResponseEntity<String> test() {
		
		LOG.debug("In service implementation");
		return new ResponseEntity<>("Acknowledged", HttpStatus.OK);
	}

}
