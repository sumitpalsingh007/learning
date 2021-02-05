package threadsPractice;

class Common{

	int i = 1;
	public synchronized void printEven(){
		//System.out.println(Thread.currentThread().getName());
		try{
			for(int i1 = 2;i1<=10000;){ 

				if(getI()== 0 ){ 
					System.out.println(i1+Thread.currentThread().getName()+"fir");
					setI(1);
					notify();
				}else{
					wait();
					i1=i1-2;
				}
				i1 = i1+2;
			}

		}catch(Exception e ){


		}

	}
	public synchronized void printOdd(){
		//System.out.println(Thread.currentThread().getName());
		try{
			for(int i1 = 1;i1<=10000;){
				if(getI()== 1 ){ 
					System.out.println(i1+Thread.currentThread().getName()+"sec");
					//System.out.println(getI());
					setI(0);
					notify();
				}else{
					wait();
					i1=i1-2;
				}

				i1 = i1+2;
			}
		}catch(Exception e ){

		}


	}
	private synchronized void setI(int i){
		this.i= i;
	}
	private int getI(){
		return this.i;
	}

}