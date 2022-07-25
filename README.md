# Activite-2-Compte-Service

## 1. Créer un projet Spring Boot avec les dépendances Web, Spring Data JPA, H2, Lombok
![Capture d’écran (73)](https://user-images.githubusercontent.com/101125181/180741162-d8ceb351-37c9-40b3-8131-1e0cabadc64f.png)

## 2. Créer l'entité JPA Compte
### 2.1. Création de la classe Compte
![Capture d’écran (75)](https://user-images.githubusercontent.com/101125181/180742289-931e866e-274e-41f1-83a6-6f176df3a879.png)

### 2.2. Création de l'enum TypeCompte qui représente les types de comptes
![Capture d’écran (76)](https://user-images.githubusercontent.com/101125181/180742792-91998149-a563-4453-bcf1-c03c3cb0ae6a.png)

L'annotation @Enumerated spécifie que le champs est un enumerated.
Il prend en paramètre soit:
-EnumType.STRING : pour spécifier que dans la base de donnée celui ci vas etre stocké sous forme de string 
-EnumType.ORDINAL : pour spécifier que dans la base de donnée celui ci vas etre stocké sous forme de chiffre

## 3. Créer l'interface CompteRepository basée sur Spring Data
![Capture d’écran (81)](https://user-images.githubusercontent.com/101125181/180746552-3c9427be-8b0e-408d-aecc-943f6473c00e.png)

## 4. Tester la couche DAO
![Capture d’écran (82)](https://user-images.githubusercontent.com/101125181/180746672-1b8cf459-40b5-46f4-9766-9e05c35b67b1.png)

## 5. Créer le Web service Restfull qui permet de gérer des comptes
![Capture d’écran (83)](https://user-images.githubusercontent.com/101125181/180747789-b58148e3-1039-41c0-bf06-0544003c93e9.png)

![Capture d’écran (84)](https://user-images.githubusercontent.com/101125181/180747806-d4b4f6d1-ef0b-45b6-82f7-6524f8e85845.png)

![Capture d’écran (85)](https://user-images.githubusercontent.com/101125181/180749938-6c9ac6d5-1235-4237-8091-6780406cc93e.png)

## 6. Tester le web micro-service en utilisant un client REST comme Postman
![Capture d’écran (86)](https://user-images.githubusercontent.com/101125181/180759386-52650e9a-cf2a-4b06-a62e-0820469389af.png)

![Capture d’écran (87)](https://user-images.githubusercontent.com/101125181/180759429-e071c10d-70fc-4801-9b34-6bbdd06ba3df.png)

## 7. Générer et tester le documentation Swagger de des API Rest du Web service
Pour générer la documentation swagger sur Postman il faut importer à partir du lien 

![Capture d’écran (89)](https://user-images.githubusercontent.com/101125181/180759893-214fab98-646a-4746-be5e-951ac7c3ba40.png)

![Capture d’écran (91)](https://user-images.githubusercontent.com/101125181/180759963-d91bda30-7cff-4df9-bcf8-535944464ba7.png)


## 8. Exposer une API Restful en utilisant Spring Data Rest en exploitant des projections
## 9. Créer les DTOs et Mappers
  ![Capture d’écran (92)](https://user-images.githubusercontent.com/101125181/180761292-8b7baf1a-41d3-4191-bb03-f68beaef3449.png)

## 10. Créer la couche Service (métier) et du micro service
![Capture d’écran (83)](https://user-images.githubusercontent.com/101125181/180747789-b58148e3-1039-41c0-bf06-0544003c93e9.png)

![Capture d’écran (84)](https://user-images.githubusercontent.com/101125181/180747806-d4b4f6d1-ef0b-45b6-82f7-6524f8e85845.png)

![Capture d’écran (93)](https://user-images.githubusercontent.com/101125181/180761731-6bc2e28f-5068-4e78-9066-eecd0e597322.png)

![Capture d’écran (94)](https://user-images.githubusercontent.com/101125181/180761761-745274e2-2349-490a-96bc-7ed932d35d17.png)

![Capture d’écran (95)](https://user-images.githubusercontent.com/101125181/180761783-20215a10-0c9a-4298-aeb5-27ebc6a9302a.png)


