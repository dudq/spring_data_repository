package customer_management.service;

import customer_management.models.Customer;
import customer_management.models.Province;

public interface CustomerService {

    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);

}
