from cProfile import label
from email.mime import image
from tkinter import *
from PIL import Image,ImageTk

xmen=Tk()
xmen=label(text="hello everyone")
xmen.pack()

image=Image.open("download.jpg")
resize_image = image.resize((200,200))
 
img = ImageTk.PhotoImage(resize_image)
 
# create label and add resize image
label1 = Label(image=img)
label1.image = img
label1.pack()

xmen.mainloop()