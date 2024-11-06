/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

/**
 *
 * @author kal bugrara
 */
public class Seat {
    private int seatId;
    
    Boolean occupied; 
    int number;
    SeatAssignment seatassignment; //links back to studentprofile
    CourseOffer courseoffer;
    public Seat (CourseOffer co, int n){
        this.seatId = seatId;
        courseoffer = co;
        number = n;
        occupied = false;
        
    }

    Seat(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Boolean isOccupied(){
        return occupied;

    }
    public SeatAssignment newSeatAssignment(CourseLoad cl){
        
        seatassignment = new SeatAssignment(cl, this); //links seatassignment to seat
        occupied = true;   
        return seatassignment;
    }
    public CourseOffer getCourseOffer(){
        return courseoffer;
    }
    public int getCourseCredits(){
        return courseoffer.getCreditHours();
    }

    boolean isAssigned() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
