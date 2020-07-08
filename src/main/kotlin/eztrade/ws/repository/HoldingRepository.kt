package eztrade.ws.repository

import eztrade.ws.entity.Holding
import org.springframework.data.repository.CrudRepository

interface HoldingRepository : CrudRepository<Holding, Long> {
    fun findByUser(user: String): List<Holding>
}