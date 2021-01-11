import java.util.Date;

public class Customer {//订票人或者乘客
    private String id;
    private String name;//订票人名字
    private String customerType;//乘客类型： 成人、儿童、婴儿
    private String phoen;//订票人电话
    private String cardId;//订票人身份证号
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
}
