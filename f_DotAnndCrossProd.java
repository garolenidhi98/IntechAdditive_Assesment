// f)What is dot product and cross product? Explain use cases of where dot product is used and cross product is used in graphics environment. Add links to places where you studied this information and get back with the understanding. 

// Bonus - How do you calculate the intersection between a ray and a plane/sphere/triangle?

//Solution
// I declare that all the solutuions given are my own and are not taken from internet or any other source
/*
Dot Product
It is the product  of magnitude of certain quantities.
dot product of two vectors is the product of their magnitude and the deviation between them i.e cose angle between the two vectors

Significance of Cos in Dot product in graphics programming
Cosine value is between -1 to 1. If the Cosine of the angle is 1 i.e. Cos(angle) == 1.0, that means the Vector U and V are facing exactly the same direction and the angle between the two vectors is 0 degrees.
if Cos(angle) == -1.0, then vectors are facing in oppsite directions

Applications:
https://amirazmi.net/dot-products-in-games-and-their-use-cases/
in Gaming:
Eg. If the player is behind the enemy, the vector from the enemy to the player is facing in the direction of the player,
 and the forward vector on the enemy is facing in front of him.  Here we can take the dot product  and  if the dot product is negative,
 we don’t see the player

 Cross product:
 Cross product includes magnitude as well as the direction, it gives orthogonal vectors
 Cross product of two vectors is the product of their magnitudes and the sin angle between them
 For eg> In gaming in which user is rotating a steering on screen.
 Take two vectors: Vectopr at the strting point and vector at ending pint and do their cross products
 check the sign ,a perpendicular component of resulting vector, if it is negative it is clockwise and positive it is anti-clockwise.
 */
