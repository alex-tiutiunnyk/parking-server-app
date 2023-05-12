package com.otiutiunnyk.project.diploma.controller

import com.otiutiunnyk.project.diploma.dto.NewParkingRequestDto
import com.otiutiunnyk.project.diploma.model.NewParkingRequest
import com.otiutiunnyk.project.diploma.model.ParkingArea
import com.otiutiunnyk.project.diploma.repository.DeleteRequestRepository
import com.otiutiunnyk.project.diploma.repository.NewParkingRequestRepository
import com.otiutiunnyk.project.diploma.repository.ParkingAreaRepository
import com.otiutiunnyk.project.diploma.repository.UserRepository
import org.springframework.lang.NonNull
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/parkings")
class ParkingController(
    private val parkingRepository: ParkingAreaRepository,
    private val newParkingRequestRepository: NewParkingRequestRepository,
    private val deleteParkingRequestRepository: DeleteRequestRepository,
    private val userRepository: UserRepository
) {
    //existing parkings
    @GetMapping("")
    fun getAllParking(): MutableIterable<ParkingArea> = parkingRepository.findAll()

    @GetMapping("/{id}")
    fun getParkingById(@PathVariable id: Long): Optional<ParkingArea> = parkingRepository.findById(id)

    @DeleteMapping("/{id}")
    // crowdsourcing logic
    fun deleteParkingArea(@PathVariable parkingAreaId: Long) = deleteParkingRequestRepository.deleteById(parkingAreaId) //change the logic

    //new parking
    @GetMapping("/new")
    fun getAllNewParkingRequest(): MutableIterable<NewParkingRequest> = newParkingRequestRepository.findAll()

    @GetMapping("/new/{id}")
    fun getNewParkingRequest(@PathVariable id:Long): Optional<NewParkingRequest> = newParkingRequestRepository.findById(id)

    @PostMapping("/new")
    // crowdsourcing logic
    fun createNewParkingRequest(@RequestBody @NonNull newParkingRequest: NewParkingRequestDto): NewParkingRequest {
        val user = userRepository.findById(newParkingRequest.userId)
        //check the null validation and if I should add the @Valid annotation?
        // add createdAt to the table, so the requests could be limited by time for user and check by radius (limit by it as well)
        // maybe add something to the table, so it can be grouped by radius...
       return newParkingRequestRepository.save(newParkingRequest.toApiEntity(user.get()))
    }
}