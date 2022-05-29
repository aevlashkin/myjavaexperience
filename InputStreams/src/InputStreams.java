//28.05.2022
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreams {
    public static InputStreamReader iSReader = null;
    public static BufferedReader buffReader = null;
    public static boolean exit = false;

    public static void main(String[] args) throws IOException {
        try {
            iSReader = new InputStreamReader(System.in);
            buffReader = new BufferedReader(iSReader);

        } catch (Exception e) {
            e.printStackTrace();
        }

        int variant = 0;

        System.out.println("How to read a stream?\n1 by bytes\n2 by characters\n3 by row\nChoose an option:");
        try {
            variant = Integer.parseInt(buffReader.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        if (variant >= 1 && variant <= 3)
            switch (variant) {
                case 1:
                    readByBytes();
                    break;
                case 2:
                    readByChar();
                    break;
                case 3:
                    readByLine();
            }
    }

    public static void readByBytes() throws IOException {
        System.out.println("Print :q to exit the program");

        int i = 0;
        while(true) {
            i++;

            int byteIn = System.in.read();

            if (exit && (char)byteIn == 'q') break;
            exit = ((char)byteIn == ':');

            System.out.println("Byte "+i+":" + byteIn);
        }
    }


    public static void readByChar() throws IOException {
        System.out.println("Print :q to exit the program");
        int i = 0;
        while(true) {
            i++;

            int symbolIn = iSReader.read();
            char symbol = (char) symbolIn;

            if (exit && symbol == 'q') break;
            exit = (symbol == ':');

            System.out.println("UNICODE "+i+": " + symbolIn);
            System.out.println("Symbol "+i+": " + symbol);
        }
    }

    public static void readByLine() {
        System.out.println("Print :q to exit the program");

        int i = 0;
        while(true) {
            i++;
            String string = "";
            try {
                string = buffReader.readLine();

                if(string.contains(":q")) break;

                System.out.println("String "+i+":"+string);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

