package java8_casestudy;

public class FileUploader implements Runnable{
	private String fileName;
	
	public FileUploader(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public void run() {
		System.out.println("Uploading "+ fileName+"....");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e){
			System.out.println(fileName + "upload success");
		}
	}
	
}