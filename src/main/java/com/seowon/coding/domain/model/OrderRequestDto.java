package com.seowon.coding.domain.model;

@Entity
@Table(name = "orders") // "order" is a reserved keyword in SQL
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class OrderRequestDto{
    private String customerName;
    private String customerEmail;
    private List<ProductRequestDto> products;
}