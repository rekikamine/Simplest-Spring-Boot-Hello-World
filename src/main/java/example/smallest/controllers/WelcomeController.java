package example.smallest.controllers;

import org.springframework.stereotype.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class WelcomeController {
	@RequestMapping("/bilel")
	String home(){
		return "Hello Bilel -V3 !";
	}
	@RequestMapping("/amine")
	String doo(){
		return "Hello Amine -V3 !";
	}
	@RequestMapping("/amen")
	String hi(){
		return "Hello Amen -V3 !";
	
	}
	
	
}
