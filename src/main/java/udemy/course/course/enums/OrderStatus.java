package udemy.course.course.enums;

public enum OrderStatus {
    WAITING_PAYDMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code){
        this.code = code;
    }



    public int getCode() {
        return  code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static OrderStatus valueOf(int code){
        for (OrderStatus values : OrderStatus.values()){
            if (values.getCode() == code){
            return values;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus Code");
    }
}
