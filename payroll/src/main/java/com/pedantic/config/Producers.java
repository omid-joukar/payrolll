package com.pedantic.config;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Producers {

    @Produces
    @PersistenceContext
    EntityManager entityManager;
}
