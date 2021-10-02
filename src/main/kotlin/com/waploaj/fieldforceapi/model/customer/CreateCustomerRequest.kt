package com.waploaj.fieldforceapi.model.customer

import org.jetbrains.annotations.NotNull
import org.springframework.boot.context.properties.bind.DefaultValue
import javax.validation.constraints.NotBlank

data class CreateCustomerRequest(
    @field:NotBlank
    val id:String?,

    @field:NotBlank
    @field:NotNull
    val storeBusinessName:String?,

    @field:NotBlank
    val taxable:Int?,

    @field:NotBlank
    val saleTaxCode:String?,

    @field:NotBlank
    val discountPercent:Double?,

    @field:NotBlank
    val packageId:String?,

    @field:NotBlank
    val point:Int?,

    @field:NotBlank
    @field:NotNull
    val latitude:Double?,

    @field:NotNull
    @field:NotBlank
    val longitude:Double?,

    @field:NotBlank
    @field:NotNull
    val CardId:String?,

    @field:NotBlank
    @field:NotNull
    val visitId:String?,

    @field:NotBlank
    @field:NotNull
    val channelId:String?,

    @field:NotBlank
    @field:NotNull
    val deleted:Int?
)
