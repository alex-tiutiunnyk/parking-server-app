package com.otiutiunnyk.project.diploma.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "favourite_places")
data class FavouritePlace (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: String,
    @Id
    @ManyToOne
    @JoinColumn(name = "parking_area_id", referencedColumnName = "id")
    var parkingArea: ParkingArea,
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    var user: User
)
