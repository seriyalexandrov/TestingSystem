package com.ncedu.testing.example;

import java.util.List;

public interface ValueService {
    List<Value> findAll();
    Value save(Value value);
}
