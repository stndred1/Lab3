public abstract class UP implements Post{
    static String text, emoticon, hashtag;
    static int date, time, like;
    public UP(String text, String emoticon, String hashtag, int date, int time, int like){
        this.text = text;
        this.emoticon = emoticon;
        this.date = date;
        this.time = time;
        this.like = like;
        this.hashtag = hashtag;
    }
    public void like(){
        like = like ++;
    }
    public void comment(){
        System.out.println("Que deseas comentar?\n");
    }
}
