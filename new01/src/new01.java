// string builder


public class new01 {
    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        // 构建对象

        sb.append(121);
        sb.append("CAOAN");
        sb.append(1.9);
        System.out.println(sb);
        // 追加单体

        sb.append(new char[]{'a', 'b', 'c', 'd'});
        sb.append(new char[]{'a', 'b', 'c', 'd'},1,3);
        System.out.println(sb);
        // 追加组

        sb.insert(16,"JAVA");
        System.out.println(sb);
        //插入

        sb.delete(1,3);
        System.out.println(sb);
        // 删除

        sb.replace(0,6,"gl");
        System.out.println(sb);
        // 代替

        sb.reverse();
        System.out.println(sb);
        // 反转

        String str = sb.toString();
        System.out.println(str);
        // 转换成string




    }


}
