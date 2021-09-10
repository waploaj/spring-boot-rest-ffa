package com.waploaj.fieldforceapi.datasource.mock

import com.waploaj.fieldforceapi.datasource.EmployeeDatasource
import com.waploaj.fieldforceapi.model.Person
import org.springframework.stereotype.Repository

@Repository
class MockEmployeeDatasource:EmployeeDatasource {

    val employee = listOf<Person>(Person(username = "", password = "", deleted = 0, personId = 1, language = ""))
    override fun getEmployee():Collection<Person> = employee
}