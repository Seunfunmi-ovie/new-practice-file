product = input("Enter product name: ")
price = input("Enter amount: ")
price = int(price)
service = "Yes"
while(service == "Yes"):
    service = input("Do you want to continue: ")
    if(service == "Yes"):
        print("Continue")
    product = input("Enter product name: ")
    price = input("Enter amount: ")
    price = int(price)      
    else:
        print("Stop")    
          
    
