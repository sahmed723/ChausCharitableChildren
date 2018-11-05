package com.example.ahmadagad.cccapp;

public class User {
    public String _username;
    private String _password;
    private String _userType;
    private String _email;

    public User(String username, String password, String userType, String email) {

        _username = username;
        _password = password;
        _userType = userType;
        _email = email;
    }

    public User(){

    }

    public String get_username() {
        return _username;
    }

    public String get_password() {
        return _password;
    }

    public String get_userType() {
        return _userType;
    }

    public String get_email() {
        return _email;
    }

    public String toString() {
        return _username;
    }
}

