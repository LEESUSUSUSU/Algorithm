import sys

def main():
    n = int(input())
    k = list(map(int, input().split())) 

    YoungSik = 0 
    MinSik = 0 

    for a in k:
        YoungSik += ((a//30)+1)*10
        MinSik += ((a//60)+1)*15

    if YoungSik>MinSik: 
        print("M", MinSik)
    elif YoungSik<MinSik:
        print("Y", YoungSik)
    else:
        print("Y M", YoungSik)


main()