package com.example.ahmadagad.cccapp;

/**
 * main class
 */
public class User {
    public String _username;
    private String _password;
    private String _userType;
    private String _email;

    /**
     * @param username of user
     * @param password of user
     * @param userType of user
     * @param email of user
     */
    public User(String username, String password, String userType, String email) {

        _username = username;
        _password = password;
        _userType = userType;
        _email = email;
    }

    /**
     * empty constructer
     */
    public User(){

    }

    /**
     * @return username of user
     */
    public String get_username() {
        return _username;
    }

    /**
     * @return password of user
     */
    public String get_password() {
        return _password;
    }

    /**
     * @return usertype of user
     */
    public String get_userType() {
        return _userType;
    }

    /**
     * @return email of user
     */
    public String get_email() {
        return _email;
    }

    /**
     * @return username of user
     */
    public String toString() {
        return _username;
    }
}

