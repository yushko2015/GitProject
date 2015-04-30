package com.pigovsky.myrest.controller;

import com.google.common.collect.Lists;
import com.pigovsky.myrest.model.ApiConstants;
import com.pigovsky.myrest.model.Result;
import com.pigovsky.myrest.model.User;
import com.pigovsky.myrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.PUT, consumes = ApiConstants.APPLICATION_JSON)
	public @ResponseBody User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

    @RequestMapping(value = "/", method = RequestMethod.GET, consumes = ApiConstants.APPLICATION_JSON, produces = ApiConstants.APPLICATION_JSON)
    public @ResponseBody List<User> getUsers() {
        return Lists.newArrayList(userService.getUsers());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = ApiConstants.APPLICATION_JSON)
    public @ResponseBody User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH, consumes = ApiConstants.APPLICATION_JSON, produces = ApiConstants.APPLICATION_JSON)
    public @ResponseBody User updateUser(@PathVariable Long id, @RequestBody User userPatch) {
        return userService.updateUser(id, userPatch);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = ApiConstants.APPLICATION_JSON)
    public @ResponseBody Result deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

}