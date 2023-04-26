package com.otiutiunnyk.project.diploma.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "parking_info_from_users")
data class ParkingInfoFromUser(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: String,
    @ManyToOne
    @JoinColumn(name = "user_id")
    var user: User,
    @Column(name = "geolocation")
    var geolocation: String,
    @Column(name = "free_places_number")
    var freePlacesNumber: Int
)
