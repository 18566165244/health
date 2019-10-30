package cn.itheima.dao;

import cn.itheima.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {

    @Select("select * from t_user")
    public List<User> findAll();

    @Select("select * from t_user where id=#{id}")
    public User findById(Integer id);

    @Insert("insert into t_user values (id=#{id},name=#{name},sarlary=#{sarlary},birthday=#{birthday})")
    public void save(User user);

    @Delete("delete from t_user where id=#{id}")
    public void delete(Integer id);

    @Update("update t_user set name=#{name},sarlary=#{sarlary},birthday=#{birthday} where id = #{id}")
    public void update(User user);
}

