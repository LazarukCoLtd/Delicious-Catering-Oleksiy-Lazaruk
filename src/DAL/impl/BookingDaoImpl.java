package DAL.impl;

import BLL.domain.Booking;
import DAL.dao.BookingDao;

public class BookingDaoImpl extends CrudDaoImpl<Integer, Booking> implements BookingDao {

    @Override
    public Booking findByBookingReference(String bookingReference) {
        return null;
    }
}
