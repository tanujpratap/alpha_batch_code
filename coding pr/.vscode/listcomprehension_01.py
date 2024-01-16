'''square=[]
for i in range(1,11):
    square.append(i**2)
print(square)'''

'''new_square=[i**2 for i in range(1,11)]
print(new_square)

negative=[]
for i in range(1,11):
    negative.append(-i)
print(negative)

new_negative=[-i for i in range(1,11)]
print(new_negative)'''


'''list=['tanuj','pratap','solanki','thakur']
new_list=[]
for name in list:
    new_list.append(name[0])
print(new_list)


new_list=[name[0] for name in list]
print(new_list)'''

numbers=list(range(1,11))
#print(numbers)
num=[]
for i in numbers:
    if i%2==0:
        num.append(i)
print(num)    

new_num=[i for i in numbers if i%2==0]
print(new_num)
new_num=[i for i in range(1,11) if i%2==0]
print(new_num)
new_num=[i for i in range(1,11) if i%2!=0]
print(new_num)


