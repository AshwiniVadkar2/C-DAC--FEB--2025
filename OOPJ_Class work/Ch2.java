class Ch2{
	public static void main(String[] args){
		int a[]={1,2,3,4,5};
		try{
			System.out.println(a[10]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("index of a is exeding the array index size");
			
		}
	}
}