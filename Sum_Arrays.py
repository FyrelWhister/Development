#Write a function that takes an array of numbers and returns the sum of the numbers. 
#The numbers can be negative or non-integer. 
# If the array does not contain any numbers then you should return 0.

def sum_array(a):
    sum = 0
    for i in a:
        sum+=i
    return sum
lis = []
for i in range(int(input("How many items do you want?"))):
    lis.append(int(input("Please enter item:")))