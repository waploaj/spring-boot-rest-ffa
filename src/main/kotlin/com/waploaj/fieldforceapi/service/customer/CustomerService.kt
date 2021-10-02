package com.waploaj.fieldforceapi.services

import com.waploaj.fieldforceapi.model.customer.*

interface CustomerService {
    fun create(request:CreateCustomerRequest):CustomerResponse

    fun get(id:String): CustomerResponse

    fun list(listCustomerRequest:ListCustomerRequest):List<CustomerResponse>
}