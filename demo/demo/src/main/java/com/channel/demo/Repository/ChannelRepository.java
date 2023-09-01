package com.channel.demo.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.channel.demo.Model.Channel;

public interface ChannelRepository extends JpaRepository<Channel, String>{

	List<Channel> findAll();

	Channel save(Channel channel);

	

}
