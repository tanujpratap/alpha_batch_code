def toh(source,auxilary,destination,n):
    if n>=1:
        toh(source,destination,auxilary,n)
        print("move desk from",source,"to destination")
        toh(auxilary,source,destination,n)
n=int(input("enter the number of desks"))
toh('a','b','c',n)        