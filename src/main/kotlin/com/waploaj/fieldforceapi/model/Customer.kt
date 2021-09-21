package com.waploaj.fieldforceapi.model

import jdk.jfr.Percentage
import org.jetbrains.annotations.NotNull
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val person_id:Int = -1,

    @NotNull
    val storeBusinessName:String,
    val latitude:String,
    val longitude:String,
    val retailId:Int,
    val channelId:Int,
    val locationId:Int,
    val cardId:Int,
    val point:Float,
    val discountPercentage: String,
    val saleTaxCode:String,
    val taxable:Int,
    val deleted:Int,
    val packageId:Int,



)
