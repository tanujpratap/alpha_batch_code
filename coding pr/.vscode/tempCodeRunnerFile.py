#everse the string by using recursion
'''def rev(s):
    if len(s)==1:
        return s[0]
    else:
        return s[-1]+rev(s[:-1])
print(rev(input("enter the string:")))'''

#decimnal to vbinary conversion
def D2B(n):
    if n>0:
        return D2B(n//2)+str(n%2)
    return ''
print(D2B(int(input("eenter the number")))