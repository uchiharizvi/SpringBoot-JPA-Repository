package com.customers.application.service.impl;

import com.customers.application.entity.Users;
import com.customers.application.service.PushService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Service;

@Service
public class PushServiceImpl implements PushService {
    @Override
    public String PushData() {
        //Create TypeSafe Service Registry Object
        String message = "";
        try {
            StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
            Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
            SessionFactory factory = metadata.getSessionFactoryBuilder().build();
            Session session = factory.openSession();
            Transaction transaction = session.beginTransaction();

            Users users = new Users();//default Constructor
            users.setUserId(1001);
            users.setUserName("uchiharizvi");
            users.setAddress("New Delhi, India");
            users.setEmail("rizvikavish206@gmail.com");

            session.save(users);
            transaction.commit();
            message = "Successfully Pushed";
            factory.close();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return message;
    }
}
