package org.example.model;

import org.hibernate.annotations.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "car_name")
    private String carName;
    @Column(name = "count_door")
    private Integer countDoor;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User usert;

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Integer getCountDoor() {
        return countDoor;
    }

    public void setCountDoor(Integer countDoor) {
        this.countDoor = countDoor;
    }

    public User getUsert() {
        return usert;
    }

    public void setUsert(User usert) {
        this.usert = usert;
    }
}
