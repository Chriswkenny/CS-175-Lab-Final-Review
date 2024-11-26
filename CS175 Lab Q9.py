#Q9: Write the lines of code to add the number to total until the user enters a zero. Display the total sum.

def total_calculator():
  total = 0
  number = int(input("Enter a number: (0 to stop): "))
  while number != 0:
    total = total + number
    number = int(input("Enter a number: (0 to stop): "))
  print(f"The total sum of the numbers you entered is: {total}")

total_calculator()
