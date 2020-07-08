package eztrade.ws.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Holding(
        var user: String,
        var asset: String,
        var unit: Int,
        @Id @GeneratedValue
        var holdingId: Long? = null)


