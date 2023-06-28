package com.kh.day03.array.run;

import com.kh.day03.array.execise.Exercise_AfterSchool;
import com.kh.day03.array.execise.Exercise_Array1;
import com.kh.day03.array.execise.Exercise_For;
import com.kh.day03.array.execise.Exercise_While;

public class Run {
	public static void main(String [] args)
	{
		// Exercise_Array1 cannot be resolved to a type
		// import하지 않아서 실행이 안되는것
		Exercise_Array1 exArr = new Exercise_Array1();
//		exArr.exercise1();
//		exArr.exercise2();
//		exArr.arryCopyExercise();
		
		
		Exercise_For exFor = new Exercise_For();
//		exFor.ForExercise1();
//		exFor.ForExercise2();
//		exFor.ForDoubleExercise1();
//		exFor.ForDoubleExercise2();
//		exFor.ForDoulerExercise3();
		
		Exercise_While exWhile = new Exercise_While();
//		exWhile.Exercise_While1();
//		exWhile.Exercise_While2();
		
		Exercise_AfterSchool exAS = new Exercise_AfterSchool();
//		exAS.exercise1();
//		exAS.exercise2();
//		exAS.exercise3();
//		exAS.exercise4();
//		exAS.exercise5();
//		exAS.exercise6();
//		exAS.lottoExercise();
		exAS.RPSgame();
		
		
	}
}
