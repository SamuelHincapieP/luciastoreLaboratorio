package storeapp.services;

import storeapp.domain.Admin;
import storeapp.domain.Customer;
import storeapp.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

public class AdminServiceImpl  implements AdminService , CustumerAdminService {

    private final CustomerRepository customerRepository;

    public AdminServiceImpl(Admin admin, CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Admin createAdmin(Admin admin) {
        return null;
    }

    @Override
    public Optional<Admin> getAdminById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Admin> getAdminByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public List<Admin> getAllAdmins() {
        return List.of();
    }

    @Override
    public Admin updateAdmin(Admin admin) {
        return null;
    }

    @Override
    public void deleteAdmin(int id) {

    }

    @Override
    public List<Customer> getAllCustomers() {

        return customerRepository.findAllCustomers();
    }

    @Override
    public void deleteCustomer(int id) {

    }
}
