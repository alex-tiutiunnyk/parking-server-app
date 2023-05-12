package com.otiutiunnyk.project.diploma.model

import jakarta.persistence.*

@Entity
@Table(name = "delete_requests")
class DeleteRequest() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:Column(name = "id")
    var id: Long? = null

    @get:Column(name = "comment", nullable = false)
    var comment: String? = null

    @ManyToOne
    @get:JoinColumn(name = "parking_area_id", referencedColumnName = "id", nullable = false)
    var parkingArea: ParkingArea? = null

    @ManyToOne
    @get:JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    var user: User? = null

    constructor(comment: String, parkingArea: ParkingArea, user: User) : this() {
        this.comment = comment
        this.parkingArea = parkingArea
        this.user = user
    }
}
