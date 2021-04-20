package java4.baba.phone;

public  class SmartPhone extends Phone implements Music,Video,PhotoGraph,Internet {
    @Override
    public void internet() {
        System.out.println("可以上网");
    }

    @Override
    public void playMusic() {
        System.out.println("音乐");
    }

    @Override
    void text() {
        System.out.println("发短信");
    }

    @Override
    void call() {
        System.out.println("打电话");
    }

    @Override
    public void photoGraph() {
        System.out.println("拍照");
    }

    @Override
    public void playVideo() {
        System.out.println("播放视频");
    }
}
