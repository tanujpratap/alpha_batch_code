def no_sublist_counter(l):
    count=0
    for i in l:
        if type(i)==list:
            count+=1
    return count
sublst=[[1,2,3],[3,4,6],[9,0,2]]
print(no_sublist_counter(sublst))            
        