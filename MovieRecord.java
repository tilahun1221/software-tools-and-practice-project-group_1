

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MovieRecord {
    public List<MovieRecord> movies;
    public Scanner scanner;
    private String title;
    private String director;
    private int year;

    public MovieRecord() {
      this.movies = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    
    // first setter method
    public void setTitle( String movieTitle ) {
       this.title = movieTitle; 
    }
    
    // first getter method
    public String getTitle() {
       return title;
    }
    // first setter method
    public void setDirector( String movieDirector) {
       this.title = movieDirector; 
    }
    
    // first getter method
    public String getDirector() {
       return title;
    }
    // first setter method
    public void setYear( String publishYear ) {
       this.title = publishYear; 
    }
    
    // first getter method
    public int getYear() {
       return year;
    }
    
    public static void main(String[] args) {
        MovieRecord app = new MovieRecord();
        app.run();
        MovieRecord movie = new MovieRecord();
    }

    public void run() {
        boolean exit = false;

        while (!exit) {
            System.out.println("Movie Record CRUD Application");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                	boolean result = createMovie();
                    break;
                case 2:
                    readMovie();
                    break;
                case 3:
                    updateMovie();
                    break;
                case 4:
                    deleteMovie();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }

    public boolean createMovie() {
        System.out.print("Enter the movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter the movie director: ");
        String director = scanner.nextLine();
        System.out.print("Enter the movie year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
       // MovieRecord movie = new MovieRecord();
        MovieRecord movie = new MovieRecord();
        if(movies.add(movie)) {
        System.out.println("Movie created successfully.");
        
        }
        return true;
    }

    public String readMovie() {
        System.out.print("Enter the movie title: ");
        String title = scanner.nextLine();
try {
        for (MovieRecord movie : movies) {
            if (movie.getTitle().equals(title))
                System.out.println(movie);
            System.out.println("Movie details:");
               // return;
        }
            
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
      return title;
    }

    public void updateMovie() {
        System.out.print("Enter the movie title: ");
        String title = scanner.nextLine();
try {
        for (MovieRecord movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                System.out.print("Enter the updated director: ");
                String director = scanner.nextLine();
                System.out.print("Enter the updated year: ");
                String year = scanner.nextLine();
                scanner.nextLine(); // Consume the newline character

                movie.setDirector(director);
                movie.setYear(year);
                System.out.println("Movie updated successfully.");
                return;
            }
        }
}catch(Exception e) {
        	System.out.println(e.getMessage());
        }
        }


    public String deleteMovie() {
        System.out.print("Enter the movie title: ");
        String title = scanner.nextLine();
try {
        for (MovieRecord movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                movies.remove(movie);
                System.out.println("Movie deleted successfully.");
               
            }
        }
}catch(Exception e) {
	System.out.println(e.getMessage());
}
        return title;
    }
    @Override
    public String toString() {
        return "Student{" +
                "Movie Director='" + director + '\'' +
                " Movie Title='" + title + '\'' +
                ", Published Year='" + year + '\'' +      
                "}";
    }
}

