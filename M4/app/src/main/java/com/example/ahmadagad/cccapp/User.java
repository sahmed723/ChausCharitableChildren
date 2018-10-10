package com.example.ahmadagad.cccapp;

public class User {
    String _username;
    String _password;
    String _userType;
    public User(String username, String password, String userType) {
        _username = username;
        _password = password;
        _userType = userType;
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
}
