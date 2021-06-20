package com.bangtidy.springcloud.springcloud.service.impl;

import com.bangtidy.springcloud.springcloud.dao.PaymentDao;
import com.bangtidy.springcloud.springcloud.entities.Payment;
import com.bangtidy.springcloud.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
