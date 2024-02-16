package com.autotest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutotestController {

	@GetMapping(value="/getInfo")
	public String getinfo() {
		return "My faviourite color is pink";
	}
}
