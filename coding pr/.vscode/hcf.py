a=int(input("enter the number"))
b=int(input("enter the number"))
for i in range(min(a,b),0,-1):
    if a%i==0 and b%i==0:
        r=i
        break
print(i)   