package com.xbb.payment.dao;

import com.xbb.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDAO  {

    public int create(Payment payment);

    public Payment findById(@Param("id") Long id);

}
