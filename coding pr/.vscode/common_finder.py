def common_finder(l1,l2):
    output=[]
    for i in l1:
        if i in l2:
            output.append(i)
    return output
print(common_finder([1,4,6,8,9],[1,4,3,8,9]))            