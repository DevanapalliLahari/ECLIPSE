package com.Xworkz.Basic;

public class TrainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train train=new Train();
		train.express=true;
		train.travel();
		Train train1=new Train();
		train1.express=false;
		train1.travel();

	}

}
