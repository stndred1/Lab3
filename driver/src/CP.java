public class CP implements Post{
    static String text, emoticon, hashtag;
    static int date, time, like;
    public CP(String text, String emoticon, String hashtag, int date, int time, int like){
        this.text = text;
        this.emoticon = emoticon;
        this.date = date;
        this.time = time;
        this.like = like;
        this.hashtag = hashtag;
    }
    @Override
    public void like(){
        like = like ++;
    }
    @Override
    public void comment(){
        System.out.println("Que deseas comentar?\n");
    }
    public void emoticon(){
        System.out.println("1. Cara feliz\n");
        System.out.println("2. Cara triste\n");
        System.out.println("3. Cara enojada\n");
        System.out.println("4. Cara cool\n");
    }
}