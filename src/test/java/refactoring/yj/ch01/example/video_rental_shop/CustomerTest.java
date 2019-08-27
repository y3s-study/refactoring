package refactoring.yj.ch01.example.video_rental_shop;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CustomerTest {
    @Test
    public void createCustomer() {
        createNewTestCustomer();
    }

    @Test
    public void testCustomerName() {
        Customer sut = createNewTestCustomer();
        assertThat(sut.getName()).isEqualTo("jun");
    }

    @Test
    public void whenCustomerHasAnyRental() {
        // given
        Customer sut = createNewTestCustomer();

        // when
        String statement = sut.statement();

        // then
        assertThat(statement).isEqualTo("jun 고객님의 대여 기록 \n"
                + "누적 대여료 : 0.0\n"
                + "적립 포인트 : 0");
    }

    @Test
    public void rentalOneRegularMovieOneDay() {
        // given
        Customer sut = createNewTestCustomer();
        sut.addRental(new Rental(aRegularMovie(), 1));

        // when
        String statement = sut.statement();

        // then
        System.out.println(statement);
        assertThat(statement).isEqualTo("jun 고객님의 대여 기록 \n"
                + "\ttestMovie\t2.0\n"
                + "누적 대여료 : 2.0\n"
                + "적립 포인트 : 1");
    }

    @Test
    public void rentalOneNewReleaseMovieOneDay() {
        // given
        Customer sut = createNewTestCustomer();
        sut.addRental(new Rental(aNewReleaseMovie(), 1));

        // when
        String statement = sut.statement();

        // then
        System.out.println(statement);
        assertThat(statement).isEqualTo("jun 고객님의 대여 기록 \n"
                + "\ttestMovie\t3.0\n"
                + "누적 대여료 : 3.0\n"
                + "적립 포인트 : 1");
    }

    @Test
    public void rentalOneChildrenMovieOneDay() {
        // given
        Customer sut = createNewTestCustomer();
        sut.addRental(new Rental(aChildrenMovie(), 1));

        // when
        String statement = sut.statement();

        // then
        System.out.println(statement);
        assertThat(statement).isEqualTo("jun 고객님의 대여 기록 \n"
                + "\ttestMovie\t1.5\n"
                + "누적 대여료 : 1.5\n"
                + "적립 포인트 : 1");
    }

    @Test
    public void rentalOneRegularMovieOverTwoDays() {
        // given
        Customer sut = createNewTestCustomer();
        sut.addRental(new Rental(aRegularMovie(), 3));

        // when
        String statement = sut.statement();

        // then
        System.out.println(statement);
        assertThat(statement).isEqualTo("jun 고객님의 대여 기록 \n"
                + "\ttestMovie\t3.5\n"
                + "누적 대여료 : 3.5\n"
                + "적립 포인트 : 1");
    }

    private static Movie aRegularMovie() {
        return new Movie("testMovie", Movie.REGULAR);
    }

    private static Movie aNewReleaseMovie() {
        return new Movie("testMovie", Movie.NEW_RELEASE);
    }

    private static Movie aChildrenMovie() {
        return new Movie("testMovie", Movie.CHILDREN);
    }

    private static Customer createNewTestCustomer() {
        return new Customer("jun");
    }
}