package com.dailycodework.lakeSidehotel.response;

import java.math.BigDecimal;
import java.util.Base64;
import java.util.List;

// import org.hibernate.mapping.List;

public class RoomResponse {
 private Long id;
 private String roomType;
 private BigDecimal roomPrice;
 private boolean isBooked;
 private String photo;
 private List<BookingResponse>bookings;

 public RoomResponse(Long id, String roomType, BigDecimal roomPrice){
  this.id = id;
  this.roomType = roomType;
  this.roomPrice = roomPrice;
 }

 public RoomResponse(Long id, String roomType, BigDecimal roomPrice, 
  boolean isBooked, byte[] photoBytes, List<BookingResponse> bookings){
   this.id = id;
   this.roomType = roomType;
   this.roomPrice = roomPrice;
   this.isBooked = isBooked;
   this.photo = photoBytes != null ? org.apache.tomcat.util.codec.binary.Base64.encodeBase64String(photoBytes) : null;
   this.bookings = bookings;
 }

}
