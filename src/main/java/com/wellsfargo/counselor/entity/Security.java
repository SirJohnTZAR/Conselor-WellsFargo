package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jdk.jfr.MetadataDefinition;
import jdk.jfr.Name;
import jdk.jfr.Relational;

import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue
    public long securityId;

    @MetadataDefinition
    @Relational
    @Name("package com.wellsfargo.counselor.entity")
    public @interface portfolioId{};

    @Column
    public String name;

    @Column
    public String category;

    @Column
    private long purchasePrice;

    @Column
    private Date purchaseDate;

    @Column
    private int quantity;

    protected Security() {}

    public Security(String name, String category,
                    long purchasePrice, Date purchaseDate, int quantity) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
