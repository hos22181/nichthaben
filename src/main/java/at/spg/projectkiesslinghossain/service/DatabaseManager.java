package at.spg.projectkiesslinghossain.service;

import at.spg.projectkiesslinghossain.domain.Listing;
import at.spg.projectkiesslinghossain.domain.User;

public class DatabaseManager {

    public boolean saveUser(User user){
        return false;
    }
    public boolean saveListing(Listing listing){
        return false;
    }

    public User loadUser(int UserId){
        return new User();
    }

    /*public Listing loadListing(int ListingId){
        return new PropertyListing();
    }*/

}
