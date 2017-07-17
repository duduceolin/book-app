package userservice.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.PagedResources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import userservice.serviceclient.UserDTO;
import userservice.serviceclient.UserService;

/**
@author: dudu
@date: 17 de jul de 2017 05:34:46
**/

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
    private UserService userService;
	
	@RequestMapping("/listUsers")
    public Collection<UserDTO> getUsers() {
        PagedResources<UserDTO> users = userService.findAll(0);
        return users.getContent();
    }
	
}
