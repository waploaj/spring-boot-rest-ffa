package com.waploaj.fieldforceapi.datasource

import com.waploaj.fieldforceapi.model.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerDatasource : JpaRepository<Customer, Int>{

}