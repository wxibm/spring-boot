package com.myweb.sun.controller;

import com.myweb.sun.entity.User;
import com.myweb.sun.service.UserService;
import com.myweb.sun.utils.Return;
import com.myweb.sun.utils.ReturnT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/createUser")
    public ReturnT<User> createUser(@Validated @RequestBody User user, BindingResult result) {
        //如果参数有问题，就输出错误，否则执行添加
        if (result.hasErrors()) {
            String msg = "";
            List<ObjectError> ls = result.getAllErrors();
            for (int i = 0; i < ls.size(); i++) {
                System.out.println(ls.get(i).getDefaultMessage());
                msg += ls.get(i).getDefaultMessage() + "<br/>";
                //msg含有所有的错误信息
            }
            return Return.Valid(msg);
        }
        //以上是提示格式错误
        if (getUser(user.getUserName()) != null)
            return Return.UserName();
        return userService.insert(user);
    }

    @RequestMapping("/getUser")
    public User getUser(String userName) {
        return userService.selectByUserName(userName);
    }
}
