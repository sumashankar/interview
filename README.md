# Welcome to Location repo

### Spring boot project to test candidates in Spring Data JPA, Spring REST,and TDD approach for writing code

## Requirements

The project requires [Java 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or
higher.


Location repo project should be able to store , retrieve location data


`Tasks` - which we might explore in interview
``` 
    a. Test Driven Development
    b. Clean code which covers edge cases
```
 

* Scenarios

* Write code to POST location data and save it to h2 db
  Endpoint  ```text POST /api/locations ```
  Example of body
      
  ```json
   {
      "uprn" : 1234,
      "authcode" : 11,
      "building_description": "GeoPlace LLP"
   }  
   ```
   Parameters
   
| Parameter                 | Description                               |
|---------------------------|-------------------------------------------|
| `uprn`                    | Unique Property Reference No              |
| `authcode`                | Authority code - Unique code for councils |
| `building_description`    | Description about location                |



  * Write code to GET location data
    Endpoint  ```text GET /api/locations/{uprn} ```
    
   Parameters
   
| Parameter | Description                              |
|-----------| ---------------------------------------- |
| `uprn`    | Unique Property Reference No  |

   ```console
   $ curl "http://localhost:8080/api/locations/1234"
   ```

   ```json
      {
         "uprn" : 1234,
         "authcode" : 11,
         "building_description": "GeoPlace LLP"
      }
   ```