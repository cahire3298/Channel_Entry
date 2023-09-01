package com.channel.demo.Model;

import java.sql.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Channel {

	@CreatedDate
	public Date date;
	
	@Id
	public String demand_number;
	
	public String Channel_name;
	
//	@Id
////	@GeneratedValue(strategy =GenerationType.IDENTITY)
//	public long circle_id;
//	
//	public String Circle_name;

	public Channel() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Channel(Date date, String demand_number, String channel_name, long circle_id, String circle_name) {
		super();
		this.date = date;
		this.demand_number = demand_number;
		Channel_name = channel_name;
	
	}



	public String getDemand_number() {
		return demand_number;
	}



	public void setDemand_number(String demand_number) {
		this.demand_number = demand_number;
	}



	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public String getChannel_name() {
		return Channel_name;
	}

	public void setChannel_name(String channel_name) {
		Channel_name = channel_name;
	}


	
	
}
