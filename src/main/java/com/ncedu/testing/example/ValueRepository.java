package com.ncedu.testing.example;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface ValueRepository extends PagingAndSortingRepository<Value, Long> {
}
