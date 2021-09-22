package com.waploaj.fieldforceapi.model

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import org.jetbrains.annotations.NotNull
import javax.persistence.*


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ospos_customer")
data class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val person_id: Int = -1,

    @NotNull
    val storeBusinessName: String,
    val latitude: String,
    val longitude: String,
    val retailId: Int,
    val channelId: Int,
    val locationId: Int,
    val cardId: Int,
    val point: Float,
    val discountPercentage: String,
    val saleTaxCode: String,
    val taxable: Int,
    val deleted: Int,
    val packageId: Int,

    )
