package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 5, 3, 12, 6, 7, 5, 3);

        System.out.println("1. Duyệt numbers");
            numbers.forEach(System.out::println);
        System.out.println("2. Tìm các giá trị chẵn trong list");
            numbers.stream().filter(n -> n %2 == 0).forEach(System.out::println);
        System.out.println("3. Tìm các giá trị > 5 trong list");
            numbers.stream().filter(n -> n > 5).forEach(System.out::println);
        System.out.println("4. Tìm giá trị max trong list");
            numbers.stream().max(Integer::compareTo).ifPresent(System.out::println);
        System.out.println("5. Tìm giá trị min trong list");
            numbers.stream().min(Integer::compareTo).ifPresent(System.out::println);
        System.out.println("6. Tính tổng các phần tử của mảng");
            System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
        System.out.println("7. Lấy danh sách các phần tử không trùng nhau");
            numbers.stream().distinct().forEach(System.out::println);
        System.out.println("8. Lấy 5 phần tử đầu tiên trong mảng");
            numbers.stream().limit(5).forEach(System.out::println);
       System.out.println("9. Lấy phần tử từ thứ 3 -> thứ 5");
            numbers.stream().skip(2).limit(3).forEach(System.out::println);
       System.out.println("10. Lấy phần tử đầu tiên > 5");
            numbers.stream().filter(n -> n > 5).findFirst().ifPresent(System.out::println);
       System.out.println("11. Kiểm tra xem list có phải là list chẵn hay không");
           boolean check = numbers.stream().allMatch(n -> n % 2 == 0);
           if (check) {
               System.out.println("là danh sách chẵn");
           } else {
               System.out.println("không phải là danh sách chẵn");
           }
       System.out.println("12. Kiểm tra xem list có phần tử > 10 hay không");
            boolean c = numbers.stream().anyMatch(n -> n > 10);
        if (c) {
            System.out.println("danh sách có phần tử lớn hơn 10");
        } else {
            System.out.println("danh sách không có phần tử lớn hơn 10");
        }
       System.out.println("13. Có bao nhiêu phần tử > 5");
            int size = Math.toIntExact(numbers.stream().filter(n -> n > 5).count());
            System.out.println(size);
       System.out.println("14. Nhân đôi các phần tủ trong list và trả về list mới");
            numbers.stream().map(n -> n * 2).forEach(System.out::println);
       System.out.println("15. Kiểm tra xem list không chứa giá trị nào = 8 hay không");
        boolean b = numbers.stream().noneMatch(n -> n == 8);
        if (b) {
            System.out.println("danh sách không có phần = 8");
        } else {
            System.out.println("danh sách có phần tử = 8");
        }
    }
}