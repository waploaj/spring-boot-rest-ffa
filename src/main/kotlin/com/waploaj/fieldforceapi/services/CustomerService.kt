package com.waploaj.fieldforceapi.services

import com.waploaj.fieldforceapi.datasource.CustomerDatasource
import com.waploaj.fieldforceapi.model.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
 class CustomerService(private val customerRepository:CustomerDatasource) {

     fun getCustomer():List<Customer> = customerRepository.findAll()
}