# KumuluzEE REST microservice archetype
> Creates default project for rest microservice in KumuluzEE.

## Usage

Run command:
```bash
mvn archetype:generate "-DarchetypeGroupId=com.mjamsek.archetype" "-DarchetypeArtifactId=kumuluzee-ms-rest-archetype" "-DarchetypeVersion=x.x.x" "-DgroupId=com.sample" "-DartifactId=sample-project" "-Dversion=1.0.0-SNAPSHOT"
```

Command will generate directory (name equals artifactId) with project content.

## Generated project

### Deploying library

Library is deployed with `mvn deploy -P !default,deploy-lib` command. During deploy profile 'deploy-lib' must be active, otherwise no artifacts are deployed to Nexus.
