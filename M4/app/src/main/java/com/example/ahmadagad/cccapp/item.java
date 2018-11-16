package com.example.ahmadagad.cccapp;

/**
 * main class
 */
class item {
    public String _time;
    public String _shortD;
    public String _fullD;
    public String _value;
    public String _itemType;
    public String _location;

    /**
     * @param time of item
     * @param shortD of item
     * @param fullD of item
     * @param value of item
     * @param itemType of item
     * @param location of item
     */
    public item(String time, String shortD, String fullD, String value, String itemType,
                String location) {
        _time = time;
        _shortD = shortD;
        _fullD = fullD;
        _value = value;
        _itemType = itemType;
        _location = location;

    }

    /**
     * empty constructer
     */
    public item() {

    }

}
