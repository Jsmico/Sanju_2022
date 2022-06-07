FROM openjdk:11
ADD target/PensionerDetails.jar PensionerDetails.jar
#EXPOSE 2222
RUN ["mvn", "install", "-Dmaven.test.skip=true"]
ENTRYPOINT ["java", "-jar", "PensionerDetails.jar"]