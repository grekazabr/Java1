import java.io.File;
import java.util.Scanner;
public class Helloworld {
	public static void main(String[] args){
		Scanner in = new Scanner(System. in);
		File myFolder;
		File[] files;
		String path="";
		boolean iff = false;
		int menu = 0, os = 0, lengthoffiles = 0, numoffiles = 0;
		for(;menu!=1;){
			iff = false;
			path = "";
			menu = 0;
			os = 0;
			lengthoffiles = 0;
			numoffiles = 0;
			System.out.println("1-exit, 2-continue");
			menu = in.nextInt();
			switch(menu){
				case 1:{
					System.exit(0);
				}
				case 2:{
					System.out.println("Write a way to your folder");
					in.nextLine();
					path = path + in.nextLine();
					myFolder = new File(path);
					files = myFolder.listFiles();
					lengthoffiles = files.length;
					iff = false;
					do{
						iff = true;
						System.out.println("Enter a number of files that you want to print");
						numoffiles = in.nextInt();
						if(numoffiles<0){
							iff = false;
							System.out.println("You have entered number under 0, please try one more time");
						}
						if(numoffiles>lengthoffiles){
							iff = false;
							System.out.println("This number is bigger than a quantity of files, try again");
							System.out.println("The number of files there is - "+lengthoffiles);
						}
						if(lengthoffiles==0){
							iff = false;
							System.out.println("the directory is empty");
						}
					}
					while(iff == false);
					if(numoffiles<=lengthoffiles){
						for(int i = 0; i < numoffiles; i++){
							System.out.println(files[i]);
						}
					}
					break;
				}
				default:{
					System.out.println("incorrect case, try again");
					break;
				}
			}
		}
	}
}