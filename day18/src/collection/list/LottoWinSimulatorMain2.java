package collection.list;

import java.util.List;

public class LottoWinSimulatorMain2 {
	
	public static void main(String[] args) {
		LottoWinSimulatorGoodCase2 ls = new LottoWinSimulatorGoodCase2();
		
		List<Integer> powerWinNumbers = ls.getPowerNumbers();
		List<Integer> powerGetNumbers = ls.getPowerNumbers();
		
		ls.tryWinLoop(powerWinNumbers, powerGetNumbers);
		System.out.println(ls.getCount() + "번째 당첨");
		
		}
		
	}


