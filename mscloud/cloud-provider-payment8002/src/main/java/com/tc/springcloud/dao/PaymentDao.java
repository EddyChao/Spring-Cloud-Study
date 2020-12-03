package com.tc.springcloud.dao;

import com.tc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @Description
 * @Author v_ichaotang
 * @Date 2020/11/30 15:51
 **/
@Mapper
//@Repository
public interface PaymentDao {

    @Insert("insert into payment(serial) values(#{serial})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    int create(Payment payment);

    @Select("select * from payment where id = #{id}")
    Payment getPaymentById(Long id);
}
