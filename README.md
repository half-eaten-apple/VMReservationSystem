# VMReservationSystem
Assume You are the administrator of a cloud which hosts some finite number of Virtual Machines. Users of your cloud can borrow or check-out VMs for use. Once they are done using it, they can check-in the VM back. Once a VM is checked in, as an administrator, you should perform some cleanup on the VM and then return it back to the pool of VMs.


We can use H2 database which is Very fast, open source, JDBC API & supports Embedded and server modes; in-memory databases.
This can persist the VM's current state in case our system goes down.

We can maintain the DB like below-

VMIP		      isBooked	BookedByUser	Date&TimeStamp
192.168.0.1		Y		      johndoe			  22Aug2022_09:00AMIST
192.168.0.2		N		      NA			
192.168.0.3		Y		      jandoe1			  23Aug2022_09:00AMGMT
192.168.0.4		Y		      jandoe2			  23Aug2022_09:00AMGMT
192.168.0.5		Y		      jandoe3			  23Aug2022_09:00AMGMT
192.168.0.6		Y		      jandoe4			  23Aug2022_09:00AMGMT
192.168.0.7		Y		      jandoe5			  23Aug2022_09:00AMGMT
192.168.0.8		Y		      jandoe6			  23Aug2022_09:00AMGMT
192.168.0.9		Y		      jandoe7			  23Aug2022_09:00AMGMT
192.168.0.10	Y		      jandoe8			  23Aug2022_09:00AMGMT
192.168.0.11	Y		      jandoe9			  23Aug2022_09:00AMGMT
192.168.0.12	Y		      jandoe10		  23Aug2022_09:00AMGMT
192.168.0.13	Y	      	jandoe11		  23Aug2022_09:00AMGMT
192.168.0.14	Y	      	jandoe12		  23Aug2022_09:00AMGMT
192.168.0.15	Y		      jandoe13		  23Aug2022_09:00AMGMT
192.168.0.16	Y		      jandoe14		  23Aug2022_09:00AMGMT
