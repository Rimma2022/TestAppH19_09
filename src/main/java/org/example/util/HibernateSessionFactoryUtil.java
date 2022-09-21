package org.example.util;

import org.example.model.Car;
import org.example.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    public HibernateSessionFactoryUtil() {
    }

    public static SessionFactory getSessionFactory(){
        if(sessionFactory != null){
            try{
                // начало конфигурации
                Configuration configuration = new Configuration().configure();
                // указываешь какие классы ты хочешь, чтобы хибернет сам регулировал
                configuration.addAnnotatedClass(Car.class);
                configuration.addAnnotatedClass(User.class);
                // создание настроек для сессии
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                // создание сессии
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e){

            }

        }
        return sessionFactory;
    }


}
