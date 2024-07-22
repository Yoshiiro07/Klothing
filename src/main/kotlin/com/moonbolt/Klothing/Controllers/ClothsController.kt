package com.moonbolt.Klothing.Controllers

import com.moonbolt.Klothing.Models.Cloth
import com.moonbolt.Klothing.Repositories.ClothRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class ClothsController @Autowired constructor(private val clothRepository: ClothRepository) {

    @GetMapping("/cloths")
    fun getAllCloths(): List<Cloth> {
        return clothRepository.findAll()

    }
}