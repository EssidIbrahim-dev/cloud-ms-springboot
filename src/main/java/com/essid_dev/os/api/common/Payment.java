package com.essid_dev.os.api.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private int paymentId;
    private String paymentStatus;
    private String transactionId;
    private double amount;
    private int orderId;

}
