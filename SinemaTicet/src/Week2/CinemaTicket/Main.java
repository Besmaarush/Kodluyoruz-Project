package Week2.CinemaTicket;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Movie> movieList = new ArrayList<Movie>();  // Movie türünden liste oluşturularak filmler ekleniyor.

        movieList.add(new Movie(1, "The Butterfly Effect ", "Science Fiction", 20.00));
        movieList.add(new Movie(2, "Titanic", "Drama", 23.00));
        movieList.add(new Movie(3, "Saw", "Horror", 20.00));
        movieList.add(new Movie(4, "Halloween", "Horror", 25.00));
        movieList.add(new Movie(5, "The Ring", "Horror", 27.00));

        DataInput data = new DataInput();  // Müşteri girişi yapılabilmesi için DataInput sınıfından nesne oluşturularak getData() fonksiyonu çağrılıyor.
        data.getData(movieList);
    }


}
