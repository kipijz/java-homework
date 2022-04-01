# TEST

# BRANCH: java-advanced-test

## Exercise #1

#### (inheritance + abstract classes + exceptions)

#### Bank cards.
There exist two types of bank cards - debit cards and credit cards. In a nutshell in case of debit card 
you spend your own money but with credit cards you spend bank's money that you have to give back eventually.

Each card should have :
* its number 
* its owner (full name)
* CCV code (three digit number but it can start with 0, 045 for example)
* balance - how much money is left on the card

Both cards should have methods to add money and to take money and both cards should throw NotEnoughFundsException 
if its not possible to take out the amount you are requesting

Difference between cards:
* Credit card should print out "Warning: Low funds" every time when you take money from credit card and money left in the card is less than 100
* Debit card should print out "Warning: Too much money" every time when you add money and the money in the card is more than 10 000

Create three classes - abstract class Card and regular classes CreditCard, DebitCard that will extend the abstract class. 
Decide what should be in parent class and what should be in child classes.

## Exercise #2

#### (generics + exceptions + tests)

Create a Basket<T> class that imitates a basket and stores multiple T items (any kind of items) and the current number of items in the basket.

Add the addToBasket() method, which adds the element to the basket (increasing the current state by 1) and the removeFromBasket() method, which removes the element from the basket (reducing the current state by 1).

The basket can store from 0 to 10 items. When a user wants to remove an element at 0 items state or add an element at 10 items state, throw the appropriate runtime exception (BasketFullException or BasketEmptyException, exceptions created by yourself).

Create two empty classes Apple and Mushroom.

#### NB! Basket can store only one kind of items - only apples, only mushrooms etc, it cannot store both apples and mushrooms at the same time.

Create a test to test functionality and check that its possible to create basket with apples, basket with mushrooms and that exceptions are thrown.

## Exercise #3
#### (generics + tests)

Design the Joiner<T> class, which in the constructor will take a separator (string) and have a join() method that allows you to specify any number of T-type objects. This method will return a string joining all passed elements by calling their toString() method and separating them with a separator.

Write a test for the class.

e.g. for Integers and separator "-" it should return: 1-2-3-4 ...

## Exercise #4
#### (File I/O)
Write a program that will read any file and save it in the same folder. The content and title of the new file should be reversed (from the back).
(you can freely choose folder and file to test functionality)

## Exercise #5
#### (generics + functional programming)
Implement the generic partOf method, which will return % of items satisfying the condition based on any type of list and the function indicated as parameter.

Example of how it should work:
```java
List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
double percent = partOf(names, (String name) -> name.length() > 4);
System.out.println(percent); //Should print out 0.75 because 75% of names are longer than 4 letters

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 1);
System.out.println(evenPercent); //Should print out 0.5 because 50% of numbers are even
```