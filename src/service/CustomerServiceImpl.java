package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerServiceImpl implements CustomerService {
    public static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"John","john@codegym.vn","HaNoi"));
        customers.put(2,new Customer(2,"Bill","Bill@codegym.vn","DaNang"));
        customers.put(3,new Customer(3,"Alex","Alex@codegym.vn","SaiGon"));
        customers.put(4,new Customer(4,"Adam","Adam@codegym.vn","Beijin"));
        customers.put(5,new Customer(5,"Sophia","Sophia@codegym.vn","Miami"));
        customers.put(6,new Customer(6,"Rose","Rose@codegym.vn","NewYork"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
//        return customers.keySet().stream().map(key->customers.get(key)).collect(Collectors.toList());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId() , customer);
    }

    @Override
    public Customer finById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id , customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
