package eztrade.ws.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tblOrder")
class Order(
        var instruction: String,
        var user: String,
        var asset: String,
        var unit: Int,
        var price: Double,
        var total: Double,
        var insertDate: LocalDateTime  = LocalDateTime.now(),
        var updateDate: LocalDateTime = LocalDateTime.now(),
        @Id @GeneratedValue
        var orderId: Long? = null)