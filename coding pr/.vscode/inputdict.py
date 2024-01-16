user={}
name=input("enter your name:")
age=int(input("what is your age:"))
movies=input("enter the movies comma seprated").split(",")
tunes=input("enter the tunes comma seprated").split(",")
user["name"]=name
user["age"]=age
user["movies"]=movies
user["tunes"]=tunes
print(user)

