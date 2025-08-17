package in.myproject.foodiesapi.entity;

import in.myproject.foodiesapi.io.OrderItem;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "orders")
@Data
@Builder
public class OrderEntity {

private String id;
private String userId;
private String userAddress;
private String phoneNumber;
private String email;
private List<OrderItem> orderItems;
private double amount ;
private String paymentStatus;
private String razorpayOrderId;
private String razorpaySignature;
private String razorpayPaymentId;
private String orderStatus;

}
