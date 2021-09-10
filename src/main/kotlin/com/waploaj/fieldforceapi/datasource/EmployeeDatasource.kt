package com.waploaj.fieldforceapi.datasource

import com.waploaj.fieldforceapi.model.Person

interface EmployeeDatasource {

    fun getEmployee():Collection<Person>
}