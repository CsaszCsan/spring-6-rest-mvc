package guru.springframework.spring6restmvc.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import guru.springframework.spring6restmvc.model.Customer;

public class CustomerServiceImpl implements CustomerService {
    
    private Map<UUID, Customer> CustomerMap;

    public CustomerServiceImpl() {
        Customer customer1 = Customer.builder().id(UUID.randomUUID()).name("Customer 1").version(1).createDate(LocalDateTime.now()).updateDate(LocalDateTime.now()).build();
        Customer customer2 = Customer.builder().id(UUID.randomUUID()).name("Customer 2").version(1).createDate(LocalDateTime.now()).updateDate(LocalDateTime.now()).build();
        Customer customer3 = Customer.builder().id(UUID.randomUUID()).name("Customer 3").version(1).createDate(LocalDateTime.now()).updateDate(LocalDateTime.now()).build();

        CustomerMap= new HashMap<>();
        CustomerMap.put(customer1.getId(), customer1);
        CustomerMap.put(customer2.getId(), customer2);
        CustomerMap.put(customer3.getId(), customer3);

    }


    public Customer getCustomerById(UUID uuid)
    {

        return CustomerMap.get(uuid);

    }

    public List<Customer> getAllCustomer()
    {
        return new ArrayList<>(CustomerMap.values());
    }

}