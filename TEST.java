
	import java.io.*;

	public class TEST{
		public static void main(String[] arg){

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try{
			while(true){
				String line = br.readLine();
				if("42".equals(line)){
					break;
				}else{
					System.out.println(line);
				}
			}
		}catch(Exception e){
			System.out.println("Line cannot be read"+e);
		}
		}
	}