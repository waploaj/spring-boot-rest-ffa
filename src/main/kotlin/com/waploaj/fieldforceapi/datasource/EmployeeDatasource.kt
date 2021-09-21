package com.waploaj.fieldforceapi.datasource

import com.waploaj.fieldforceapi.model.Person
import org.springframework.stereotype.Repository

@Repository
interface EmployeeDatasource {

    fun getEmployee():Collection<Person>

}