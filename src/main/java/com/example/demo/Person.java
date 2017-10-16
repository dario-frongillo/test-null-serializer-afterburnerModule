package com.example.demo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Person {
    @JsonSerialize(nullsUsing=MyNullSerializer.class)
    private String a;
    private String b;
    @JsonSerialize(nullsUsing=MyNullSerializer.class)
    private String c;

    @JsonSerialize(nullsUsing=MyNullSerializer2.class)
    private Double d;

    private Double e;

    @JsonSerialize(nullsUsing=MyNullSerializer2.class)
    private Integer f;

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public Double getE() {
        return e;
    }

    public void setE(Double e) {
        this.e = e;
    }

    public Integer getF() {
        return f;
    }

    public void setF(Integer f) {
        this.f = f;
    }

    public Person(){}

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
