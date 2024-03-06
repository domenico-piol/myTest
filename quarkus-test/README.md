# quarkus-test

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
mvn quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Creating a native executable

You can create a native executable using: 
```shell script
mvn package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
mvn package -Dnative -Dquarkus.native.container-build=true
```

## Building multi-architecture image
In my environment I work on a M3 MacBook Pro... but the OpenShift cluster runs on x86 hardware. This said, I need multi-arch images. Easy...

**Create the Manifest-image**
``podman manifest create domenicopiol/quarkus-test:v0.0.1``

**Build the 2 images in one go**
``podman build --platform linux/amd64,linux/arm64  --manifest domenicopiol/quarkus-test:v0.0.1 .``

**Push the complete bundle to the registry**
``podman manifest push domenicopiol/quarkus-test:v0.0.1``

The k8s manifest (deployment) is unchanged... picks up correctly the respective architecture.