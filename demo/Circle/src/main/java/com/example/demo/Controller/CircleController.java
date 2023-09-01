package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Circle;

import com.example.demo.Repository.CircleRepository;



@RestController
@RequestMapping("/channel")

public class CircleController {

	@Autowired
	public CircleRepository circleRepository;
	
	
	@PostMapping("/save")
	public Circle saveCircle(@RequestBody Circle circle) {
		return circleRepository.save(circle);
	}
	
	@GetMapping("/show")
	public List<Circle> getAll(){
		return circleRepository.findAll();
	}
	
	
}
