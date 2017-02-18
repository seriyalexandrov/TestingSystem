package com.ncedu.testing.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Service("valueService")
public class ValueServiceImpl implements ValueService {
    private ValueRepository valueRepository;

    @Transactional(readOnly=true)
    public List<Value> findAll() {
        List<Value> values = new ArrayList<>();
        valueRepository.findAll().forEach(values::add);
        return values;
    }

    public Value save(Value value) {
        return valueRepository.save(value);
    }

    @Autowired
    public void setValueRepository(ValueRepository valueRepository) {
        this.valueRepository = valueRepository;
    }
}
