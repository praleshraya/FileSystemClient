javac -d bin -sourcepath src src/client/Main.java

jar -cvfm dist/MyApplicationClient.jar MANIFEST.MF -C bin/ .

