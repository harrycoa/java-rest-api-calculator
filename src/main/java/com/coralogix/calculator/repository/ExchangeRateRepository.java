package com.coralogix.calculator.repository;

import com.coralogix.calculator.model.ExchangeRate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ExchangeRateRepository extends CrudRepository<ExchangeRate, Long> {


    @Query(value = "select * from EXCHANGE_RATE where ORIGIN_CURRENCY = :originCurrency and FINAL_CURRENCY = :finalCurrency order by date desc LIMIT 1", nativeQuery = true)
    ExchangeRate findExchangeRate(String originCurrency, String finalCurrency);

}
