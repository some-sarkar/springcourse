package com.lucifer.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lucifer.payment.MakePayment;
import com.lucifer.payment.PaymentInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        PaymentInterface payment = (PaymentInterface) context.getBean("payment");
        //PaymentInterface payment = context.getBean("payment", PaymentInterface.class);
        payment.doPayment(20000);
    }
}
