package com.otiutiunnyk.project.diploma.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "parking_areas")
data class ParkingArea(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: String,
    @Column(name = "geolocation")
    var geolocation: String,
    @Column(name = "is_for_disabled_person")
    var isForDisabledPerson: Boolean?,
    @Column(name = "is_for_electric_car")
    var isForElectricCar: Boolean?,
    @Column(name = "capacity")
    var capacity: Int
    )
