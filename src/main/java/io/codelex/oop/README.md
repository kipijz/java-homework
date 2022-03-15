# Practice

### NB: Create each exercise in separate package

## Exercise #1

Package: shapes
1) Write an abstract class Shape 
   * Data members: numSides (number of sides)
   * Constructor: initialize numSides
   * Concrete method: get method for numSides
   * Abstract methods: getArea(), getPerimeter()
2) Write a concrete subclass Rectangle
   * Data members: width, height
3) Write a concrete subclass Triangle
   * Data members: width, height
4) In another class, write a main method to define a Rectangle and a Triangle and test their functionality

## Exercise #2

Package: persons
1) Write an abstract class Person
    * Data members: firstName, lastName, id (String), age
   * Constructor: initialize all data variables
   * Concrete methods: getFirstName, getLastName, getId, getAge
   * Abstract methods: getInfo that returns String
2) Write a concrete subclass Employee
   * Data members: position (String, for ex. "Accountant"), startedWorking (date)
   * Constructor: initialize all data variables
   * Methods: getWorkExperience - returns int with how many full years employee has been working in company
   * getInfo should return firstName + lastName + position + howLongHasBeenWorking in company, for example "Accountant John Brown (7 years)"
3) Write a concrete subclass Customer
   * Data members: customerId (String), purchaseCount
   * Constructor: initialize all data variables
   * Methods: getPurchaseCount, setPurchaseCount
   * getInfo should return firstName + lastName + customerId + purchase count, for example "Peter Brown CID1234 (10 purchases)"
4) Write separate class where to test functionality

