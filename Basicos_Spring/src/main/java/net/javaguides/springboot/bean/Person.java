package net.javaguides.springboot.bean;

public class Person {
    private String nombre;
    private int age;
    private int id;

    public Person(String nombre, int age, int id) {
        this.nombre = nombre;
        this.age = age;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
