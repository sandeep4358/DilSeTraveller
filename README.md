1. Access the H2 Console
   Run your Spring Boot application and access the H2 console by navigating to the following URL in your web browser:
   bash
   Copy code
   http://localhost:8090/h2-console

2. Log In to the H2 Console
   When you open the H2 console, you'll see a login page. Use the following settings:
   JDBC URL: jdbc:h2:mem:testdb
   User Name: sa
   Password: password
   These values should match the settings in your application.properties.

### Testing the API

You can use tools like Postman or cURL to test your API endpoints.

- **GET** `/api/destinations` - Retrieve all destinations
- **POST** `/api/destinations` - Create a new destination
- **GET** `/api/travel-histories` - Retrieve all travel histories
- **POST** `/api/travel-histories` - Create a new travel history