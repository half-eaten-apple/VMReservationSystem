# VMReservationSystem
Assume You are the administrator of a cloud which hosts some finite number of Virtual Machines. Users of your cloud can borrow or check-out VMs for use. Once they are done using it, they can check-in the VM back. Once a VM is checked in, as an administrator, you should perform some cleanup on the VM and then return it back to the pool of VMs.


We can use H2 database which is Very fast, open source, JDBC API & supports Embedded and server modes; in-memory databases.
This can persist the VM's current state in case our system goes down.

We can maintain the DB like below-

![image](https://user-images.githubusercontent.com/20729810/186504970-6c1a0b1a-6b88-441a-a5f8-806ff43b9264.png)

