package com.example.mpec.di;

// Class thực hiện 1 nhiệm vụ mà sử dụng các thuật toán sắp xếp
public class VeryComplexService {

    /**
     * Cách code level 1
     */
/*
    private BubbleSort bubbleSort = new BubbleSort();

    public VeryComplexService(){

    }

    public void complexService(int array[]) {
        bubbleSort.sort(array);// sắp xếp được array
        // xử lý logic ở dưới
    }

    // ở cách code level 1 thì class VeryComplexService đã hoàn thành được nhiệm vụ
    // tuy nhiên khi có yeu cầu thay đổi thuật toán sắp xếp thì chúng ta phải thay đổi 2 class
    // Ngoài ra thì hàm bubbleSort chỉ tồn tại khi mà VeryComplexService tồn tại
    // => Mối quan hệ của 2 class là rất chặt chẽ, không thể tách rời nhau (Tight-coupling)
*/
    /**
     *  Cách code level 2
     */

    //Khai báo cách 1
//    private final SortService sortService = new BubbleSort();
//      private final SortService sortService = new MySort();

    //Khai báo cách 3
//    public final SortService sortService;
//
//    public VeryComplexService() {
//        sortService = new MySort();
//    }
    //Khai báo  cách 2
    private final SortService sortService;

    public VeryComplexService(BubbleSort bubbleSort) {
        this.sortService = bubbleSort;
    }

    public void complexService(int array[]){
        sortService.sort(array);
    }
}
