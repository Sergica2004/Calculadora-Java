FROM jenkins/jenkins:lts

USER root

# Instalar Java 17 y Maven
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk maven git && \
    apt-get clean

USER jenkins

# Instalar plugins esenciales para pipeline
RUN jenkins-plugin-cli --plugins \
    workflow-aggregator \
    git \
    configuration-as-code
