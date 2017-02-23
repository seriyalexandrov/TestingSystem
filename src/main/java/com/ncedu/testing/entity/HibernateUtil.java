package com.hibernate.skill.checker.dao.layers;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by administrator on 11/16/16.
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            System.err.println("Initial SessionFactory creation failed. " + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
