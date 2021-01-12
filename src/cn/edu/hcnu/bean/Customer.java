package cn.edu.hcnu.bean;

import java.util.Date;
import java.util.Set;

public class Customer {//订票人或者乘客
    private String id;
    private String name;//订票人名字
    private String customerType;//乘客类型： 成人、儿童、婴儿
    private String phoen;//订票人电话
    private String cardId;//订票人身份证号
    private Set<Order> SetOrder;//乘客订单
    private Date birthDate;//乘客出生日期

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getPhoen() {
        return phoen;
    }

    public void setPhoen(String phoen) {
        this.phoen = phoen;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Set<Order> getSetOrder() {
        return SetOrder;
    }

    public void setSetOrder(Set<Order> setOrder) {
        SetOrder = setOrder;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
