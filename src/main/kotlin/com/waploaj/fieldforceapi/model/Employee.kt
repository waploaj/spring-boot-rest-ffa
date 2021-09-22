package com.waploaj.fieldforceapi.model

import org.jetbrains.annotations.NotNull
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val personId: Long? = null,

    @NotNull
    val username: String,
    @NotNull
    val password: String,
    val deleted: Int,
    val hashcode: Int,
    val language_code: String,
    val token: String?,
    val lastUpdate: LocalDate? = LocalDate.now(),
    val language: String,
)
