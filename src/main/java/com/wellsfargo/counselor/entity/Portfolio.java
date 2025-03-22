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
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @MetadataDefinition
    @Relational
    @Name("package com.wellsfargo.counselor.entity")
    public @interface clientId{};

    @Column
    private Date createdAt;

    protected Portfolio() {}

    public Portfolio(Date createdAt) {;
        this.createdAt = createdAt;
        this.createdAt = new Date();
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
