package com.techelevator.model;

public class Brewery {

    private int id;
    private String name;
    private String website;
    private String phone;
    private String history;
    private String address;
    private String hoursOfOperation;

    public Brewery() {
    }

    public Brewery(int id, String name, String website, String phone, String history, String address, String hoursOfOperation) {
        this.id = id;
        this.name = name;
        this.website = website;
        this.phone = phone;
        this.history = history;
        this.address = address;
        this.hoursOfOperation = hoursOfOperation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHoursOfOperation() {
        return hoursOfOperation;
    }

    public void setHoursOfOperation(String hoursOfOperation) {
        this.hoursOfOperation = hoursOfOperation;
    }

    @Override
    public String toString() {
        return "Brewery{" +
                "id=" + id +
                ", name='" + name +
                ", website=" + website +
                ", phone=" + phone +
                ", history=" + history +
                ", address=" + address +
                ", hoursOfOperation=" + hoursOfOperation +
                '}';
    }
}
