rows=int(input("ernter the number ofr rows"))

for i in range(1,rows+1):
    for j in range(1,i+1):
        print("*",end=' ')
    print()

'''for i in range(1,5):
    for j in range(1,5):
        print(i)'''

rows=int(input("enterthe number of rows"))
k=1
for i in range(1,rows+1):
    for j in range(1,k+1):
        print("*",end=" ")
    k=k+2
    print()        