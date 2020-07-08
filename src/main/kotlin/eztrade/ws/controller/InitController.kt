package eztrade.ws.controller

import eztrade.ws.entity.Holding
import eztrade.ws.entity.Order
import eztrade.ws.repository.HoldingRepository
import eztrade.ws.repository.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class InitController (@Autowired val orderRepository: OrderRepository,
@Autowired val holdingRepository: HoldingRepository) {

    @RequestMapping("/init")

    fun init(): String {
        val orders = listOf(
                Order("BUY", "sam", "NAB", 10, 10.0, 100.0, LocalDateTime.now().minusDays(10),  LocalDateTime.now().minusDays(10)),
                Order("BUY", "sam", "CBA", 10, 15.0, 150.0, LocalDateTime.now().minusDays(5), LocalDateTime.now().minusDays(5)),
                Order("BUY", "sam", "BHP", 10, 10.0, 100.0),
                Order("SELL", "sam", "NAB", 5, 11.0, 55.0)
        )
        orderRepository.saveAll(orders)

        val holdings = listOf(
            Holding ("sam","NAB",5) ,
            Holding ("sam","CBA",10) ,
            Holding ("sam","BHP",10)
        )
        holdingRepository.saveAll(holdings)

        return "OK"
    }

}