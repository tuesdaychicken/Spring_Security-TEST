package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/sample/*")
public class SampleController {

	@GetMapping("/all")
	public void doall() {
		log.info("all everybody................");
	}
	
	@GetMapping("/member")
	public void doMember() {
		log.info("member only....................");
	}
	
	@GetMapping("/admin")
	public void doAdmin() {
		log.info("admin only........................");
	}
}
