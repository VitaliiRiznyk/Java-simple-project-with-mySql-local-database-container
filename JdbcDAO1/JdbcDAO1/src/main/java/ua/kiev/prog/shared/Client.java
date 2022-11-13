package ua.kiev.prog.shared;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class Client {
    @Id
    private int id;

    private String name;
    private int age;

    private Double weight;

    private Date clientDate;

    public Client() {
    }

    public Client(String name, int age, Double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.clientDate = Date.valueOf(LocalDate.now());
    }

    public int getId() {return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", date=" + clientDate +
                '}';
    }
}