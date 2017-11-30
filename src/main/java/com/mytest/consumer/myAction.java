package com.mytest.consumer;

import com.mytest.sharedlib.DemoService;
import com.mytest.sharedlib.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 329757 on 2017/11/13.
 */
@Controller
@RequestMapping("/")
class MyAction {
    @Autowired
    private DemoService demoService;
    @ResponseBody
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUser() {
        List<User> users = demoService.getUsers();
        return users.toString();
    }
}
