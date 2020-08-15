package com.xbb.payment.service.impl;

import com.xbb.entities.Payment;
import com.xbb.payment.dao.PaymentDAO;
import com.xbb.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDAO paymentDAO;

    @Override
    public boolean create(Payment payment) {
        payment.setSerial(payment.getSerial()+"-");
        int i = paymentDAO.create(payment);
        return i>0;
    }

    @Override
    public Payment findById(Long id) {
        return paymentDAO.findById(id);
    }
}
