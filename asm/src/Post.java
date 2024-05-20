public class Post {
    private int code;
    private String title;
    private String describe;
    private String avatar;
    private String maincontent;
    private String name;
    private String date;

    public Post(int code, String title, String describe, String avatar, String maincontent, String name, String date) {
        this.code = code;
        this.title = title;
        this.describe = describe;
        this.avatar = avatar;
        this.maincontent = maincontent;
        this.name = name;
        this.date = date;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMaincontent() {
        return maincontent;
    }

    public void setMaincontent(String maincontent) {
        this.maincontent = maincontent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Post{" +
                "code=" + code +
                ", title='" + title + '\'' +
                ", describe='" + describe + '\'' +
                ", avatar='" + avatar + '\'' +
                ", maincontent='" + maincontent + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}

