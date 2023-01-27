package com.sample.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/sample")
public class SampleController {
	@GetMapping({"","/"})
	@ResponseBody
	public String test() {
		return "Hello Web!";
	}
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
}
