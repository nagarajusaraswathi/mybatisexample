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

        @ConstructorArgs(value = {@Arg(column = "user_id",javaType = Integer.class),@Arg(column = "email_id",javaType = String.class),@Arg(column = "password",javaType = String.class),@Arg(column = "name",javaType = String.class),@Arg(column = "last_name",javaType = String.class),@Arg(select = "getMaster",column = "name",javaType = List.class )})
        @Select("SELECT * FROM USER ")
//        @Results({
//                @Result(property = "order", column = "name", one = @One(select = "getMaster"))})
        public List<User> getAllUsers();


        @Select("SELECT * FROM user_order WHERE firstName= #{name}")
       List<Order>  getMaster(String name);

//        public void updateUser(User user);
//
//        public void deleteUser(Integer userId);
    


    }



