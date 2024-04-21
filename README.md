# Cloud File System Client
This is the client application created using JAVA to show how cloud file system works using TCP/IP & Websocket.

# System Pre-requisites
1. JAVA/JDK

# Steps to run this application
1. Inside project folder, create a folder names "bin" to store all the compiled codes.
2. Inside project folder, create a folder named "dist" to store the jar files
3. Use command below to compile the source code for client.

    `javac -d bin -sourcepath src src/client/Main.java`
4. Use command below to create jar file for client application.
   `jar -cvfm dist/MyApplicationClient.jar MANIFEST.MF -C bin/ .
   ` 
    
5. Use following code to run client jar file.
    `java -jar dist/MyApplicationClient.jar`