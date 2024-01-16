#find greatest between three numbers
'''def greatest(a,b,c):
    if a>b and a>c:
        return a
    elif b>a and b>c:
        return b
    else:
        return c
num1=int(input("enter the first number"))
num2=int(input("enter the second number"))
num3=int(input("enter the third number"))
print(greatest(num1,num2,num3)
def greater(a,b):
    if a>b:
        return a
    else:
        return b
num1=int(input("enter the first number"))
num2=int(input("enter the second number")) 
print(greater(num1,num2))
def new_greatest(a,b,c):
    bigger=greater(a,b)
    return greater(bigger,c)
print(new_greatest(200,567,789 ))'''
'''def  palindrome(word):
    reversed_word=word[::-1]
    if word==reversed_word:
        return True
    else:
        return False
print(palindrome("naman"))'''
#fibonacci series
#from re import A


def fibonacci_seq(n):
    a=0
    b=1
if n==1:
    print(a)
elif n==2:
    print(a,b)
else:
    print(a,b, end=", ")
    for i in range(n-2):
        c=a+b
        a=b
        b=c
        print(b, end=",")
fibonacci_seq(89)        




         
                      


        

    
