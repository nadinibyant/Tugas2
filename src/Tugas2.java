import java.util.LinkedList;

public class Tugas2 {
    public static void main(String[] args) {
        LinkedList<Character> nama = new LinkedList<Character>();
        nama.add('n');
        nama.add('a');
        nama.add('d');
        nama.add('i');
        nama.add('n');
        nama.add('i');
        nama.add(' ');
        nama.add('a');
        nama.add('n');
        nama.add('n');
        nama.add('i');
        nama.add('s');
        nama.add('a');
        nama.add(' ');
        nama.add('b');
        nama.add('y');
        nama.add('a');
        nama.add('n');
        nama.add('t');
        // data linkedlist
        System.out.println("data nama linked list : " + nama);

        // add karakter lain
        nama.addFirst('M');
        nama.add(1, 's');
        nama.add(2, ' ');
        nama.addLast('i');
        System.out.println("data setelah add karakter lain : " + nama);

        // sisip karakter lain
        nama.set(18, 'r');
        nama.set(19, 'y');
        nama.set(20, 'a');
        nama.set(21, 'n');
        nama.set(22, 't');
        System.out.println("data setelah set : " + nama);

        // hapus beberapa karakter yang ingin anda hapus
        for (int i = 10; i < nama.size(); i++) {
            nama.remove(i);
        }
        nama.removeFirst();
        nama.removeFirst();
        System.out.println("data setelah di remove : " + nama);
        
        // push (tambah di awal)
        nama.push('s');
        nama.push('M');
        System.out.println("data setelah push : " + nama);

        // pop (hapus di awal)
        nama.pop();
        nama.pop();
        nama.pop();
        System.out.println("data setelah pop : " + nama);

    }
}
