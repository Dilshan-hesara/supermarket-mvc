/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.dto;

/**
 *
 * @author DILSHAN HESARA
 */
public class CustomerDto {
    private String CustID;
    private String CustTitle;
    private String name;
    private String DOB;
    private Double Salary;
    private String address;
    private String citiy;
    private String province;
    private String postcode;

    public CustomerDto() {
    }

    public CustomerDto(String CustID, String CustTitle, String name, String DOB, Double Salary, String address, String citiy, String province, String postcode) {
        this.CustID = CustID;
        this.CustTitle = CustTitle;
        this.name = name;
        this.DOB = DOB;
        this.Salary = Salary;
        this.address = address;
        this.citiy = citiy;
        this.province = province;
        this.postcode = postcode;
    }

    public String getCustID() {
        return CustID;
    }

    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

    public String getCustTitle() {
        return CustTitle;
    }

    public void setCustTitle(String CustTitle) {
        this.CustTitle = CustTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double Salary) {
        this.Salary = Salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCitiy() {
        return citiy;
    }

    public void setCitiy(String citiy) {
        this.citiy = citiy;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "CustID=" + CustID + ", CustTitle=" + CustTitle + ", name=" + name + ", DOB=" + DOB + ", Salary=" + Salary + ", address=" + address + ", citiy=" + citiy + ", province=" + province + ", postcode=" + postcode + '}';
    }


}
