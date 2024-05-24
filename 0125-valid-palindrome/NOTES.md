Main reason to avoid concat or += string method is that inside the for loop it takes a longer runtime to construct a string and then check on that string. 

To avoid that we directly use the two pointer approach: Check at the left and right index whether it isDigit or not, otherwise change the pointer accordingly. Loop through until left < right and find the final answer. 
