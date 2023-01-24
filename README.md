# Car-Dealership-System
A sytesm that was created to manage and maintain a secure system to any car dealership company

Problem: Create a Car Record Management system that can perform the following operations:
•	Insert record

•	Delete record

•	Show record

•	Search record

•	Check records Number

Task Details, By using the Car class, create a CarList class that manipulates a collection of Car objects utilizing JCF-LinkedList. As such the main data member of this class is an object reference of the JCF-LinkedList. The CarList class should have among the required operations to manipulate a list such as: addAtFirst(), addAtLast(), addAtCertainLocation(), removeAtFirst(), removeAtLast(), removeAtCertainLocation(), searchCar(), toString(), checkIsEmpty(), getSize(), etc.. Some of these methods necessitate the use of appropriate Car class methods. Then, create a class that just contains a main method (as a client/driver program). This program should prompt a user to enter relevant inputs to manipulate Car objects (refer to the Car class). In order to manipulate the list of Car objects, appropriate methods of the CarList class should be invoked. 



Approach: With the basic knowledge of operations on Linked Lists like insertion, deletion of elements in the Linked list, the record management system can be created. 

Below are the functionalities explained that are to be implemented:

Check Record: It is a utility function of creating a record it checks before insertion that the Record Already Exist or not. It uses the concept of checking for a Node with given Data in a linked list.

Create Record: It is as simple as creating a new node in the Empty Linked list or inserting a new node in a non-Empty linked list.

Search Record: Search a Record weather it exits in the list. Here in the index is the number as unique number is for every car.

Delete Record: Delete Record is similar to deleting a key from a linked list. User provides the index of the car he wants to delete, then it calls a function that returns an error if no such record with a given index is found otherwise it deletes the node with the given index.

Show Record: It shows the record is similar to printing all the elements of the Linked list.
Exception Handling

Although the implementation of exception handling is quite simple few things must be taken into consideration, and I made sure that most of the error that the user can have are handled.
 


Please use the client file as the main file because it has the main function*

UserName: SaifAlmajd

Password: Admin

