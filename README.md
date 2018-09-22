# The Virtual pets shelter is overrun.

## TO DO list:

•	Pets
	-	Cats			
	-	Dogs
		-	Robotic
		-	Organic
Cats and Dogs can be EITHER robotic OR organic.
Robotic pets need oiling, maintenance, and attention/walking. No feeding or water.

Organic dogs need feeding, walking, and watering. No oiling or maintenance. Cats do not need walking, but need attention and a clean litterbox. 

1.	Create a hashmap of pets? Or a class for different types? Yes. Two of each type—two organic cats, two robotic. Two 
organic dogs, two robotic. Might increase, dunno.

2.	Create overall health that is affected by feeding, watering, and walking/cleaning area.

3.	Create variable for litterbox for cats and cage for dogs.

4.	Create variable for hunger for cats and dogs.

5.	Create variable of repair for robotic pets.

6.	Create walk method for dogs.

7.	Create method to clean dog cages.

8.	Create method to clean cat litterbox.

## Notes

Feeding should raise litterbox status and a dog’s need to use the bathroom. If a dog is not taken outside before their bathroom need is over a certain amount, they will make a mess in their cage. If this happens, you must choose to clean dog cages to restore lost health.

Feeding/Watering will be interfaces.

Should the pet abstract include variables for each need? Is it possible to change the numerical value of said needs? I think we should follow the pattern of patient, save for the fact that there will be an extends. So just a string name for now for pets. There should be a method to return health. And to get the pets’ names.
