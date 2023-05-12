package com.otiutiunnyk.project.diploma.model

import jakarta.persistence.*

@Entity
@Table(name = "comments")
class Comment() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null

    @get:Column(name = "content", nullable = false)
    var content: String? = null

    @ManyToOne
    @get:JoinColumn(name = "parking_area_id", referencedColumnName = "id", nullable = false)
    var parkingArea: ParkingArea? = null

    @ManyToOne
    @get:JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    var user: User? = null

    constructor(content: String, parkingArea: ParkingArea, user: User) : this() {
        this.content = content
        this.parkingArea = parkingArea
        this.user = user
    }
}
