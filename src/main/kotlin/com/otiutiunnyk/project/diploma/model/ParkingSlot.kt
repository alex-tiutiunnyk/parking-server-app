package com.otiutiunnyk.project.diploma.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "parking_slots")
data class ParkingSlot(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: String,
    @Column(name = "geolocation")
    var geolocation: String,
    @ManyToOne
    @JoinColumn(name = "parking_area_id")
    var parkingAreaId: ParkingArea
)
