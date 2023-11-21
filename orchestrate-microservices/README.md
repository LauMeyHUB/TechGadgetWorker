# Microservices Used By TechGadgetInc.

This project contains a worker that is used in the Supply Chain Management Process of TechGadgetInc.

Java 17.0 is used for this project but be sure to meet the following criteria :

Requirements:

* Java >= 8.0
* Maven installed

How to run:

* Download or clone the code in this folder.
* Run the application:


Now you need deploy the Supply Chain Management BPMN process that contains the service tasks of type `orderProcess_worker` and `arrangeShipment_worker`.

Once the Services are running, you can start the deployed process and the service tasks will be completed automatically based on the code in the `Worker.java` class. 