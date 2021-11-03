public class UIP extends UP{

    static String text, emoticon, hashtag, file;
    static int date, time, like, size, megapixels;
    public UIP(String text, String emoticon, String hashtag, int date, int time, int like, int size, int megapixels, String file){
        super(text, emoticon, hashtag, date, time, like);
        this.text = text;
        this.emoticon = emoticon;
        this.date = date;
        this.time = time;
        this.like = like;
        this.hashtag = hashtag;
        this.size = size;
        this.megapixels = megapixels;
        this.file = file;
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