package com.moonbolt.Klothing.Repositories

import com.moonbolt.Klothing.Models.Cloth
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClothRepository : JpaRepository<Cloth, Int> {
    fun findByClothId(clothId:Int): List<Cloth>
}