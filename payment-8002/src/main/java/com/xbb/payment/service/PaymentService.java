package com.xbb.payment.service;

import com.xbb.entities.Payment;

public interface PaymentService {

    public boolean create(Payment payment);

    public Payment findById(Long id);

}
