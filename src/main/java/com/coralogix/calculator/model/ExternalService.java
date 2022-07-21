package com.coralogix.calculator.model;

import java.sql.Timestamp;
import java.util.Map;

public class ExternalService {

    private boolean success;
    private Timestamp timestamp;
    private String base;
    private String date;
    private Map<String, String> rates;

    public boolean isSuccess() {
        return success;
    }

    public ExternalService setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public ExternalService setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getBase() {
        return base;
    }

    public ExternalService setBase(String base) {
        this.base = base;
        return this;
    }

    public String getDate() {
        return date;
    }

    public ExternalService setDate(String date) {
        this.date = date;
        return this;
    }

    public Map<String, String> getRates() {
        return rates;
    }

    public ExternalService setRates(Map<String, String> rates) {
        this.rates = rates;
        return this;
    }

    public ExternalService(){
        super();
    }

    public ExternalService(boolean success, Timestamp timestamp, String base, String date, Map<String, String> rates) {
        super();
        this.success = success;
        this.timestamp = timestamp;
        this.base = base;
        this.date = date;
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "ExternalService{" +
                "success=" + success +
                ", timestamp=" + timestamp +
                ", base='" + base + '\'' +
                ", date='" + date + '\'' +
                ", rates=" + rates +
                '}';
    }
}
