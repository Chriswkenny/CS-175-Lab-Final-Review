#Christopher Kenny
#CS175
#Q4: Write a program to get an item's original price with input() and calculate its sale price, with a 30% discount and display price after discount.

price = float(input("Enter the price of the item: "))
sale_price = price - (price*0.3)
print(f"The price of the item on sale is ${sale_price:.2f}")

