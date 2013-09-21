math_app
========

-this is a work-in-progress application for my private study class "cryptography and number theory". 
-everything is done is java.
-i purposely made it OO to teach myself some things so it's much more complicated than it needs to be.

What's available now
====================
1. Divison algorithm
2. GCD compuation w/ congruence check

Division algorithm
------------------
  this essentially takes 2 integers and spits out a quotient and remainder. it calculates the REAL division and remainder of dividing 2 integers together (java can miscalculate quotient and remainder in some cases)
  
  
GCD computation w/ congruence check
-----------------------------------
  this takes 2 integers and checks to see what the greatest common denominator is. it finds GCD using the extended divison algorithm, which can be applied to find x and y in d=ax+by (or, finding integer solutions for x and y to satisfy the equation.)
  it also checks for congruency between a = b mod c.
