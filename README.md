# FactorialFinesse
Just a fun mental game to optimize finding solutions to m-n/2=o! problems which also solve (m-n)/2=o

Optimized by observing that the upper number approaches 2*n! of the factorial quickly as n approaches infinity, but never exceeds it.
Both numbers are also always even, so no need to use floating point imprecision.
The process goes as follows, starting at n=4
Set u=2*n!-2*n as our upper value and l=u/2 - n as our lower value and then check if u - l = n!
This will work for all values of n in n! for n>=4.

Changing to using Java BigIntegers would require putting a hard stop somewhere if you don't want it to stop automatically on memory failure or errors with exceeding doubles. Currently it stops at n=20 when it exceeds the size of a long.

CC BY 4.0
Creative Commons Attribution 4.0 International
This license requires that reusers give credit to the creator. It allows reusers to distribute, remix, adapt, and build upon the material in any medium or format, even for commercial purposes.
