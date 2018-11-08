package com.example.ahmadagad.cccapp;

/**
 * main class
 */
class User {
    private String _username;
    private String _password;
    private String _userType;

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
        String _email = email;
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

// --Commented out by Inspection START (11/8/18, 12:39 PM):
//    /**
//     * @return email of user
//     */
//    public String get_email() {
//        return _email;
//    }
// --Commented out by Inspection STOP (11/8/18, 12:39 PM)

    /**
     * @return username of user
     */
    public String toString() {
        return _username;
    }
}

