package com.otiutiunnyk.project.diploma.repository

import com.otiutiunnyk.project.diploma.model.FavouritePlace
import org.springframework.data.jpa.repository.JpaRepository

interface FavouritePlaceRepository : JpaRepository<FavouritePlace, Long>