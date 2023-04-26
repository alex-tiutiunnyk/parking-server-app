package com.otiutiunnyk.project.diploma.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "comments")
data class Comment(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: String,
    @Column(name = "content")
    var content: String,
    @Column(name = "parking_area_id")
    //dependency to ParkingArea
    val parkingAreaId: UUID,
    @Column(name = "user_id")
    //dependency to Users
    val userId: UUID
)
