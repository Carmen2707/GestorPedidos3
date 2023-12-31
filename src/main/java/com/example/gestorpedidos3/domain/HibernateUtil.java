package com.example.gestorpedidos3.domain;

import lombok.extern.java.Log;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * La clase HibernateUtil proporciona métodos para manejar la SessionFactory de Hibernate.
 */
@Log
public class HibernateUtil {

    private static SessionFactory sf = null;

    static {
        try {
            org.hibernate.cfg.Configuration cfg = new Configuration();
            cfg.configure();
            sf = cfg.buildSessionFactory();
            log.info("SessionFactory creada con exito!");
        } catch (Exception ex) {
            log.severe("Error al crear SessionFactory()");
        }
    }

    /**
     * @return devuelve la SessionFactory actual
     */
    public static SessionFactory getSessionFactory() {
        return sf;
    }
}
