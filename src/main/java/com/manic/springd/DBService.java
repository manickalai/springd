package com.manic.springd;

import org.springframework.stereotype.Service;

@Service
public class DBService {

    final private DB db;

    public DBService(DB db) {
        this.db = db;
    }
    public String getData() {
        return db.getData();
    }

}
