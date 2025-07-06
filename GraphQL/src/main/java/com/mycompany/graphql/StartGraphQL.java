/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.graphql;

/**
 *
 * @author ITBSS
 */
import static spark.Spark.*;
import com.google.gson.*;
import graphql.*;

public class StartGraphQL {

   public static void main(String[] args) throws Exception {
       GraphQL graphql = GraphQLConfig.init();
       Gson gson = new Gson();

       port(4567);
       post("/graphql", (req, res) -> {
           res.type("application/json");

           JsonObject request = gson.fromJson(req.body(), JsonObject.class);
           String query = request.get("query").getAsString();

           ExecutionResult result = graphql.execute(query);
           return gson.toJson(result.toSpecification());
       });
   }
}