def reverse_word(l):
    element=[]
    for i in l:
         element.append(i[::-1])
    return element
words=['tanuj','tushar']
print(reverse_word(words))         


       