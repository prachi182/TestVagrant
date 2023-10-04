import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial capacity for the store : ");
        int initialCapacity = scanner.nextInt();

        RecentSong recentSong = new RecentSong(initialCapacity);

        boolean exit = false;

        while (!exit) {
            System.out.println("Select an option for Spotify Song:");
            System.out.println("1. Add your favourite song into the playlist");
            System.out.println("2. Fetch recent playlist of Spotify Music");
            System.out.println("3. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter user name: ");
                    String user = scanner.next();
                    System.out.print("Enter song name: ");
                    String song = scanner.next();
                    recentSong.recentlyPlayedSong(user, song);
                    break;
                case 2:
                    System.out.print("Enter user name: ");
                    user = scanner.next();
                    List<String> recentPlaylist = recentSong.getRecentlyPlayedSongs(user);
                    System.out.println("Recent playlist for " + user + ": " + recentPlaylist);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}