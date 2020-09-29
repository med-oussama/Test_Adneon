# Test_Adneon

Cet projet contient la fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.

Exemples d'entrées et sorties :
                                            
partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]  


Pour lancer les tests unitaire tester afin de vérifier les résultat :

Cloner le projet sur votre local :

`git clone  https://github.com/med-oussama/Test_Adneon.git`

ensuite : 

`cd Test_Adneon`

par la suite avec maven :

  ` mvn clean ` 
  
  puis :
  
  ` mvn  test ` 
  
  
  **NB** : J'ai implémenté deux solution partition 1  et partition 2 et j'ai implémenté les test unitaire pour les deux fonction