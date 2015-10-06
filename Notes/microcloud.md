Running Your Server on the Microcloud
=====================================


#Remote login

First, make sure you are comfortable with logging in to our CS systems using command line tools. 

1. The [tutoring center website] (http://tutoringcenter.cs.usfca.edu/resources/logging-in-remotely.html) has instructions for logging in remotely.
2. Once you log in to `stargate` you will be able to access any of the machines inside of the CS firewall.
3. To log in to a microcloud node, simply ssh in the node, for example `ssh srollins@mc01.cs.usfca.edu`.
4. The microcloud nodes mount your `/home/username` CS directory.


#Jaring your code

You will next need to get your executable code to your home directory. One approach is to use `git` to clone your repository to your CS home directory, then compile your code there. Another approach is to package your code into a jar file.

You may package your code from the command line. I will provide instructions for packaging your code into an executable jar file through Eclipse.

1. Right-click on the project and select `Export`.
2. Choose `Java > Runnable JAR file` and select `Next`.
3. Select `Package required libraries into generated JAR`.
4. Under `Launch configuration:`, select the class containing the main method that will run your server.
5. Select an appropriate `Export destination:` and click `Finish`.

#Using scp

Transfer your files to your home directory. One approach is to use scp. See [transferring files] (http://tutoringcenter.cs.usfca.edu/resources/transferring-files.html) for more detail.

Here is an example of how I would use scp from the command line to copy `example.jar` from my local system to my home directory and save it in a file named `example.jar` in a directory named `/cs601`:

`scp example.jar srollins@stargate.cs.usfca.edu:cs601/example.jar`

#Running remotely

Run your code using `java -jar <filename>`.
