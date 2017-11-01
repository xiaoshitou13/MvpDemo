package bean;

import java.util.List;

/**
 * Created by 白玉春 on 2017/11/1.
 */

public class Mydatas {

    /**
     * date : 20171101
     * stories : [{"images":["https://pic1.zhimg.com/v2-9eb0a79109a3d096ca1b08f456a07c14.jpg"],"type":0,"id":9654519,"ga_prefix":"110113","title":"一个《银翼杀手 2049》的神来之笔：「高司令」测试「高司令」"},{"images":["https://pic2.zhimg.com/v2-c5db91ad014803c2d30f5445272ddc71.jpg"],"type":0,"id":9654683,"ga_prefix":"110112","title":"大误 · 可以说经历了很多世事"},{"images":["https://pic3.zhimg.com/v2-85112f8fe50aac1a0d6ae90c8e148242.jpg"],"type":0,"id":9654819,"ga_prefix":"110111","title":"一个普通程序员，如何通过自学向人工智能靠拢？"},{"images":["https://pic3.zhimg.com/v2-f75a47e66db5a26d40343333bb5bfb7e.jpg"],"type":0,"id":9654488,"ga_prefix":"110110","title":"几个适合老人和孩子一起玩的游戏，带娃也能享受天伦之乐"},{"images":["https://pic4.zhimg.com/v2-7974529e1f826b92971aeb149cea76bb.jpg"],"type":0,"id":9654781,"ga_prefix":"110109","title":"充满想象和科幻感，但人会被替代，你期待未来的工厂吗？"},{"images":["https://pic4.zhimg.com/v2-f26e5c68dd3ce1fc8c0ab863a529dea7.jpg"],"type":0,"id":9654709,"ga_prefix":"110108","title":"学会这些做面包的「万能公式」，不再担心吃剩怎么办"},{"title":"这条探险级的新线路，比鳌太美 10 倍","ga_prefix":"110107","images":["https://pic3.zhimg.com/v2-c816a5cbcb48ac178e0cd9be3410e212.jpg"],"multipic":true,"type":0,"id":9654674},{"images":["https://pic4.zhimg.com/v2-f2c85f3f7c9fe7fb8894a58dcc41ad07.jpg"],"type":0,"id":9654373,"ga_prefix":"110107","title":"办公室流行起来的轻断食，真的能治病抗衰老吗？"},{"images":["https://pic4.zhimg.com/v2-11c84727926e550b22b0de3a43b12997.jpg"],"type":0,"id":9654643,"ga_prefix":"110107","title":"吃完饭又得了几张优惠券，心想：直接降价不是多好\u2026\u2026"},{"images":["https://pic1.zhimg.com/v2-ba9f092a864448c7c4038469321dcb60.jpg"],"type":0,"id":9654204,"ga_prefix":"110106","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic2.zhimg.com/v2-35c416ad7b2bb1514773a49860da8d01.jpg","type":0,"id":9654819,"ga_prefix":"110111","title":"一个普通程序员，如何通过自学向人工智能靠拢？"},{"image":"https://pic3.zhimg.com/v2-5dc236930b57b31c1e24f2f270fae31a.jpg","type":0,"id":9654373,"ga_prefix":"110107","title":"办公室流行起来的轻断食，真的能治病抗衰老吗？"},{"image":"https://pic4.zhimg.com/v2-360ea25dfd7e63452f8b269328b8652f.jpg","type":0,"id":9654781,"ga_prefix":"110109","title":"充满想象和科幻感，但人会被替代，你期待未来的工厂吗？"},{"image":"https://pic3.zhimg.com/v2-a9a92385fdadc549b3e7e3db52d80936.jpg","type":0,"id":9654760,"ga_prefix":"103119","title":"-章鱼：其实我们很有智慧\r\n-人类：我们有吃你的智慧"},{"image":"https://pic1.zhimg.com/v2-aae55ac7d2f6985ebb791eed1b6f5f4c.jpg","type":0,"id":9654695,"ga_prefix":"103118","title":"该怎么成为一名飞行员，看得我心潮澎湃，又不得不叹服"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * images : ["https://pic1.zhimg.com/v2-9eb0a79109a3d096ca1b08f456a07c14.jpg"]
         * type : 0
         * id : 9654519
         * ga_prefix : 110113
         * title : 一个《银翼杀手 2049》的神来之笔：「高司令」测试「高司令」
         * multipic : true
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private boolean multipic;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic2.zhimg.com/v2-35c416ad7b2bb1514773a49860da8d01.jpg
         * type : 0
         * id : 9654819
         * ga_prefix : 110111
         * title : 一个普通程序员，如何通过自学向人工智能靠拢？
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
