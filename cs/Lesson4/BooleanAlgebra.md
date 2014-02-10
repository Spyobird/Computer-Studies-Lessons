Boolean Algebra Notes
===

<b>Boolean</b>

Boolean refers to a system with only true and false values.
  
TRUE | FALSE  
ON   | OFF  
1    | 0

<b>Binary System (2s Number System)</b>

The Binary system consists of 2 numbers, 1 and 0. Decimal numbers can be represented by Binary numbers. In order for us to write numbers in the Binary system, we would have to convert it from the 10s or Decimal system. To convert Decimal numbers to Binary numbers, repetitive division of 2 is used. The remainder is also taken into account.

For example:  
(521)<sub>10</sub> => (?)<sub>2</sub>

Solution:  
521 / 2 = 260R1  
260 / 2 = 130R0  
130 / 2 = 65R0  
65 / 2 = 32R1  
32 / 2 = 16R0  
16 / 2 = 8R0  
8 / 2 = 4R0  
4 / 2 = 2R0  
2 / 2 = 1R0

Once the number has been divided till the answer is 1, the number equivalent in Binary would be 1, with the remainders taken into accout concatenated behind it. In this case, the number becomes 1000001001 in the Binary system.

Thus,  
(521)<sub>10</sub> => (1000001001)<sub>2</sub>

Binary numbers can be converted back to Decimal ones for us to easily understand it. It is achieved by adding increasing powers of 2 which make up the Binary number.

For example:  
Although we know (1000001001)<sub>2</sub> => (521)<sub>10</sub>,  
let's pretend we don't and take it slow.

(1000001001)<sub>2</sub> => (?)<sub>10</sub>  
Each digit of the Binary number can be represented by the digit multiplied by a power of 2.

Solution:  
1 * 2<sup>9</sup>  
0 * 2<sup>8</sup>  
0 * 2<sup>7</sup>  
0 * 2<sup>6</sup>  
0 * 2<sup>5</sup>  
0 * 2<sup>4</sup>  
1 * 2<sup>3</sup>  
0 * 2<sup>2</sup>  
0 * 2<sup>1</sup>  
1 * 2<sup>0</sup>

(1000001001)<sub>2</sub> = (2<sup>9</sup><sub>10</sub> + (2<sup>3</sup>)<sub>10</sub> + (2<sup>0</sup>)<sub>10</sub>   
= (512)<sub>10</sub> + (8)<sub>10</sub> + (1)<sub>10</sub> = (521)<sub>10</sub>

Thus, (1000001001)<sub>2</sub> => (521)<sub>10</sub>

<b>Hexadecimal System (16s Number System)</b>

The Hexadecimal system is a simpler representation of the Binary system used in computing. It consists of 16 numbers, which can represent 4 bits in the Binary system. The system consist of numbers 0 to 9, and letters A to F (Representing 10 to 15 in the Decimal system). It is easier to write Hexadecimal numbers than Binary ones, and it is simpler to convert Hexadecimal numbers to Binary ones than from Decimal numbers. Hexadecimal comes from the root words Hexa (6) and Decimal (10).
