package com.pedantic.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "tax_id"))
public class Tax extends AbstractEntity {


    @Column(name = "TAX_RATE")
    private BigDecimal taxRate;


    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }
}
