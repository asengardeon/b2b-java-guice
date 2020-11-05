package modules;

import com.google.inject.AbstractModule;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongoModule extends AbstractModule implements ConnectionDatabase {

    private MongoClient mongoClient;

    @Override
    protected void configure() {

    }

    @Override
    public void conectar() {
        if (mongoClient == null)
            mongoClient = MongoClients.create("mongodb://localhost:27018");
    }

    public MongoClient getMongoClient(){
        return mongoClient;
    }
}
