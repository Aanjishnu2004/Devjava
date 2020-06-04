import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server implements Runnable {

    static ArrayList<Socket> a = new ArrayList<Socket>();
    static ServerSocket ss;

    public void process() {
        try 
        {
            while(true)
            {
                for (int i = 0; i < a.size() ; i++) 
                {
                    InputStream in = a.get(i).getInputStream();
                    BufferedReader b = new BufferedReader(new InputStreamReader(in));
                    String s = b.readLine();
                    for(int j = 0 ; j<a.size() ; i++)
                    {
                        if(j == i) continue;
                        OutputStream os = a.get(j).getOutputStream();
                        PrintWriter pw = new PrintWriter(os);
                        pw.println(s);
                    }
                }
            }

        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        while(true)
        {
            try
            {
                a.add(ss.accept());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[])
    {
        try {

            Server.ss = new ServerSocket(9999);
            Server s = new Server();
            Thread t = new Thread(s);
            t.start();
            s.process();
            ss.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
