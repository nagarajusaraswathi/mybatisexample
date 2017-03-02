package mutil;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by Synycs Solutions on 3/1/2017.
 */
public class UserService {

    public void insertUser(User user) {

        try(SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()){
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.insertUser(user);
            sqlSession.commit();
        }

    }




    public List<User> getAllUsers() throws IOException {
        Reader reader = null;
        reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = factory.openSession();

        try{


            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            return userMapper.getAllUsers();

        }finally{

            sqlSession.close();

        }

    }





}
