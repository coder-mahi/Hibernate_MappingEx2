package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.pojo.Person;
import com.pojo.Address;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Person person = new Person();
        person.setPersonId(1);
        person.setName("Mahesh");
        person.setAge(22);
        person.setEmail("mahesh@example.com");

        Address address = new Address();
        address.setPersonId(1); 
        address.setHNo("123, Shivaji Nagar");
        address.setCity("Pune");
        address.setState("Maharashtra");
        address.setCountry("India");

        person.setAddress(address);

        session.save(person);
        session.save(address);
        tx.commit();

        Person fetchedPerson = session.get(Person.class, 1);
        System.out.println("Person Name: " + fetchedPerson.getName());
        System.out.println("Email: " + fetchedPerson.getEmail());
        System.out.println("City: " + fetchedPerson.getAddress().getCity());

        session.close();
        factory.close();
    }
}
