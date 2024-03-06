# Springboot-Test
Just a testing app written in Spring Boot

## Running the application
Use Maven:

``mvn spring-boot:run -Dspring-boot.run.arguments=--logging.level.name.piol.mytest=DEBUG``

## Building multi-architecture image
In my environment I work on a M3 MacBook Pro... but the OpenShift cluster runs on x86 hardware. This said, I need multi-arch images. Easy...

**Create the Manifest-image**
``podman manifest create domenicopiol/springboot-test:v0.0.3``

**Build the 2 images in one go**
``podman build --platform linux/amd64,linux/arm64  --manifest domenicopiol/springboot-test:v0.0.3 .``

**Push the complete bundle to the registry**
``podman manifest push domenicopiol/springboot-test:v0.0.3``

The k8s manifest (deployment) is unchanged... picks up correctly the respective architecture.