## Spring Boot - Strategy Pattern: Freight Cost Calculation Example

This GitHub project serves as an instructional resource, illustrating the implementation of the Strategy design pattern
in conjunction with Spring Boot 3, specifically focusing on freight cost calculation. The Strategy pattern facilitates
the dynamic selection of algorithms, making it an ideal choice for scenarios like determining shipping costs with
various strategies (e.g., flat rate, weight-based).

Through clear code examples and documentation, developers gain insights into how to integrate and switch between
different freight cost calculation strategies seamlessly within the Spring Boot framework. By exploring this project,
developers can enhance their understanding of design patterns and Spring Boot development practices, while also gaining
practical experience in implementing the Strategy pattern in a real-world scenario.

### Key Features:

Concrete implementation of the Strategy pattern for freight cost calculation.
Clear code examples and comprehensive documentation.
Seamless integration with Spring Boot 3 for easy deployment and management.
Illustration of dynamic switching between freight cost calculation strategies.
Whether you're a novice seeking to understand design patterns or an experienced developer looking to expand your Spring
Boot skills, this project provides a concise and practical guide to leveraging the Strategy pattern effectively in
freight cost calculation scenarios. Explore the codebase, experiment with different strategies, and elevate your
proficiency in design patterns and Spring Boot development.

### Why adopt the Strategy pattern?

The Strategy pattern is effectively utilized to adhere to the Open/Closed principle, one of the key SOLID principles. By
enabling the addition of new freight implementations through concrete classes that implement a common freight interface,
the system becomes extendable without necessitating modifications to existing code. Furthermore, the integration of new
implementations can be streamlined by adding a new enumeration value referencing the concrete class, promoting expansion
over alteration. This approach underscores the modularity, maintainability, and testability benefits, aligning closely
with the goals of the SOLID principles.

#### Request example:

```bash
curl -X 'POST' \
'http://localhost:8080/freight/quote?organization=FEDEX&weight=10&distance=10' \
-H 'accept: */*' \
-d ''
```

Response:

```json
{
  "value": 132
}
```

