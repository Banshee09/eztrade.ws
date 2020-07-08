package eztrade.ws.controller

import eztrade.ws.entity.Holding
import eztrade.ws.repository.HoldingRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HoldingController (@Autowired val holdingRepository: HoldingRepository) {

    @RequestMapping("/holdings")
    fun byUser(@RequestParam user:String): List <Holding> {
        return holdingRepository.findByUser(user)
    }

}