package Controller;

public final class SQLQueries {
	public static final String ADD_USER = "insert into user_info (name,email,mobile_no) values (?,?,?) ";
	public static final String ADD_ADMIN = "insert into admin_info (name,email,mobile_no) values (?,?,?) ";
	public static final String ADMIN_SIGNIN = "select id from admin_cred where username = ? and password = ?  ";
	public static final String USER_SIGNIN = "select id from user_cred where username = ? and password = ?  ";
	public static final String ADMIN_GET_ID = "select id  from admin_info where email = ? ";
	public static final String USER_GET_ID = "select id  from user_info where email = ? ";
	public static final String ADD_ADMIN_CRED = "insert into admin_cred (id,username,password) values (?,?,?) ";
	public static final String ADD_USER_CRED = "insert into user_cred (id,username,password) values (?,?,?) ";
	public static final String DELETE_ADMIN_INFO = "delete from admin_info where email = ? " ;
	public static final String DELETE_USER_INFO = "delete from user_info where email = ? " ;
	public static final String  UPDATE_ADMIN_NAME = "update admin_info set name = ? where name = ? ";
	public static final String  UPDATE_USER_NAME = "update user_info set name = ? where id = ? ";
	public static final String  UPDATE_ADMIN_EMAIL = "update admin_info set email = ? where id = ? ";
	public static final String  UPDATE_USER_EMAIL = "update user_info set email = ? where id = ? ";
	public static final String  UPDATE_ADMIN_MOBILE_NO = "update admin_info set mobile_no = ? where id = ? ";
	public static final String  UPDATE_ADMIN_USERNAME = "update admin_cred set username = ? where id = ? ";
	public static final String  UPDATE_USER_USERNAME = "update user_cred set username = ? where id = ? ";
	public static final String  UPDATE_ADMIN_PASSWORD = "update admin_cred set password = ? where id = ? ";
	public static final String  UPDATE_USER_PASSWORD = "update user_cred set password = ? where id = ? ";
	public static final String  UPDATE_USER_MOBILE_NO = "update user_info set mobile_no = ? where id = ? ";	
	public static final String DISPLAY_ADMIN_INFO = "Select * from admin_info";
	public static final String DISPLAY_USER_INFO = "Select * from user_info";
	public static final String DISPLAY_USER = "Select * from user_info where id = ? ";
	public static final String ADD_THRETRE = "insert into thretre (thretrename , location , ac , capacity) values (?,?,?,?) ";
	public static final String DISPLAY_THRETRE = "Select * from thretre";
	public static final String ADD_MOVIE = "insert into movie (moviename , language , duration) values (?,?,?) ";
	public static final String DISPLAY_MOVIE = "Select * from movie";
	public static final String GET_MOVIE_ID = "select movie_id from thretre where thretre.id = ? ";
	public static final String UPDATE_MOVIE_ID = "update thretre set movie_id = ? where id = ? ";
	public static final String CANCEL_TICKET = "delete from bookings where id = ? and booking_date = (SELECT CURRENT_DATE)";
//public static final String DISPLAY_THRETRE_WITH_MOVIE = "Select thretrename,location,capacity,movie.moviename from thretre join movie on movie.id = thretre.movie_id ";
	public static final String DELETE_MOVIE = "delete from movie where id = ? ";
	public static final String DELETE_THRETRE = "delete from thretre where id = ? ";
	public static final String ADD_SHOW_TIME = "insert into showtime (thretre_id , movie_id , session_id) values (?,?,?) ";
	public static final String DISPLAY_SHOWS = "select showtime.id,thretre.thretrename,movie.moviename,session.type from showtime join thretre on thretre.id = thretre_id join movie on movie.id = showtime.movie_id join session on session.id = session_id;";
	public static final String ADD_BOOKINGS = "insert into bookings (customer_id , thretre_id , movie_id , session_id , no_of_tickets) values (?,?,?,?,?) ";
	public static final String GET_THRETRE_CAPACITY = "Select capacity from thretre where id = ? ";
	public static final String GET_BOOKING_SEATS = "select sum(no_of_tickets) from bookings where session_id = ? and booking_date = (SELECT CURRENT_DATE) and thretre_id = ?  group by session_id,booking_date order by session_id ";
	public static final String DISPLAY_BOOKINGS = "select bookings.id ,user_info.name , thretre.thretrename,movie.moviename,session.type,bookings.no_of_tickets,bookings.booking_date from bookings join user_info on user_info.id = bookings.customer_id join thretre on thretre.id = bookings.thretre_id join movie on movie.id = bookings.movie_id join session on session.id = bookings.session_id where customer_id = ? order by  bookings.id";
	
	public static final String DISPLAY_TODAYS_BOOKINGS = "select bookings.id ,user_info.name , thretre.thretrename,movie.moviename,session.type,bookings.no_of_tickets,bookings.booking_date from bookings join user_info on user_info.id = bookings.customer_id join thretre on thretre.id = bookings.thretre_id join movie on movie.id = bookings.movie_id join session on session.id = bookings.session_id where customer_id = ? and bookings.booking_date = (SELECT CURRENT_DATE) order by  bookings.id";
	public static final String DISPLAY_THRETRE_WITH_MOVIE = "Select thretre.id,thretrename,location,capacity,movie.moviename from thretre join movie on movie.id = thretre.movie_id where location = ?  ";
	
}
