package ntu.danhtm2534;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStream {

	public static void main(String[] args) {
		// Tạo danh sách số lớn
		List<Integer> bigList = IntStream.rangeClosed(1, 1000000)
										 .boxed()
										 .collect(java.util.stream.Collectors.toList());
		long startTime, endTime;
		
		//Xử lý tuần tự
		startTime = System.currentTimeMillis();
		long sequentialSum = bigList.stream()
									.mapToLong(Integer::longValue)
									.sum();
		endTime = System.currentTimeMillis();
		System.out.println("Tuần tự: " + sequentialSum + " - Thời gian: " + (endTime -startTime) + "ms");
		
		//Xử lý song song
		startTime = System.currentTimeMillis();
		long parallelSum = bigList.parallelStream()
								 .mapToLong(Integer::longValue)
								 .sum();
		endTime = System.currentTimeMillis();
		System.out.println("Song song: " + parallelSum + " - Thời gian: " + (endTime - startTime) + "ms");
	}

}
