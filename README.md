This project demonstrates a small issue with generation of POJOs that require bean validation.

Running `EndPointControllerTest` fails with
```
org.opentest4j.AssertionFailedError:
Expected :postEndpoint.body.flag: must not be null
Actual   :postEndpoint.body: Cannot validate com.example.api.model.EndpointBody. No bean introspection present. Please add @Introspected to the class and ensure Micronaut annotation processing is enabled
```

Adding the `@Introspected` annotation to the generated `EndpointBody` class will make the test pass.

With the hibernate validator added as dependency, the test will pass either way.

