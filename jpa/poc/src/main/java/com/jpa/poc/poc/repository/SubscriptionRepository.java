package com.jpa.poc.poc.repository;

import com.jpa.poc.poc.model.Subscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends CrudRepository< Subscription,Integer > {
}
