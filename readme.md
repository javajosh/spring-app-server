# Philosophy

  1. No Warnings.
  2. No Surprises.

# Starting point

Spring Boot Initializr, picking gradle, java, and the dependencies recommended by the [Spring Accessing JPA Data with REST guide](https://spring.io/guides/gs/accessing-data-rest/): "Rest Repositories, Spring Data JPA, and H2 Database".
     
# Spring Boot Config Changes
For source and application changes, consult the [commit history]().

  1. Set `spring.jpa.open-in-view=false`. Violates 1, "no warning". Setting true by default is surprising, violating 2. See this [stack overflow answer](application.properties/spring.jpa.open-in-view=false). Basically Spring Boot enables by default the holding of database connections throughout the session, giving the view layer an opportunity to hydrate data on demand. This approach has issues that range from violation of principle (separation of concerns), to measurable performance. The upside is that your view layer can "dig into" an object graph. I've chosen to turn it off given how SB 


