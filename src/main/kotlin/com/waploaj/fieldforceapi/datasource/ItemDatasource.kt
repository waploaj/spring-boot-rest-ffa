package com.waploaj.fieldforceapi.datasource

import com.waploaj.fieldforceapi.model.Item
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemDatasource : JpaRepository<Item, Int>{
}