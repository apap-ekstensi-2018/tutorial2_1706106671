package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController
{
	@RequestMapping("/hello123")
	public String index()
	{
		return "hello";
	}
}