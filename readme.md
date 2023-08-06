### Project 2 - Car Pooling System


Car Pooling System is an application that helps managing cars scheduling and bookings. The system consists of Cars, Routes and Passengers.  

- Car Class has: a code, a fixed route, a maximum capacity of passengers per trip.

- Route Class has: start pick up address, destination address, and trip price.

- Passenger (parent class) has: name, ID, reserved Car object, trip cost. Also, it has an abstract function that takes a car object to reserve it to the passenger and compute the trip cost and a function that should be overridden to display their information along with the car code and route price.


There are two types of Passengers (subclasses):

- Subscribers passengers: take 50% discount on trip cost when they reserve a car.

- Non-Subscribers passengers: have boolean value named discount coupon and gets a 10% discount on the trip cost if they have it.

The function that reserves a car and calculates the trip cost uses the following equation:

Trip cost = car_object.route_object.price - (car_object.route_object.price 0.1) --> in case the Non-Subscribers passengers has a discount coupon.

Trip cost = car_object.route_object.price --> in case the Non-Subscribers passengers doesn't have a discount coupon.

**Note that: The function used to reserve a car to a passenger should throw an exception if the maximum capacity of the car was equal to zero In.**




---


#### Outputs:

```bash

# Non-Passenger who applied coupon
<-- Passenger Details -->
Passenger Name: Salem
Passenger ID: 22222
<-- Car Details -->
Reserved Car Code: BMW-M892131
Car Current capacity: 3
<-- Pickup Details -->
Street Name: Malaz Dist.
City: Riyadh
Country: Saudi Arabia
zip code: 0000000
<-- Destination Details -->
Street Name: Olaya, North.
City: Riyadh
Country: Saudi Arabia
zip code: 0000000
<-- Trip Cost -->
   Passenger Type: Non Subscriber
   Trip Original Price: 56.0 SAR
   After 10% discount Used Coupon (JAVA). Final Price: 50.4 SAR


# Non-Passenger who don't have coupon
<-- Passenger Details -->
Passenger Name: Mohammed
Passenger ID: 11234455
<-- Car Details -->
Reserved Car Code: BMW-M892131
Car Current capacity: 3
<-- Pickup Details -->
Street Name: Malaz Dist.
City: Riyadh
Country: Saudi Arabia
zip code: 0000000
<-- Destination Details -->
Street Name: Olaya, North.
City: Riyadh
Country: Saudi Arabia
zip code: 0000000
<-- Trip Cost -->
   Passenger Type: Non Subscriber
   Trip Original Price: 56.0 SAR
   No Coupon Was Applied. Final Price: 56.0 SAR


# Subscriber Passenger 
<-- Passenger Details -->
Passenger Name: Abdullah
Passenger ID: 1231312
<-- Car Details -->
Reserved Car Code: Audi-R82131831
Car Current capacity: 4
<-- Pickup Details -->
Street Name:  Tahliah Street.
City: Riyadh
Country: Saudi Arabia
zip code: 0000000
<-- Destination Details -->
Street Name: Olaya, North.
City: Riyadh
Country: Saudi Arabia
zip code: 0000000
<-- Trip Cost -->
   Passenger Type: Subscriber (50% discount)
   Trip Original Price: 40.0 SAR
   After 50% discount. Final Price: 20.0 SAR

```
