# Software Developer Challenge

Technologies utilisées:
```diff
+ Java + FrameWork SPRING

J'ai décidé d'utiliser java car c'est un langage que je connais et mes recherches sur les API REST
m'ont fait découvrir SPRING, j'ai donc appris à me servir de ce FrameWork
```
Pour lancer l'application web :
```diff
+ Java -jar webapp-0.0.1-SNAPSHOT.jar
```
Pour y accéder : 
```diff
+ http://localhost:9000 

http://localhost:9000/helloworld 
```
Pour se connecter après l'inscription :
```diff
+ Mail + mdp
```

La base de donnée est stockée sur un fichier, l'utilisateur peut se connecter même après le redémarrage de l'application.   
Les mots de passe sont chiffrés avec une fonctionnalité de SPRING SECURITY.   
Normalement l'utilisateur aurait du confirmer son inscription via un lien reçu sur son mail, mais l'option est désactivée.   

```diff
- API :
  - Cat Facts API ==> Obtenir des phrases aléatoires
  - Open Weather ==> Obtenir des informations météo sur la ville sélectionnée
  - GeoDB ==> permet l'auto-complétion et Feeling Lucky

!/!\ FORGET PASSWORD NE FONCTIONNE PAS  
!/!\ FEELING LUCKY PEUT ENTRAINER UNE ERREUR SI LA VILLE N'EXISTE PAS SUR OPEN WEATHER
```
```diff
! TO-DO

@@ Gérer les erreurs quand une ville de geoDB ne fonctionne pas sur openWeather @@

@@ Permettre le reset du mdp via un e-mail @@

@@ Intégrer un historique / villes favorites pour les utilisateur CRUD @@
```
