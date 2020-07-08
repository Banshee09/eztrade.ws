package eztrade.ws.controller

import eztrade.ws.entity.Order
import eztrade.ws.repository.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class OrderController(@Autowired val orderRepository: OrderRepository) {

    @RequestMapping("/orders")
    fun byUser(@RequestParam user:String): List <Order> {
        return orderRepository.findByUser(user)
    }

    @RequestMapping(value = ["/orders"], method = [RequestMethod.POST])
    fun createOrder(@RequestBody order : Order) : Order{
        return orderRepository.save(order)
    }

}