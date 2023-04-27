a=int(input('Enter the no. which you want to check whether it is a prime no. or not'));
if(a== 1):
    print('The given number is not prime number')
    

else:
    if(a>1):
        n=0
        for i in range(2,a):
            if(a % i)==0:
                n+=1
                break
    if(n>0):
        print("the given no. is not prime no.")
    else:
        print("the given no. is prime no.")
