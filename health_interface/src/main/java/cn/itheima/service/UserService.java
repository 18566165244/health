package cn.itheima.service;

import cn.itheima.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserService {

    public List<User> findAll();


    public User findById(Integer id);


    public void save(User user);


    public void delete(Integer id);


    public void update(User user);
}
