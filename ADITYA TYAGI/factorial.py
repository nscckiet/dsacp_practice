a=int(input("enter the number for which you want to find the factorial"))

fact=1
for i in range(1,a+1):
    fact=fact*i

print("factorial of the number is {}".format(fact))
