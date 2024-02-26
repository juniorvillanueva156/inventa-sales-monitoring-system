package com.cdfmsv.inventa;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
public interface TransactionRepository extends CrudRepository<Transaction, Integer> {
}