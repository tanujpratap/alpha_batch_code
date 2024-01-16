name=input("please enter your name")
temp=""
i=0
while i<len(name):
    if name[i] not in temp:
        temp+=name[i]
        
        print(f"{name[i]}:{name.count(name[i])}")
        

    
    i=i+1