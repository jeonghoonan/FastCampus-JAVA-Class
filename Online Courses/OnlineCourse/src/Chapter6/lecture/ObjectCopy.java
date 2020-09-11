//package Chapter6.lecture;
//
//public class ObjectCopy {
//    public static void main(String[] args) {
//
//        Book[] library = new Book[5];
//        Book[] copyLibrary = new Book[5];
//
//        library[0] = new Book("책1", "저자1");
//        library[1] = new Book("책2", "저자2");
//        library[2] = new Book("책3", "저자3");
//        library[3] = new Book("책4", "저자4");
//        library[4] = new Book("책5", "저자5");
//
//        System.arraycopy(library, 0, copyLibrary, 0, 5);
//
////        for (Book book : copyLibrary) {
////            book.showBookInfo();
////        }
//
//        library[0].setTitle("나무");
//        library[0].setAuthor("박완서");
//
//        for (Book book : library) {
//            book.showBookInfo();
//        }
//
//        System.out.println("-----------------");
//
//        for (Book book : copyLibrary) {
//            book.showBookInfo();
//        }
//    }
//}
