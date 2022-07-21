package com.coralogix.calculator.model;


import javax.persistence.*;

@Entity
@Table
public class ExchangeRate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long exchangeRateId;

    @Column
    private String originCurrency;
    @Column
    private String finalCurrency;
    @Column
    private String date;
    @Column
    private String value;

    public ExchangeRate(){
        super();
    }

    public ExchangeRate( String originCurrency, String finalCurrency, String date, String value) {
        super();
        this.originCurrency = originCurrency;
        this.finalCurrency = finalCurrency;
        this.date = date;
        this.value = value;
    }

    public Long getExchangeRateId() {
        return exchangeRateId;
    }

    public ExchangeRate setExchangeRateId(Long exchangeRateId) {
        this.exchangeRateId = exchangeRateId;
        return this;
    }

    public String getOriginCurrency() {
        return originCurrency;
    }

    public ExchangeRate setOriginCurrency(String originCurrency) {
        this.originCurrency = originCurrency;
        return this;
    }

    public String getFinalCurrency() {
        return finalCurrency;
    }

    public ExchangeRate setFinalCurrency(String finalCurrency) {
        this.finalCurrency = finalCurrency;
        return this;
    }

    public String getDate() {
        return date;
    }

    public ExchangeRate setDate(String date) {
        this.date = date;
        return this;
    }

    public String getValue() {
        return value;
    }

    public ExchangeRate setValue(String value) {
        this.value = value;
        return this;
    }



    @Override
    public String toString() {
        return "ExchangeRate{" +
                "exchangeRateId=" + exchangeRateId +
                ", originCurrency='" + originCurrency + '\'' +
                ", finalCurrency='" + finalCurrency + '\'' +
                ", date='" + date + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
