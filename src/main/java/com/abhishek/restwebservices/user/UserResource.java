package com.abhishek.restwebservices.user;

import java.net.URI;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	
	private UserDaoService service;
	
	public UserResource(UserDaoService service) {
		this.service=service;
	}
	
	/* Retrieve all Users */
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}
	
	/* Retrieve a particular User */
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id){
		User user =  service.findOne(id);
		if(user == null)
			throw new UserNotFoundException("id: "+id);
		return user;
	}
	
	/* Create a User */
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User savedUser = service.save(user);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
						.pathSegment("/{id}")
							.buildAndExpand(savedUser
								.getId()).toUri();
		
		return ResponseEntity.created(location ).build();
	}	

}
