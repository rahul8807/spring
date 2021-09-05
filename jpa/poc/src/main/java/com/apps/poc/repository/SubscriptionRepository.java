package com.apps.poc.repository;

import com.apps.poc.model.Subscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends CrudRepository< Subscription,Integer > {
}
