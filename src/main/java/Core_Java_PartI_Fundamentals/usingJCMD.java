package Core_Java_PartI_Fundamentals;

public class usingJCMD {
    public static void main(String...args){
        while(true);
        //Using above code, we create a JVM instance that runs indefinitely,
        //once the lvmid is identified using `jcmd` command we can run command on the running process.
        //to find useful command to run with jcmd on running process use
        // jcmd <lvmid> help
        //To get help regarding a jcmd command, use the following syntax
        // jcmd <lvmid> help <command>
        //Testing JFR, with command
        //jcmd <lvmid> JFR.start name=demoA delay=2s duration=30s filename=usingJCMD_report.jfr

        // Generating heap dump file and analysing it using jhat
        // to generate a heap dump file using jmap
        // jmap -dump:file=<fileName> <lvmid>
    }
}
