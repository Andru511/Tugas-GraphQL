/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphql;

import java.util.*;

public class ProductRepository {
   private static List<Product> productList = new ArrayList<>();
   private static long idCounter = 1;

   public static Product add(String name, Double price, String category) {
       Product product = new Product(idCounter++, name, price, category);
       productList.add(product);
       return product;
   }

   public static List<Product> findAll() {
       return productList;
   }

   public static Product findById(Long id) {
       return productList.stream().filter(p -> p.id.equals(id)).findFirst().orElse(null);
   }
    public static Product update(Long id, String name, Double price, String category) {
        Product product = findById(id);
           if (product != null) {
               product.name = name;
               product.price = price;
               product.category = category;
           }
           return product;
       }

   public static boolean delete(Long id) {
       return productList.removeIf(p -> p.id.equals(id));
   }
}