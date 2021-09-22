package com.waploaj.fieldforceapi.controller

import com.waploaj.fieldforceapi.model.Customer
import com.waploaj.fieldforceapi.services.CustomerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api/customer")
class CustomerController(private val customerService: CustomerService) {

    @GetMapping
    fun getCustomer():List<Customer> = customerService.getCustomer()
}