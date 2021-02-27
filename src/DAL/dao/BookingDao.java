package DAL.dao;

import BLL.domain.Booking;

public interface BookingDao extends CrudDao<Integer, Booking> {

    Booking findByBookingReference(String bookingReference);
}
