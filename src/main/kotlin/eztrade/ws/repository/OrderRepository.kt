package eztrade.ws.repository

import eztrade.ws.entity.Order
import org.springframework.data.repository.CrudRepository

interface OrderRepository : CrudRepository<Order, Long> {
    fun findByUser(user: String): List<Order>
}