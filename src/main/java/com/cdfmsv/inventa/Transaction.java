package com.cdfmsv.inventa;
import jakarta.persistence.*;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tr_transactionnumber;
    private String tr_transactiondate;
    private String tr_customername;
    private String tr_order;
    private Integer tr_priceperquantity;
    private Integer tr_quantity;
    private Integer tr_totalprice;
    private Integer tr_payment;
    private Integer tr_change;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTr_transactionnumber() {
        return tr_transactionnumber;
    }

    public void setTr_transactionnumber(String tr_transactionnumber) {
        this.tr_transactionnumber = tr_transactionnumber;
    }

    public String getTr_transactiondate() {
        return tr_transactiondate;
    }

    public void setTr_transactiondate(String tr_transactiondate) {
        this.tr_transactiondate = tr_transactiondate;
    }

    public String getTr_customername() {
        return tr_customername;
    }

    public void setTr_customername(String tr_customername) {
        this.tr_customername = tr_customername;
    }

    public String getTr_order() {
        return tr_order;
    }

    public void setTr_order(String tr_order) {
        this.tr_order = tr_order;
    }

    public Integer getTr_priceperquantity() {
        return tr_priceperquantity;
    }

    public void setTr_priceperquantity(Integer tr_priceperquantity) {
        this.tr_priceperquantity = tr_priceperquantity;
    }

    public Integer getTr_quantity() {
        return tr_quantity;
    }

    public void setTr_quantity(Integer tr_quantity) {
        this.tr_quantity = tr_quantity;
    }

    public Integer getTr_totalprice() {
        return tr_totalprice;
    }

    public void setTr_totalprice(Integer tr_totalprice) {
        this.tr_totalprice = tr_totalprice;
    }

    public Integer getTr_payment() {
        return tr_payment;
    }

    public void setTr_payment(Integer tr_payment) {
        this.tr_payment = tr_payment;
    }

    public Integer getTr_change() {
        return tr_change;
    }

    public void setTr_change(Integer tr_change) {
        this.tr_change = tr_change;
    }
}
