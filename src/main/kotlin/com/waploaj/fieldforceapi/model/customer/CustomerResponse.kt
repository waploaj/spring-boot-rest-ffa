package com.waploaj.fieldforceapi.model.customer

data class CustomerResponse(
    val id:String,
    val storeBusinessName:String,
    val taxable:Int,
    val saleTaxCode:String,
    val discountPercent:Double,
    val packageId:String,
    val point:Int,
    val latitude:Double,
    val longitude:Double,
    val cardId:String,
    val visitId:String,
    val channelId:String,
    val deleted:Int

)
