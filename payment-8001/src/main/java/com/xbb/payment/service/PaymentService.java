package com.xbb.payment.service;

import com.xbb.payment.entities.Payment;

public interface PaymentService {

    public boolean create(Payment payment);

    public Payment findById(Long id);

}
