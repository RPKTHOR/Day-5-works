package java8_casestudy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileUploadService {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // 3 concurrent uploads

        String[] files = {"file1.txt", "file2.jpg", "file3.pdf", "file4.png", "file5.docx"};

        for (String file : files) {
            FileUploader task = new FileUploader(file);
            executor.submit(task);
        }

        executor.shutdown(); // Gracefully shut down after all tasks are submitted
    }
}
