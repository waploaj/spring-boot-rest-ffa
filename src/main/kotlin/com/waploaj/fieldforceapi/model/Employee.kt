package com.waploaj.fieldforceapi.model

import org.jetbrains.annotations.NotNull
import javax.persistence.*


@Entity
 data class  Person(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val personId:Int = 0,

    @NotNull
    val username:String,
    @NotNull
    val password:String,
    val deleted:Int,
    val hashcode:Int,
    val language_code:String,
    val token:String?,
    val lastUpdate: String,
    val language:String,
)
