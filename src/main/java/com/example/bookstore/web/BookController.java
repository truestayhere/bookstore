package com.example.bookstore.web;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// GitHub URL: https://github.com/truestayhere/bookstore

@Controller
public class BookController {

	@GetMapping("/index")
	public String showBooks(Model model) {
		return null;
	}

}
