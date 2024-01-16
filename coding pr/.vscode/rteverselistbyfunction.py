def reverse_list(l):
    r_list=[]
    for i in range(len(l)):
        poped_item=l.pop()
        r_list.append(poped_item)
    return r_list
number=[1,2,3,4,5,6,7,8]
print(reverse_list(number))



        
 