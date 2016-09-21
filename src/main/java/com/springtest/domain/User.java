package com.springtest.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by gekh on 8/23/2016.
 */
@Entity
@Table(name="user")
public class User {
    @Id
    @Column(name = "id")
    //@GeneratedValue(strategy = GeneretionType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;
}
