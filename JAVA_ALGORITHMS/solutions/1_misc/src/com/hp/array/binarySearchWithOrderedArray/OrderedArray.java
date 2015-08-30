package com.hp.array.binarySearchWithOrderedArray;

public class OrderedArray {
	
	long[] array;
	int nElement = 0;
	
	public OrderedArray(int maxSize){		
		this.array = new long[maxSize];		
	}
	
	public void insert(long value){
		int i;
		int j;
		
		for(i = 0; i < this.nElement; i++){
			if(this.array[i] > value){
				break;
			}				
		}
				
		for(j = nElement; j > i; j--){
			this.array[j] = this.array[j - 1];
		}
		
		this.array[j] = value;
		this.nElement++;		
	}
	
	public boolean binarySearch(long value){		
		int lowerBound = 0;
		int upperBound = nElement - 1;
		int currentIndex;

        while(true){
            currentIndex = (upperBound + lowerBound) / 2;

            if(this.array[currentIndex] == value){
                return true;
            }else if(lowerBound > upperBound){
                return false;
            }else{

                if(this.array[currentIndex] < value){
                    lowerBound = currentIndex + 1;
                }else{
                    upperBound = currentIndex - 1;
                }
            }

        }	
	}
	
	public void delete(long value){
		
		for(int i=0; i < this.array.length; i++){
			if(this.array[i] == value){
				System.out.println("Found the value: " + value);
				nElement--;
				for(int j=i; j < nElement; j++ ){
					this.array[j] = this.array[j + 1];					
				}
				
				this.display();
				break;
			}
		}
					
	}
	
	public void display(){
		for(int i = 0; i < nElement; i++){
			System.out.println(this.array[i]);
		}
	}
	
}
