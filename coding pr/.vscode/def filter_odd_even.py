def filter_odd_even(l):
    odd_num=[]
    even_num=[]
    for i in l:
        if i%2==0:
            odd_num.append(i)
        else:
            even_num.append(i)
    output=[odd_num,even_num] 
    return output
numbers=[1,2,3,4,5,6,7,87,9]
print( filter_odd_even(numbers))            
            
