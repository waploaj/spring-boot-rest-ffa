package com.waploaj.fieldforceapi.datasource

import com.waploaj.fieldforceapi.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeDatasource : JpaRepository<Person, Int>{

}