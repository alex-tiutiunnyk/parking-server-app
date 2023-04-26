package com.otiutiunnyk.project.diploma.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "delete_requests")
data class DeleteRequest(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: String,
    @Column(name = "comment")
    var comment: String,
    @Column(name = "parking_area_id")
    //dependency to ParkingArea
    var parkingAreaId: UUID,
    @Column(name = "user_id")
    //dependency to User
    var userId: UUID
    )
