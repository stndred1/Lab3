public class UVP extends UP{

    static String text, emoticon, hashtag;
    static int date, time, like, size, frameRate;
    public UVP(String text, String emoticon, String hashtag, int date, int time, int like, int size, int frameRate){
        super(text, emoticon, hashtag, date, time, like);
        this.text = text;
        this.emoticon = emoticon;
        this.date = date;
        this.time = time;
        this.like = like;
        this.hashtag = hashtag;
        this.size = size;
        this.frameRate = frameRate;
    }
    @Override
    public void like(){
        like = like ++;
    }
    @Override
    public void comment(){
        System.out.println("Que deseas comentar?\n");
    }
}