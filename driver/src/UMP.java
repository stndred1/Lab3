public class UMP extends UP{

        static String text, emoticon, hashtag;
        static int date, time, like, bitDepth, size;
        static float sampleRate;
        public UMP(String text, String emoticon, String hashtag, int date, int time, int like, float sampleRate, int bitDepth, int size){
            super(text, emoticon, hashtag, date, time, like);
            this.text = text;
            this.emoticon = emoticon;
            this.date = date;
            this.time = time;
            this.like = like;
            this.hashtag = hashtag;
            this.bitDepth = bitDepth;
            this.sampleRate = sampleRate;
            this.size = size;
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
    
