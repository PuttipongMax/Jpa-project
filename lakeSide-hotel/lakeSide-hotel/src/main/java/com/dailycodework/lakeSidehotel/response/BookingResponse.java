package com.dailycodework.lakeSidehotel.response;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {
 // @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 // @Column(name = "check_In")
 private LocalDate checkInDate;

 // @Column(name = "check_Out")
 private LocalDate checkOutDate;

 // @Column(name = "Guest_FullName")
 private String guestName;

 // @Column(name = "Guest_Email")
 private String guestEmail;

 // @Column(name = "adults")
 private int NumOfAdults;

 // @Column(name = "children")
 private int NumOfChildren;

 // @Column(name = "total_guest")
 private int totalNumOfGuest;

 // @Column(name = "confirmation_code")
 private String bookingConfirmationCode;

 // @ManyToOne(fetch = FetchType.LAZY)

 // @JoinColumn(name = "room_id")
 private RoomResponse room;

 public BookingResponse(Long id, LocalDate checkInDate, 
  LocalDate checkOutDate, String bookingConfirmationCode){
   this.id = id;
   this.checkInDate = checkInDate;
   this.checkOutDate = checkOutDate;
   this.bookingConfirmationCode = bookingConfirmationCode;
  }
}
