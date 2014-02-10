Boolean Algebra Notes
===

<b>Boolean</b>

Basically Boolean refers to true and false values.
  
TRUE | FALSE  
ON   | OFF  
1    | 0

<b>Binary System (2s Number System)</b>

The Binary system consists of 2 numbers, 1 and 0. Decimal numbers can be represented by Binary numbers. In order for us to write numbers in the Binary system, we would have to convert it from the 10s or Decimal system. To convert Decimal numbers to Binary numbers, repetitive division of 2 is used. The remainder is also taken into account.

For example:  
(521)<sub>10</sub> ---x (?)<sub>2</sub>

Solution:  
521/2 = 260R1  
260/2 = 130R0  
130/2 = 65R0  
65/2 = 32R1  
32/2 = 16R0  
16/2 = 8R0  
8/2 = 4R0  
4/2 = 2R0  
2/2 = 1R0

Once the number has been divided till the answer is 1, the number equivalent in Binary would be 1, with the remainders taken into accout concatenated behind it. In this case, the number becomes 1000001001 in the Binary system.

Thus,  
(521)<sub>10</sub> ---x (1000001001)<sub>2</sub>

Binary numbers can be converted back to Decimal ones for us to easily understand it. It is achieved by adding increasing powers of 2 which make up the Binary number.

For example:  
Although we know (1000001001)<sub>2</sub> ---x (521)<sub>10</sub>,  
let's pretend we don't and take it slow.

(1000001001)<sub>2</sub> --x (?)<sub>10</sub>  
Each digit of the Binary number can be represented by the digit multiplied by a power of 2.

Solution:  
1 0 0 0 0 1 0 0 1  
| | | | | | | | |  
2<sup>8</sup> 2<sup>7</sup> 2<sup>6</sup> 2<sup>5</sup> 2<sup>4</sup> 2<sup>3</sup> 2<sup>2</sup> 2<sup>1</sup> 2<sup>0</sup>
