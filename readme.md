# Transaction Object encryption application
This is an sample application that receives an sample HTTP Post request and encrypts it. Once encryption is done the encrypted transaction object is sent to receiver url which then decrypts it and adds it to db


## Heroku Deployment link:
https://sender-microservice-app.herokuapp.com/transactions/sender

## Basic Features
* Receive an transction object as post request.
* Encrypts the transaction object using sha-1 algorithm
* Sends the encrypted transaction object as a post request to receiver url 
* Exception handling for bad requests.

## To get the response from deployment:
*  Open post man or any other platform
*  In url add the deployment link(https://sender-microservice-app.herokuapp.com/transactions/sender) and add as a post request
*  Send any transaction object in request body 
    Ex: {
     "accountNumber": "12345687",
	 "type": "credit",
	 "amount": "1222",
	 "currency": "INR",
	 "accountFrom": "1234343"
    }


## Running the application on local
* You should have java 11 or jdk 1.8 installed on your machine along with spring tool suite or similar ide prior to cloning the repository.
* Clone the git repo in your local machine.
* Import the project from file system in your ide.
* Let the project build.
* After the build is completed right click on project and select run as spring boot application.
* **Follow the above steps for both the microservices(receiver and sender)**

## Proof of concept
Visit the given link to see the images: https://narula98.imgur.com/all/?third_party=1
