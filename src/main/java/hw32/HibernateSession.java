package hw32;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateSession {

    private HibernateSession() {
        throw new IllegalStateException("Utility class");
    }

    public static SessionFactory getSessionFactory() {
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Student.class);
        cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hw32");
        cfg.setProperty("hibernate.connection.username", "root");
        cfg.setProperty("hibernate.connection.password", "Qwerty12!");
        cfg.setProperty("hibernate.c3p0.min_size", "5");
        cfg.setProperty("hibernate.c3p0.max_size", "20");
        cfg.setProperty("hibernate.c3p0.timeout", "300");
        cfg.setProperty("hibernate.c3p0.max_statements", "50");

        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties())
                .build();

        return cfg.buildSessionFactory(serviceRegistryObj);
    }
}
