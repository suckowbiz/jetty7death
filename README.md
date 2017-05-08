# What is it?
This project was created to provoke OutOfMemory error in Jetty 7 (Java 8).

# How do I use it?
(Assuming Docker is installed properly)

Run: 

1. `./mvn-clean-install-sh`
2. Deploy `target/jetty7death.war` to your Jetty 7.

For local test:
2. `./run-jetty.sh`
3. `./deploy-war.sh`
4. `./fire-request.sh`