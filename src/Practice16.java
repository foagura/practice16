public class Practice16 {
    public static void main(String[] args){
        /* 拡張for文 */
        char[] array = {'a', 'b', 'c', 'd', 'e'};

        for (char str : array) {
            System.out.print(str + " ");
        }

        /*
        char a;
        for (a : array) {    // 拡張for文外で宣言した変数を利用しようとしているのでコンパイルエラーが出る
            // 処理文;
        }

        /*
        for (String b : array) {
            // 処理文;    // 変数宣言した変数のデータ型と配列の要素のデータ型が異なるためコンパイルエラーができる
        }
        */
    }
}
