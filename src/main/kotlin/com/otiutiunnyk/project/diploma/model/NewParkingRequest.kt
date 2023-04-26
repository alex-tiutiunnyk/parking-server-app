package com.otiutiunnyk.project.diploma.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "new_parking_requests")
data class NewParkingRequest(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: String,
    @Column(name = "geolocation")
    var geolocation: String,
    @Column(name = "price_per_hour")
    var pricePerHour: Double?,
    @Column(name = "is_for_disabled_person")
    var isForDisabledPerson: Boolean?,
    @Column(name = "is_for_electric_car")
    var isForElectricCar: Boolean?,
    @Column(name = "comment")
    var comment: String?,
    @Column(name = "capacity")
    var capacity: Int,
    @ManyToOne
    @JoinColumn(name = "user_id")
    var userId: User
)
