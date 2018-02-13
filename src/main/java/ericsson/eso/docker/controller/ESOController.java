package ericsson.eso.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ericsson.eso.docker.service.ESOService;

@RestController
public class ESOController {
	
	@Autowired
	private ESOService esoService;
	
	 @RequestMapping("/")
	    public String home() {
	        return esoService.returnMessage();
	 } 

}
