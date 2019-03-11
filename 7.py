import collections


N=int(input())


b=input().split()

l=[]

for i in range(0,N):

    if(i%2==0 and int(b[i])%2!=0):

            l.append(b[i])

    elif(i%2!=0 and int(b[i])%2==0):

            l.append(b[i])

print(*l)        
        


