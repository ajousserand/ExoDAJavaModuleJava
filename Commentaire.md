Tout d'abord, il faudrait revoir la classe Executeur car la méthode main comporte trois erreurs:
	1)Il faut ajouter le mot-clé static.
	2)Le type de l'argument de la méthode main est un tableau de String et non un tableau de character
	3)Pour utliser la méthode lancer, il faut le faire sur l'objet game et non sur la classe Game car sinon ça implique que lancer est une méthode 	static.
	
Ensuite dans l'ensemble, il y a des soucis au niveau de la cohérence du projet:
	1)L'indentation à revoir.
	2)Ajouter tous les getters et setters pour les classes pour l'avenir du projet.
	3)Prendre une décision sur la langue du projet, anglais ou français par ça peut impliquer des fautes comme dans le switch de la méthode 	echiquier(). Les cases étaient en anglais alors qu'ils devaient être en français.
	4)Revoir les noms des méthodes et des classes pour une meilleure compréhension à la lecture.
	5)Revoir les syntaxes des boucles et conditions car selon les fichiers on a différentes syntaxes qui diminue la lisibilité du code. (exemple: des if sans accolades suivies de if avec des accolades en fin de lignes ou en début de lignes)
	6)Enlever les commentaires qui n'apportent rien au code notamment les commentaires auto généré par l'IDE.
	7)Suggestion de mettre la classe piece en abstract car on n'instancie aucune piece que les pieces de ses classes filles.
	
En plus de cela, j'ai finalisé la classe Reine qui n'avait pas été faites, le deplacement des pièces n'avaient pas été fait et le nom des joueurs.