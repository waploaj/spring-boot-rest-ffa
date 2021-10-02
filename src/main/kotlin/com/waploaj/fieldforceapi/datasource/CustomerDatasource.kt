package com.waploaj.fieldforceapi.datasource

import com.waploaj.fieldforceapi.entity.CustomerEntity
import org.springframework.data.jpa.repository.JpaRepository


interface CustomerDatasource : JpaRepository<CustomerEntity, String>{

}