import collections

N=int(input())

b=raw_input().split()

l=[]

if(max(b)=='0'):

    print('0')

else:
    for i in range(0,len(b)):


        s=max(b)

        l.append(s)

        b.remove(s)

print(''.join(str(x) for x in l))

