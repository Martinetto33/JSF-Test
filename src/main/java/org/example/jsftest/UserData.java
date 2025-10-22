package org.example.jsftest;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serial;
import java.io.Serializable;

@Named("userData")
@SessionScoped
public class UserData implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        return "loginResult";
    }

    public String getWelcomeMessage() {
        return "Welcome %s".formatted(name);
    }
}
