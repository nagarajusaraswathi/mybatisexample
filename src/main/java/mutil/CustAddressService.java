package mutil;

import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Synycs Solutions on 3/2/2017.
 */
public class CustAddressService {
    public  List<Cust> getAddress(){
        CustAddressMapper custAddressMapper=null;
        List<Cust> custs=new ArrayList<>();
        try(SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()){
             custAddressMapper = sqlSession.getMapper(CustAddressMapper.class);
         custs= custAddressMapper.getAddress();

        }
        return custs;
    }
}
