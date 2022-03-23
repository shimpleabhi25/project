package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.loads;
import com.springrest.springrest.services.loadService;
@RestController
public class MyController {
	@Autowired
	private loadService loadService;
	@GetMapping("/load")
	public List<loads> loads()
	{
		System.out.println("list of loads with this shipperId");
		return this.loadService.getloads();
	}

	@GetMapping("/load/{loadId}")
	public ResponseEntity<HttpStatus> getload(@PathVariable String loadId)
	{
		try {
			this.loadService.getload(Long.parseLong(loadId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/load")
	public ResponseEntity<HttpStatus> addload(@RequestBody loads loads)
	{
		try {
			this.loadService.addload(loads);
			System.out.println("loads details added successfully");
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/load/{loadId}")
	public ResponseEntity<HttpStatus> updateload(@RequestBody loads loads)
	{
		try {
			this.loadService.updateload(loads);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("load/{loadId}")
	public ResponseEntity<HttpStatus> deleteload(@PathVariable String loadId)
	{
		try
		{
			this.loadService.deleteload(Long.parseLong(loadId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
