package udemy.course.course.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import udemy.course.course.enums.OrderStatus;


import java.time.Instant;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    public Order() {
    }



    public Order(Long id, Instant moment, OrderStatus orderStatus, User client) {
        this.id = id;
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

//    public OrderStatus getOrderStatus() {
//        return OrderStatus.valueOf(orderStatus);
//    }

//    public void setOrderStatus(OrderStatus orderStatus) {
//        if (orderStatus != null){
//            this.orderStatus = orderStatus.getCode();
//        }
//    }
}
