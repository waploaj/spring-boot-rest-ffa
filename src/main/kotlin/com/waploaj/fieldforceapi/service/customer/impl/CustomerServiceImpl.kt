package com.waploaj.fieldforceapi.service.customer.impl

import com.waploaj.fieldforceapi.datasource.CustomerDatasource
import com.waploaj.fieldforceapi.entity.CustomerEntity
import com.waploaj.fieldforceapi.error.NotFoundExeception
import com.waploaj.fieldforceapi.model.customer.CreateCustomerRequest
import com.waploaj.fieldforceapi.model.customer.CustomerResponse
import com.waploaj.fieldforceapi.model.customer.ListCustomerRequest
import com.waploaj.fieldforceapi.services.CustomerService
import com.waploaj.fieldforceapi.validation.ValidationUtil
import org.springframework.data.domain.PageRequest
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class CustomerServiceImpl(
    val customerDatasource:CustomerDatasource,
    val validation: ValidationUtil ):CustomerService {

    override fun create(request: CreateCustomerRequest): CustomerResponse {
        validation.validate(request)

        val customer = CustomerEntity(
            id = request.id!!,
            storeBusinessName = request.storeBusinessName!!,
            taxable = request.taxable!!,
            saleTaxCode = request.saleTaxCode!!,
            discountPercent = request.discountPercent!!,
            packageId = request.packageId!!,
            point = request.point!!,
            latitude = request.latitude!!,
            longitude = request.longitude!!,
            cardId = request.CardId!!,
            channelId = request.channelId!!,
            visitId = request.visitId!!,
            deleted = request.deleted!!


        )

        customerDatasource.save(customer)
        return CustomerResponse(
            id = customer.id,
            storeBusinessName = customer.storeBusinessName,
            taxable = customer.taxable,
            saleTaxCode = customer.saleTaxCode,
            discountPercent = customer.discountPercent,
            packageId = customer.packageId,
            point = customer.point,
            latitude = customer.latitude,
            longitude = customer.longitude,
            channelId = customer.channelId,
            visitId = customer.visitId,
            cardId = customer.cardId,
            deleted = customer.deleted

        )
    }

    override fun get(id: String): CustomerResponse {
        val customer = findCustomerByIdOrThrowNotFound(id)
        return convertCustomerToCustomerResponse(customer)
    }

    override fun list(listCustomerRequest: ListCustomerRequest): List<CustomerResponse> {
        val page = customerDatasource.findAll(PageRequest.of(listCustomerRequest.page, listCustomerRequest.size))
        val customers: List<CustomerEntity> = page.get().collect(Collectors.toList())
        return customers.map { convertCustomerToCustomerResponse(it) }
    }

    private fun findCustomerByIdOrThrowNotFound(id: String):CustomerEntity{
        val customer = customerDatasource.findByIdOrNull(id)
        if (customer == null){
            throw NotFoundExeception()
        }else{
            return customer
        }
    }

    private fun convertCustomerToCustomerResponse(customer:CustomerEntity):CustomerResponse{
        return CustomerResponse(
            id = customer.id,
            storeBusinessName = customer.storeBusinessName,
            taxable = customer.taxable,
            saleTaxCode = customer.saleTaxCode,
            discountPercent = customer.discountPercent,
            packageId = customer.packageId,
            point = customer.point,
            latitude = customer.latitude,
            longitude = customer.longitude,
            channelId = customer.channelId,
            visitId = customer.visitId,
            cardId = customer.cardId,
            deleted = customer.deleted
        )
    }
}