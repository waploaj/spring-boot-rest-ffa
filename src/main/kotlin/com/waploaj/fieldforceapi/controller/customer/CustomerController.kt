package com.waploaj.fieldforceapi.controller.customer

import com.waploaj.fieldforceapi.model.customer.CreateCustomerRequest
import com.waploaj.fieldforceapi.model.customer.CustomerResponse
import com.waploaj.fieldforceapi.model.customer.ListCustomerRequest
import com.waploaj.fieldforceapi.model.customer.Response
import com.waploaj.fieldforceapi.services.CustomerService
import org.springframework.web.bind.annotation.*

@RestController
class CustomerController(val customerservice:CustomerService) {

    @PostMapping(
        value = ["v1/api/customer"],
        consumes = ["application/json"],
        produces = ["application/json"]
    )

    fun createCustomer(@RequestBody request:CreateCustomerRequest):Response<CustomerResponse>{
        val res = customerservice.create(request)
        return Response(
            status = "successful created",
            code = 200,
            response = res,
            message = "Customer created successful"

        )
    }

    @GetMapping(
        value = ["v1/api/customer/{idCustomer}"],
        produces = ["application/json"]
    )

    fun getCustomer(@PathVariable("idCustomer") id:String):Response<CustomerResponse>{
        val res = customerservice.get(id)
        return Response(
            code = 200,
            response = res,
            status = "success",
            message = "succeccful get customer id " +id
        )
    }

    @GetMapping(
        value = ["v1/api/customer/list"],
        produces = ["application/json"]
    )

    fun listCustomer(@RequestParam(value = "size", defaultValue = "10") size:Int,
                    @RequestParam(value = "page", defaultValue = "0") page:Int):Response<List<CustomerResponse>>{
        val request = ListCustomerRequest(page = page, size = size)
        val responses = customerservice.list(request)
        return Response(
            status = "ok",
            code = 200,
            response = responses,
            message = "successfull achieve list of customers"

        )
    }
}