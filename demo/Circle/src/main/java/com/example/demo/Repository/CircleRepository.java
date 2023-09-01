package com.example.demo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Circle;

public interface CircleRepository extends JpaRepository<Circle, Integer> {

	
}
