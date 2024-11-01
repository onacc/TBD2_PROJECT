/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tbd2proyecto;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


/**
 *
 * @author gcano
 */
public class Conexion {
    private String link;
    private MongoClient mongoClient;
    private MongoDatabase db;
    private MongoCollection<Document> collection;

    public Conexion(String link) {
        this.link = link;
    }

    public void conectar() {
        try {
            mongoClient = (MongoClient) MongoClients.create(link); 
            db = mongoClient.getDatabase("Farmacia"); 
            collection = db.getCollection("farmacias"); 

            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void disconnect() {
        if (mongoClient != null) {
            mongoClient.close(); 
        } else {
            System.out.println("esta connectado");
        }
    }

    // Getter for collection if needed
    public MongoCollection<Document> getCollection() {
        return collection;
    }
/*String link;
MongoDatabase db;
MongoCollection collection;
    public Conexion(String link) {
        this.link = link;
       
    }
 public void conectar(){
        MongoClient mongoClient = (MongoClient) MongoClients.create(link);
        this.db = mongoClient.getDatabase("Farmacia");
        this.collection = db.getCollection("farmacias");
        
        
}*/

    public MongoDatabase getDb() {
        return db;
    }

    public void setDb(MongoDatabase db) {
        this.db = db;
    }

    

    public void setCollection(MongoCollection collection) {
        this.collection = collection;
    }
 
    
    
}


