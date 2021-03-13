drop table if exists TASKS;
create table TASKS (
    id int primary key auto_increment,
    description varchar(100) not null,
    done bit
);


/*
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

spring.flyway.enabled=true

spring.flyway.url = 'jdbc:h2:file:/home/agnieszka/Desktop/spring-course/todo-app/todo-db'
spring.flyway.password=
spring.flyway.user=sa*/
