import java.util.*;
public class Menu {
    Scanner s = new Scanner(System.in);
    int n;
    static int date, time, like;
    static String text, hashtag, emoticon;
    public ArrayList<UP> dictionary = new ArrayList<UP>();
    public void menu(){
        System.out.println("Bienvenido a K ~~ Mano\n");
        System.out.println("1. Hacer un post de texto\n");
        System.out.println("2. Hacer un post de musica\n");
        System.out.println("3. Hacer un video post\n");
        System.out.println("4. Hacer un post de imagen\n");
        System.out.println("5. Ver posts x fecha\n");
        System.out.println("6. Ver posts x hashtag\n");
        System.out.println("7. Ver todos los posts\n");
        System.out.println("8. Salir de K ~~ Mano\n");
        n = s.nextInt();
        boolean inProgress = false;
        do{
        if (n == 1){
            System.out.println("Cual es la fecha?\n");
            date = s.nextInt();
            System.out.println("Que hora es?\n");
            time = s.nextInt();
            System.out.println("El texto del posT\n");
            text = s.next();
                if (text.length() >20){
                    System.out.println("Maximo de 20 caracteres\n");
                }
                else if( text.length() <= 20){
                    System.out.println("Hashtag para el post\n");
                    hashtag = s.nextLine();
                    System.out.println("Deseas un emoticon?\n");
                    System.out.println("1. Feliz\n");
                    System.out.println("2. Triste\n");
                    System.out.println("3. Enojado\n");
                    System.out.println("4. Cool\n");
                    int a = s.nextInt();
                    if (a == 1){
                        hashtag = Emoticon.happy();
                    }
                    if (a == 2){
                        hashtag = Emoticon.crySad();
                    }
                    if (a == 3){
                        hashtag = Emoticon.angry();
                    }
                    if (a == 4){
                        hashtag = Emoticon.glasses();
                    }
                    like = 0;
                    UTP p = new UTP(text, hashtag, emoticon, date, time, like);
                    dictionary.add(p);
                }
        }
        if (n == 2){
            System.out.println("Cual es la fecha?\n");
            date = s.nextInt();
            System.out.println("Que hora es?\n");
            time = s.nextInt();
            System.out.println("La website de la cancion\n");
            text = s.nextLine();
            System.out.println("Cual es el sample rate de la cancion?");
            float sampleRate = s.nextFloat();
            System.out.println("De que tamano es?\n");
            int size = s.nextInt();
            System.out.println("Que es el bit depth de la cancion?\n");
            int bitDepth = s.nextInt();
            System.out.println("Hashtag para el post\n");
            hashtag = s.nextLine();
            System.out.println("Deseas un emoticon?\n");
            System.out.println("1. : D\n");
            System.out.println("2. :*(\n");
            System.out.println("3. >:(\n");
            System.out.println("4. B)\n");
            int a = s.nextInt();
            if (a == 1){
                hashtag = Emoticon.happy();
            }
            if (a == 2){
                hashtag = Emoticon.crySad();
            }
            if (a == 3){
                hashtag = Emoticon.angry();
            }
            if (a == 4){
                hashtag = Emoticon.glasses();
            }
            like = 0;
            UMP M = new UMP(text, hashtag, emoticon, date, time, like, sampleRate, bitDepth, size);
            dictionary.add(M);
        }
        if (n == 3){
            System.out.println("Cual es la fecha?\n");
            date = s.nextInt();
            System.out.println("Que hora es?\n");
            time = s.nextInt();
            System.out.println("La website del video\n");
            text = s.nextLine();
            System.out.println("De que tamano es?\n");
            int size = s.nextInt();
            System.out.println("Cual es el frame rate del video?");
            int frameRate = s.nextInt();
            System.out.println("Hashtag para el post\n");
            hashtag = s.nextLine();
            System.out.println("Deseas un emoticon?\n");
            System.out.println("1. : D\n");
            System.out.println("2. :*(\n");
            System.out.println("3. >:(\n");
            System.out.println("4. B)\n");
            int a = s.nextInt();
            if (a == 1){
                hashtag = Emoticon.happy();
            }
            if (a == 2){
                hashtag = Emoticon.crySad();
            }
            if (a == 3){
                hashtag = Emoticon.angry();
            }
            if (a == 4){
                hashtag = Emoticon.glasses();
            }
            like = 0;
            UVP V = new UVP(text, hashtag, emoticon, date, time, like, size, frameRate);
            dictionary.add(V);
        }
        if (n == 4){
            System.out.println("Cual es la fecha?\n");
            date = s.nextInt();
            System.out.println("Que hora es?\n");
            time = s.nextInt();
            System.out.println("La website de la cancion\n");
            text = s.nextLine();
            System.out.println("Cuantos mega pixeles tiene?");
            int megapixels = s.nextInt();
            System.out.println("De que tamano es?\n");
            int size = s.nextInt();
            System.out.println("Que tipo de file es la imagen?");
            String file = s.nextLine();
            System.out.println("Hashtag para el post\n");
            hashtag = s.nextLine();
            System.out.println("Deseas un emoticon?\n");
            System.out.println("1. : D\n");
            System.out.println("2. :*(\n");
            System.out.println("3. >:(\n");
            System.out.println("4. B)\n");
            int a = s.nextInt();
            if (a == 1){
                hashtag = Emoticon.happy();
            }
            if (a == 2){
                hashtag = Emoticon.crySad();
            }
            if (a == 3){
                hashtag = Emoticon.angry();
            }
            if (a == 4){
                hashtag = Emoticon.glasses();
            }
            like = 0;
            UIP I = new UIP(text, hashtag, emoticon, date, time, like, size, megapixels, file);
            dictionary.add(I);
        }
        else if (n == 5){


        }
        else if (n == 6){
            int f = s.nextInt();
    
        }
        else if (n == 7){
            System.out.println(dictionary.toString());
        }
        else if (n == 8){
            System.out.println("Hasta la Vista Baby\n");
            inProgress = true;
        }
        }
    while ( !inProgress);
    }

}
