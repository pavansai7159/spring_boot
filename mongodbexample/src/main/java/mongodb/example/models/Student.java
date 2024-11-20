package mongodb.example.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pavan")
public class Student {
    private int id;
    private String name;
    private String college;
    private String city;

    public Student(String name, int id, String college, String city) {
        this.name = name;
        this.id = id;
        this.college = college;
        this.city = city;
    }

    public int getId() {
        return id;
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

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
