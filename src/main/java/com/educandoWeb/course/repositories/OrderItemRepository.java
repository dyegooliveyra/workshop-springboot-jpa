package com.educandoWeb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoWeb.course.entities.OrderItem;
import com.educandoWeb.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>  {

}
