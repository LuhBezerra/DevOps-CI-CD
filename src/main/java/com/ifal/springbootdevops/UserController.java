package com.ifal.springbootdevops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/list")
    public @ResponseBody Iterable<User> listUsers()
    {
        return userRepository.findAll();
    }

	@PostMapping("/add")
    public User addUser(@Validated @RequestBody User user)
    {
        return userRepository.save(user);
    }

}
