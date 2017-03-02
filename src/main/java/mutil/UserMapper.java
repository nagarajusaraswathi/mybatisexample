package mutil;

import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Synycs Solutions on 3/1/2017.
 */
public interface UserMapper {


        @Insert("INSERT INTO USER(email_id, password,first_name,last_name) VALUES(#{emailId}, #{password},#{firstName},#{lastName})")
        @Options(useGeneratedKeys=true, keyProperty="blogId")
        public void insertUser(User user);
//
//
//
//        public User getUserById(Integer userId);


        @Select("SELECT * FROM USER ")
        @Results({
                @Result(id=true, property= "userId", column="user_id"),
                @Result(property="emailId", column="email_id"),
                @Result(property="password", column="password"),
                @Result(property="firstName", column="first_name"),
                @Result(property="lastName", column="last_name"),
                @Result(property = "order", column = "first_name", many=@Many(select = "getMaster"))})
        public List<User> getAllUsers();


        @Select("SELECT orderId,orderName,first_name FROM user_order WHERE first_name = #{nama}")
        List<Order> getMaster(String name);

//        public void updateUser(User user);
//
//        public void deleteUser(Integer userId);

    }



