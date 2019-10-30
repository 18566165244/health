package cn.itheima.controller;

import cn.itheima.domain.User;
import cn.itheima.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    //查找服务
    @Reference
    private UserService userService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(){
        List<User> userList = userService.findAll();
    for (User user : userList) {
        System.out.println(user);
    }
        return userList;
    }

    @RequestMapping("/findById")
    @ResponseBody
    public User findById(Integer id){
        User user = userService.findById(id);
        System.out.println(user);
        return user;
    }

    @RequestMapping("/update")
    @ResponseBody
    public void update(@RequestBody User user){
        userService.update(user);
    }

    @RequestMapping("/save")
    @ResponseBody
    public void save(User user){
        userService.save(user);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public void delete(Integer id){
        userService.delete(id);
    }
}
