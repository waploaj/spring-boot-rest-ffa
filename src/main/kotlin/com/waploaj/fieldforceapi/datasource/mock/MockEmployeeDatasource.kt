package com.waploaj.fieldforceapi.datasource.mock

import com.waploaj.fieldforceapi.datasource.EmployeeDatasource
import com.waploaj.fieldforceapi.model.Person
import org.springframework.stereotype.Repository

@Repository
class MockEmployeeDatasource:EmployeeDatasource {


    override fun getEmployee():Collection<Person>
}