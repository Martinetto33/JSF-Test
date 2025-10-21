package org.example.jsftest;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("navigator")
@RequestScoped
public class Navigator implements Serializable {
    public String moveToBeanPage() {
        return "beanPage";
    }
}
