package com.waploaj.fieldforceapi.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Item(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val item:Int =0,
    val name:String,
    val description:String,
    val costPrice:Float,
    val unitPrice:Float,
    val reorderLevel:Float,
    val supplierId:Int,
    val itemNumber:Int,
    val receivingQuantity:Int,
    val pictureFilename:String,
    val stockType:Int,
    val itemType:Int,
    val taxCategoryId: Int,
    val deleted:Int

)
