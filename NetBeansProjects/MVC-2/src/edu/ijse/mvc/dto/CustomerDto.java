/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author gihan5323
 */
public class CustomerDto {
    private String custId;
    private String custTitle;
    private String dob;
    private double salary;
    private String custAddress;
    private String city;
    private String province;
    private String postelCode;

    public CustomerDto() {
    }

    public CustomerDto(String custId, String custTitle, String dob, double salary, String custAddress, String city, String province, String postelCode) {
        this.custId = custId;
        this.custTitle = custTitle;
        this.dob = dob;
        this.salary = salary;
        this.custAddress = custAddress;
        this.city = city;
        this.province = province;
        this.postelCode = postelCode;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the custTitle
     */
    public String getCustTitle() {
        return custTitle;
    }

    /**
     * @param custTitle the custTitle to set
     */
    public void setCustTitle(String custTitle) {
        this.custTitle = custTitle;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the custAddress
     */
    public String getCustAddress() {
        return custAddress;
    }

    /**
     * @param custAddress the custAddress to set
     */
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the postelCode
     */
    public String getPostelCode() {
        return postelCode;
    }

    /**
     * @param postelCode the postelCode to set
     */
    public void setPostelCode(String postelCode) {
        this.postelCode = postelCode;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "custId=" + custId + ", custTitle=" + custTitle + ", dob=" + dob + ", salary=" + salary + ", custAddress=" + custAddress + ", city=" + city + ", province=" + province + ", postelCode=" + postelCode + '}';
    }
    
    
    
    
    
}
