package vn.edu.fit.iuh.services;

import java.util.List;
import vn.edu.fit.iuh.models.Orders;
import vn.edu.fit.iuh.repositories.OrderRepository;

public class OrderService {

  private OrderRepository orderRepository;

  public  OrderService(){
    orderRepository = new OrderRepository();
  }

  public List<Orders> findAll(){
    return orderRepository.getAll();
  }

}
