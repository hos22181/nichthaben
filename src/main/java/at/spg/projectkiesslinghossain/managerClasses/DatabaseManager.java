package at.spg.projectkiesslinghossain.managerClasses;

import at.spg.projectkiesslinghossain.allClasses.Listing;
import at.spg.projectkiesslinghossain.allClasses.User;

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
