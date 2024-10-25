Cette application est un système de gestion d'utilisateurs de base, construit avec Spring Core, Spring MVC et Spring Data JPA. Elle permet aux utilisateurs d'effectuer des opérations CRUD telles que la création, la visualisation, la mise à jour et la suppression d'utilisateurs via une interface web.

## Structure du Projet

**src/main/java : Contient votre code Java.**

- org.youcode.controller : Contient les classes de contrôleurs pour gérer les requêtes entrantes et les diriger vers les services ou vues appropriés.

- org.youcode.domain : Contient probablement vos modèles de domaine, tels que Membre.

- org.youcode.repository : Ici réside votre logique d'accès aux données, probablement des dépôts Spring Data.

- org.youcode.service : Contient les classes de la couche service pour la logique métier, servant d'intermédiaire entre le dépôt et le contrôleur.

**src/main/resources :**

- applicationContext.xml : Fichier de configuration central pour Spring, définissant probablement les beans, les configurations de la base de données et les couches de service.

**src/main/webapp :**

- WEB-INF/views : Contient les fichiers JSP. Dans ce cas, listMembers.jsp est la vue pour afficher la liste des membres.

- dispatcher-servlet.xml : Configure le DispatcherServlet de Spring MVC, gérant les requêtes web et les dirigeant vers les contrôleurs et vues appropriés.

- web.xml : Configure le mapping des servlets, pointant vers votre DispatcherServlet.

**pom.xml :** Fichier de build Maven gérant les dépendances et la configuration du projet.

## Injection de dépendances (DI)
L'injection de dépendances (DI) est un modèle de conception utilisé pour implémenter l'IoC, permettant la création d'objets dépendants en dehors d'une classe et fournissant ces objets à une classe de différentes manières.

## Inversion de contrôle (IoC)
un principe où la responsabilité de gérer les dépendances est inversée, ce qui signifie que la classe ne contrôle plus comment et quand ses dépendances sont fournies

## Bean
Bean est un objet géré par le conteneur Spring IoC (Inversion of Control). Ces objets sont créés, configurés et maintenus par le framework Spring.

## Bean scope
Bean scope dans Spring définit le cycle de vie et le nombre d’instances qu’un bean aura dans le conteneur Spring. Il contrôle le nombre d’instances d’un haricot qui sont créées et combien de temps elles seront disponibles.

## ApplicationContext
ApplicationContext est l’interface centrale pour accéder au conteneur Spring Dependency Injection (DI).

## Technologies Utilisées
**Spring Core :** Injection de dépendances
**Spring Data :** Configuration de la source de données et gestion des données
**Spring MVC :** Couche de présentation
**PostgreSQL :** Base de données
**Apache Tomcat :** Serveur web

## Configuration du Projet
**Java JDK 17**
**Serveur Apache Tomcat**
**Base de données PostgreSQL**
**Maven**
