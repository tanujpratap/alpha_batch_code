'''wap to enter the string and count  the frequency of every character'''

'''a=input("enter the string")
for i in set(a):
    k=a.count(i)
    print(i,"is occuring",k,"times")'''


s=input("enter the string").split(",")
z=set(s)
for i in z:
    k=s.count(i)
    print(i,"is occuring",k,"times")

    
