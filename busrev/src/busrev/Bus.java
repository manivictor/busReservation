package busrev;

public class Bus {
     private int busNo;
     private boolean ac;
     private int capacity;
      
     Bus(int no,boolean ac, int capacity){
    	  this.busNo=no;
    	  this.ac=ac;
    	  this.capacity=capacity;
    	  
      }
     public int getBusNo() {
 		return busNo;
     }
     public boolean isAc() {
    	 return ac;
     }
     public int getcapacity() {
 		return capacity;
 	}
    public void setAc(boolean val) {
    	ac=val;
    }
    public void setCapacity(int capacity) {
    	capacity=capacity;
 }
    public void displayBusInfo() {
    	System.out.println("BUs nO:" + busNo +"Ac:"+ac + "TOtAl cApAcItY:" + capacity);
    }
	
	}


