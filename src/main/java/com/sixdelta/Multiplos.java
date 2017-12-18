package com.sixdelta;

class Multiplos{

	int calculateFor(int n) throws RuntimeException {
		int suma = 0;

		if(n <= 0){
			throw new RuntimeException();
		}

		for(int i = 0; i<n; i++){
			if(i % 3 == 0){
				suma += i;
			}

			else if(i % 5 == 0){
				suma += i;
			}
		}
	return suma;
	}
}