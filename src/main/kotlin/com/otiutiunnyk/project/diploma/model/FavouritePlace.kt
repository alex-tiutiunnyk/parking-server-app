package com.otiutiunnyk.project.diploma.model

import jakarta.persistence.*

@Entity
@Table(name = "favourite_places")
class FavouritePlace() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:Column(name = "id")
    var id: Long? = null

    @ManyToOne
    @get:JoinColumn(name = "parking_area_id", referencedColumnName = "id", nullable = false)
    var parkingArea: ParkingArea? = null

    @ManyToOne
    @get:JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    var user: User? = null

    constructor(parkingArea: ParkingArea, user: User) : this() {
        this.parkingArea = parkingArea
        this.user = user //TODO: I think that the foreign key are not necessary in the constructor?
    }
}
