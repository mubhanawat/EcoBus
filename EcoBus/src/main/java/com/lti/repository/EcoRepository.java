package com.lti.repository;

import java.time.LocalDate;
import java.util.List;

import com.lti.model.Bus;
import com.lti.model.Customer;
import com.lti.model.Driver;
import com.lti.model.OperationalDays;
import com.lti.model.Passenger;
import com.lti.model.Routes;
import com.lti.model.Seats;
import com.lti.model.Ticket;
import com.lti.model.Transaction;
import com.sun.javafx.animation.TickCalculation;

public interface EcoRepository {
	//Home Functionalities
	List<Bus> searchABus(String fromCity,String toCity,String day);//Done
	int registerUser(Customer customer);//Done
	boolean loginUser(String email,String password);//Done
	public Customer findByEmailPassword(String email,String password);//returning object of customer
	boolean cancelTicket(int ticketId,String email);
	Ticket searchTicket(int ticketId,String email);
	//for rescheduling the bus, write one more function in service class
	boolean checkAvailibilityofBus(String day,int busid);
	boolean checkSeatsavailability(LocalDate date,int busid);
	//Forgot Password Functionalities
	boolean isValidEmail(String email);
	boolean changePassword(String email,String password);
	int getRegisteredCustomerId(String email);
	boolean checkRegisteredUser(String email);
	//DashBoard Functionalities
	boolean updatePassword(String email,String password);//--Read about session handling
	List<Ticket> viewAllBookings(String email);
	Customer showProfile(String email);
    double showWalletBalance(String email);
    boolean updateProfile(Customer customer);
    //For ticket details
    List<Seats> getBookedSeats(int busId);
    
    //Admin Functionalities 
    double getPreviousProfits(LocalDate fromDate,LocalDate toDate);
    List<Routes> frequentlyTravelledRoutes();
    boolean deleteBus(int busId);//Today done
    String mostPrefferedTypesOfBuses();
    boolean addABus(Bus bus);//Done
    boolean deleteDriver();//Today done
    public Bus findBus(int busid);
    boolean addBuswithDriver(Bus bus,Driver driver);//Done
    //Reservation details of customer(Daily,Weekly&monthly)
    boolean addRoutewithBus(List<Routes> routes,int busId);//Done
    boolean addOperationalDaysWithBus(List<OperationalDays> operationalDays,int busId);//Done
    
    
    boolean addTicketAndPassengerWithRegisteredCustomers(Ticket ticket,List<Passenger> passenger,List<Seats> seats,Transaction transaction);//depends on the session
   // boolean addTicketAndPassengerWithUnregisteredCusomer(Ticket ticket,Passenger passenger, Customer customer);
    
    
	

}