package com.waploaj.fieldforceapi.datasource.mock

import org.assertj.core.api.Assertions

import org.junit.jupiter.api.Test

internal class MockEmployeeDatasourceTest{

    private val mockDatasource = MockEmployeeDatasource()
    @Test
    fun `should provide the collection of Employee`(){
        //Given

        //when
        val employee = mockDatasource.getEmployee()

        //Then
        Assertions.assertThat(employee).isNotEmpty
    }
}