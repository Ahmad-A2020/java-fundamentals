### Lab: 06 - Inheritance and Interfaces

in this lab, we create two classes (Library, and review) and create an association between them 
, where the review class is data type in the Library class for review variable. 
This variable holds the review instance parameters variables and methods including: 
-  body: the review massages. 
- Author : the name of the person added the review.
- starNum: the number of stars  evaluated by the client. 
- to string: to output the instance content appropriately. 
Beside this Library instance holds in: 
  - name variable: name of the restaurant.
  - starsNum: the number of the hotel.
  - priceCategory:  a price category (i.e. number of dollar signs).
  - addReview method: to add review  to the restaurant plus change the number of start evaluation for the restaurant. 
  
### Lab: 07 - Inheritance, day 2
in this lab, we created two more classes: 
- Shop: includes same methods that includes in Restaurant class .
- Theater: beside the methods exist in the previous classes, we added two methods : 
   - addMovie: to add movies to the shown movies array. 
  - removeMovie: to remove movies from the shown movies array. 
Another change made is the addReview methods, on which retailed to accept the name of the movie that you want to add the review to. for this reason another interface was created and implemented to the theater class (AddMoviesReview interface )
    
