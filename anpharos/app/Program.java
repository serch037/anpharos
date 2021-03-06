package anpharos.app;

import anpharos.sphero.Instruction;
import anpharos.sphero.Sphero;

import java.util.*;
import java.io.*;

import anpharos.structures.Queue;

public class Program implements Serializable{

	private Queue<Instruction> instructionQueue;
	private LinkedList<Sphero> spheroList;

	public Program(){
		instructionQueue = new Queue<Instruction>();
		spheroList = new LinkedList<Sphero>();
		spheroList.add(new Sphero(50, 50, ""));
	}

	public Queue<Instruction> getInstructionQueue(){
		return instructionQueue;
	}

	public LinkedList<Sphero> getSpheroList(){
		return spheroList;
	}

	public void setInstructionQueue(Queue<Instruction> instructions){
		instructionQueue = instructions;
	}

}
