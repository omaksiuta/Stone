package fileScanner;

import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by igor on 04.09.2015.
 */
@Service
public class FileScannerImpl implements FileScanner {

    @Override
    @Scheduled(cron = "0 0 12 * * ?")
    public void deleteOldVideo() {
        System.out.println(new Date() + ": old Videos DELETED");
    }

    @Override
    @Scheduled(cron = "0 0 12 * * ?")
    public void deleteOldPhoto() {
        System.out.println(new Date() + ": old Photos DELETED");
    }
}
