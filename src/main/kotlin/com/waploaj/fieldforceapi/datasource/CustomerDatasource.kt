package com.waploaj.fieldforceapi.datasource

import com.waploaj.fieldforceapi.model.Customer
import org.springframework.stereotype.Repository

@Repository
interface CustomerDatasource {

    fun getCustomers():Collection<Customer>
}