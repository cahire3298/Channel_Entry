package com.channel.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.channel.demo.Model.Channel;
import com.channel.demo.Repository.ChannelRepository;

@RestController
@RequestMapping("/channel")
@CrossOrigin
public class ChannelController {

	
	@Autowired
	public ChannelRepository channelRepository;

		@PostMapping("/save")
		public Channel saveChannel(@RequestBody Channel channel) {
			return channelRepository.save(channel);
		}
		
		@GetMapping("/show")
		public List<Channel> getAll(){
			return channelRepository.findAll();
		}
		
//		@GetMapping("/show/{demand_number}")
//		public ResponseEntity<Channel> getRequest(@PathVariable Long demand_number) {
//			Channel channel=channelRepository.getById(demand_number)
//		}
}

