package ericsson.eso.docker.service;

import org.springframework.stereotype.Service;

@Service
public class ESOService {
	
	public String returnMessage() {
		return "Welcome to Ericsson Service Orchestration";
	}

}
