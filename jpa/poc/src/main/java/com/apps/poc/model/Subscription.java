package com.apps.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Entity
@Table(name = "subscription", schema = "dbo")
public class Subscription {

    @Id
    @Column(name = "subscription_id")
    private Integer subscriptionId;

    @Column(name = "subscription_date")
    private ZonedDateTime subscriptionDate;

    public Subscription(){}

    public Subscription ( Integer subscriptionId, ZonedDateTime subscriptionDate ) {
        this.subscriptionId = subscriptionId;
        this.subscriptionDate = subscriptionDate;
    }

    public Integer getSubscriptionId () {
        return subscriptionId;
    }

    public void setSubscriptionId ( Integer subscriptionId ) {
        this.subscriptionId = subscriptionId;
    }

    public ZonedDateTime getSubscriptionDate () {
        return subscriptionDate;
    }

    public void setSubscriptionDate ( ZonedDateTime subscriptionDate ) {
        this.subscriptionDate = subscriptionDate;
    }

    @Override
    public String toString () {
        return "Subscription{" +
                "subscriptionId=" + subscriptionId +
                ", subscriptionDate=" + subscriptionDate +
                '}';
    }
}
