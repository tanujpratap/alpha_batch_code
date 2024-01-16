import random
winningnumber=random.randint(1,100)
guessingnumber=1
number=int(input("enter the number"))
gameover=False
while not gameover:
    if winningnumber==number:
        print(f"you win, you guess this number in {guessingnumber}times")
        gameover=True

    else:
        if number<winningnumber:
            print("too low")  
        else:
            print("too high")

            
            guessingnumber+=1
            number=int(input("enter the number"))    



