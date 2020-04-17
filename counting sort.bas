CLS

DIM dizi(10) AS INTEGER
DIM maks AS INTEGER
DIM sondizi(10) AS INTEGER
say=10

dizi(0)=5
dizi(1)=4
dizi(2)=5
dizi(3)=9
dizi(4)=2
dizi(5)=1
dizi(6)=3
dizi(7)=10
dizi(8)=5
dizi(9)=7
dizi(10)=10
maks=dizi(0)
FOR N = 0 TO 10
  IF(dizi(N)>maks) THEN maks=dizi(N)
NEXT N
PRINT "en büyük değer" ,maks
PRINT
DIM tempdizi(maks+1) AS INTEGER
FOR N=0 TO 10
 tempdizi(dizi(N)) = tempdizi(dizi(N))+1
NEXT N

PRINT "sayma işlemi"
FOR N=0 TO 9
PRINT tempdizi(N)
NEXT N


PRINT "sayılan sayıları toplama işlemi"
PRINT
FOR N=1 TO 10
tempdizi(N)=tempdizi(N-1)+tempdizi(N)
NEXT N



FOR N=0 TO 10
PRINT tempdizi(N)
NEXT N



FOR N=0 TO 10
sondizi(tempdizi(dizi(N))-1)=dizi(N)
tempdizi(dizi(N)) =tempdizi(dizi(N))-1
NEXT N



PRINT  "Sıralanmış hali"
FOR N=0 TO 10
PRINT sondizi(N)
NEXT N

