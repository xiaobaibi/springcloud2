package com.xbb.payment.service.impl;

import com.xbb.payment.dao.PaymentDAO;
import com.xbb.payment.entities.Payment;
import com.xbb.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDAO paymentDAO;

    @Override
    public boolean create(Payment payment) {
        int i = paymentDAO.create(payment);
        return i>0;
    }

    @Override
    public Payment findById(Long id) {
        return paymentDAO.findById(id);
    }
}
