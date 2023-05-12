package com.otiutiunnyk.project.diploma.controller

import com.otiutiunnyk.project.diploma.dto.FavouritePlaceDto
import com.otiutiunnyk.project.diploma.model.FavouritePlace
import com.otiutiunnyk.project.diploma.repository.FavouritePlaceRepository
import org.springframework.lang.NonNull
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/favplaces")
class FavouritePlaceController(
    private val favouritePlaceRepository: FavouritePlaceRepository
) {
//    @GetMapping("/{userId}")
//    fun getAllFavouritePlacesByUser(@PathVariable userId: Long): Optional<MutableIterable<FavouritePlace>> = favouritePlaceRepository.findAllById(userId)

    @PostMapping("") //TODO: це тільки для нових чи і для оновлення старих?
    fun addFavouritePlace(@RequestBody @NonNull favPlace: FavouritePlaceDto) =
        favouritePlaceRepository.save(favPlace.toApiEntity())

    @DeleteMapping("/{id}")
    fun deleteFavouritePlace(@PathVariable id: Long) = favouritePlaceRepository.deleteById(id)
}