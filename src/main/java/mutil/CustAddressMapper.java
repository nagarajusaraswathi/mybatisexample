package mutil;

import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Synycs Solutions on 3/2/2017.
 */
public interface CustAddressMapper {
    @Select("SELECT * FROM cust_add")
     //@ResultMap(value = "")

    @ConstructorArgs(value = {@Arg(column = "pinCode", javaType = String.class),@Arg(column = "addressLine1",javaType = String.class)})
    @Results({
            @Result(id=true, property= "id", column="id"),
            @Result(property="name", column="name"),
            @Result(property="address.pinCode", column="pinCode"),
            @Result(property="address.addressLine1", column="addressLine1")})
    public  List<Cust> getAddress();

}
