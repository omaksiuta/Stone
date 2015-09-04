package fileScanner;

import java.util.Date;

/**
 * Created by igor on 04.09.2015.
 */
public class FileScannerImpl implements FileScanner {

    @Override
    public void deleteOldVideo() {
        System.out.println(new Date() + ": old Videos DELETED");
    }

    @Override
    public void deleteOldPhoto() {
        System.out.println(new Date() + ": old Photos DELETED");
    }
}
