package com.pedantic.service;

import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;


@DataSourceDefinition(
        name = "java:app/Payroll/MyDS",
        className = "org.apache.derby.jdbc.ClientDriver",
        url = "jdbc:derby://localhost:1527/payroll",
        user = "appuser",
        password = "password")
@Stateless
public class PersistenceService {

    @Inject
    EntityManager entityManager;
}
