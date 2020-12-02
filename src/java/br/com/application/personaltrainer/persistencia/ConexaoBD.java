package br.com.application.personaltrainer.persistencia;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ConexaoBD {
    public DriverManagerDataSource Conectar(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/application");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }
    
}
