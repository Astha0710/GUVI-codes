import collections


N=int(input())


b=raw_input().split()


l=[]


c=collections.Counter(b)


for key, value in c.iteritems():


    if value==1:


        print(key)
