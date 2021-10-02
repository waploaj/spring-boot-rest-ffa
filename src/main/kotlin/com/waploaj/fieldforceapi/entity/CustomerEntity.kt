package com.waploaj.fieldforceapi.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "customers")
data class CustomerEntity(
    @Id
    val id:String,

    @Column(name = "store_business_name")
    val storeBusinessName:String,

    @Column(name = "taxable")
    val taxable:Int,

    @Column(name = "sale_tax_code")
    val saleTaxCode:String,

    @Column(name = "discount_percent")
    val discountPercent:Double,

    @Column(name = "package_id")
    val packageId:String,

    @Column(name = "point")
    val point:Int,

    @Column(name = "latitude")
    val latitude:Double,

    @Column(name = "longitude")
    val longitude:Double,

    @Column(name = "card_id")
    val cardId:String,

    @Column(name = "visit_id")
    val visitId:String,

    @Column(name = "channel_id")
    val channelId:String,

    @Column(name = "deleted")
    val deleted:Int

)
