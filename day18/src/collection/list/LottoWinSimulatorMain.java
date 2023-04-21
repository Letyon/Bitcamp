package collection.list;

import java.util.List;

public class LottoWinSimulatorMain {
	
	public static void main(String[] args) {
		LottoWinSimulatorGoodCase ls = new LottoWinSimulatorGoodCase();
		
		List<Integer> lottoWinNumbers = ls.getLottoNumbers();
		List<Integer> lottoGetNumbers = ls.getLottoNumbers();
		
		ls.tryWinLoop(lottoWinNumbers, lottoGetNumbers);
		System.out.println(ls.getCount() + "번째 당첨");
		
		}
		
	}


