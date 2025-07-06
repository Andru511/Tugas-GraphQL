/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphql;

public class Product {
    public Long id;
    public String name;
    public Double price;
    public String category;
    
    public Product(Long id, String name, Double price, String category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
              
    }
}
