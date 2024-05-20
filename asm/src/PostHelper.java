import java.util.ArrayList;
import java.util.Scanner;

public class PostHelper {
    ArrayList<Post> p = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addPost() {
        System.out.println("Enter posts");
        System.out.println("Enter post Code: ");
        Integer id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter post title: ");
        String title = sc.nextLine();
        System.out.println("Enter post describe: ");
        String describe = sc.nextLine();
        System.out.println("Enter post Avatar: ");
        String img = sc.nextLine();
        System.out.println("Enter post Maincontent: ");
        String content = sc.nextLine();
        System.out.println("Enter post name: ");
        String author = sc.nextLine();
        System.out.println("Enter post date: ");
        String date = sc.nextLine();
        Post post = new Post(id, title, describe, img, content, author, date);

        p.add(post);
        System.out.println("Post added");
    }

    public void printPosts() {
        for(int i = 0 ; i < p.size() ; i++){
        Post c = p.get(i);
        System.out.printf("%-10s || %-10s || %-10s || %-10s || %-10s || %-10s || %-10s\n", c.getCode(), c.getTitle(), c.getDescribe(), c.getAvatar(), c.getMaincontent(), c.getName(), c.getDate());
       }
    }
}
