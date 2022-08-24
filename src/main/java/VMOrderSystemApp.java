package VMReservationSystem;


class VM {
	private String VMID = null;
	private boolean booked = false;

	VM(String VMIP) {
		this.VMIP = VMIP;
	}

	String getVMIP() {
		return VMIP;
	}

	void cancel() {
		booked = false;
	}

	boolean isBooked() {
		return booked;
	}

	public void setBooked(boolean booked) {
		this.booked = booked;
	}

}


public class VMOrderSystemApp 
{
	/**
	 * @author arpit    @date - 24 Aug 2022
	 * checkoutVM method Gets the VM from pool which is free and ready for use
	 * If no VMs availabe, it gives a message = No VM available. Please Try after 10 mins
	 * It Updates in DB  BookedByUser = userName against the machine which is getting assigned
    	It Updates in DB  isBooked = Y against the machine which is getting assigned
    	It Updates in DB DateTimeStamp=currentdatetimestamp against the machine which is getting assigned
	 * @params
	 * userName =  User who is requesting the VM
	 **/
    public String checkoutVM(String userName) {
    	List<String> vm = new Arraylist<String>();
    	vm=getVMstatefromDB(isBooked=No);
    	
    	// check if VM is already checkout or not - same VM cannot be checked out by two clients at the same time.
    	if(vm.size()==0) {
    	System.out.println("No VM available. Please Try after 10 mins");
    	return "Sorry, No VM available. Please Try after 10 mins";
    	}
    	else {
    	String ip = vm[0].getVMIP();
    	//Update in DB  BookedByUser = userName where VMIP = ip;
    	//Update in DB  isBooked = Y where VMIP = ip;
    	//Update DateTimeStamp=currentdatetimestamp where VMIP = ip
    	System.out.println("VM successfully checkedOUT: " + ip);
    	return vm[0].getVMIP();
    	}
    }
   
    /**
	 * @author arpit    @date - 23 Aug 2022
	 * checkinVM method Returns the VM to pool
	 * It Updates in DB  BookedByUser = userName against the machine which is getting released
    	It Updates in DB  isBooked = N against the machine which is getting released
    	It Updates in DB DateTimeStamp=currentdatetimestamp against the machine which is getting released
	 * 
	 * @params
	 * userName =  User who is releasing the VM
	 * VMIP = IP of the machine which is gettting released
	 **/
    public String checkinVM(String userName, String VMIP) {
    	//Return the VM to pool
    	
    	doCleanUpandReleaseToPool();
    	//Update in DB  BookedByUser = "" where VMIP = ip;
    	//Update in DB  isBooked = N where VMIP = ip;
    	//Update DateTimeStamp=currentdatetimestamp where VMIP = ip
    	System.out.println("VM successfully checkedIN: " + ip);
    	return VMmachineIP;
    	
    }
    
    
    
    
}
