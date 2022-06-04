package com.example.asm.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "category")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 50, nullable = false)
    private int categoryId;
    @Column(length = 200, nullable = false)
    private String name;

    @OneToMany(mappedBy = "category", cascade = { CascadeType.ALL })
    Set<Products> products;
}