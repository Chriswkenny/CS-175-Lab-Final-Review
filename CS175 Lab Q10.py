#Q10: Write the lines of code to loop through numbers from 1 to 20 and skip if number is
#a multiple of 3. Display numbers

for i in range(1,21):
  if i % 3 == 0:
    continue
  print(i)
