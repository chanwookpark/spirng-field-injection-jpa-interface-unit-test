package com.chanwook;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author chanwook
 */
@Entity
public class Sample {

    @Id
    private String id;

    @Column
    private String name;

    public Sample() {

    }

    public Sample(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
