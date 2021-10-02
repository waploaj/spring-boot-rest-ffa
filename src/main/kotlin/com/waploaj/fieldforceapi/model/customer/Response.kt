package com.waploaj.fieldforceapi.model.customer

data class Response<T>(
    val status:String,
    val code: Int,
    val response: T,
    val message:String
)
