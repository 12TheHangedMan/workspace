package MusicPromotion;

public class MusicPromoteCore {
    private int rhythmScore = 0;
    private int lyricScore = 0;
    private int melodyScore = 0;
    private int singerScore = 0;
    private int lyricistScore = 0;
    private long playTimes = 0;
    private long lovedTimes = 0;
    private long musicID;

    private static final int minScore = -100;
    private static final int maxScore = 100;

    private int totalScore = 0;
    private int promotePriority = 0;

    private String musicName = null;
    private String Album = null;

    void MusicPromoteCore(int rhythmScore, int lyricScore, int melodyScore){
    }

    void MusicPromotedCore(){
    }

    public long getMusicID() {
        return musicID;
    }

    public void setMusicID(long musicID) {
        this.musicID = musicID;
    }

    public long getLovedTimes() {
        return lovedTimes;
    }

    public void setLovedTimes(long lovedTimes) {
        this.lovedTimes = lovedTimes;
    }

    public long getPlayTimes() {
        return playTimes;
    }

    public void setPlayTimes(long playTimes) {
        this.playTimes = playTimes;
    }

    public int getLyricistScore() {
        return lyricistScore;
    }

    public void setLyricistScore(int lyricistScore) {
        this.lyricistScore = lyricistScore;
    }

    public int getSingerScore() {
        return singerScore;
    }

    public void setSingerScore(int singerScore) {
        this.singerScore = singerScore;
    }

    public int getMelodyScore() {
        return melodyScore;
    }

    public void setMelodyScore(int melodyScore) {
        this.melodyScore = melodyScore;
    }

    public int getLyricScore() {
        return lyricScore;
    }

    public void setLyricScore(int lyricScore) {
        this.lyricScore = lyricScore;
    }

    public int getRhythmScore() {
        return rhythmScore;
    }

    public void setRhythmScore(int rhythmScore) {
        this.rhythmScore = rhythmScore;
    }

    private void cc(){}

    private static void tryMe(){
    }
}

class MusicPromoteMain{
    public static void main(String[] args){

    }
}
