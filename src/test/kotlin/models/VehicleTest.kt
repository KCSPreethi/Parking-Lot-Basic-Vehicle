package models

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import services.ParkingService

class VehicleTest{

//
    @Test
    fun `generate ticket and slot number when vehicle comes to park`() {
        //Arrange
        val slot=SlotsSchedules(100)
        val vehicle: Vehicle = Vehicle(1002)

        //Act
        val slotNumber = ParkingService().assignSlotToVehicle(slot)
        val ticket: Ticket = vehicle.park(slotNumber)
        //Assert
        assertEquals(ticket.getTicketNumber(),0)
        assertEquals(ticket.getSlotNumber(),1)

    }
//
//    @Test
//    fun `generate receipt when unParking vehicle`() {
//        //Arrange
//        val slot=SlotsSchedules(100)
//        val vehicle: Vehicle = Vehicle(slot)
//        //Act
//        val ticket: Ticket = vehicle.parkVehicle()
//        val receipt: Receipt = vehicle.unParkVehicle(ticket)
//
//        //Assert
//        assertEquals(receipt.getReceiptNumber(),0)
//        assertEquals(receipt.getParkingFee(),0)
//
//    }


}