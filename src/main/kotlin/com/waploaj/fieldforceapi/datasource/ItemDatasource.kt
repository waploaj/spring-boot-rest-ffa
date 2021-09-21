package com.waploaj.fieldforceapi.datasource

import com.waploaj.fieldforceapi.model.Item
import org.springframework.stereotype.Repository

@Repository
interface ItemDatasource {

    fun getItem():Collection<Item>
}