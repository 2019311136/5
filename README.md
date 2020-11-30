# 5
实验5
实验目的
掌握字符串String及其方法的使用
掌握文件的读取/写入方法
掌握异常处理结构
实验要求
设计学生类（可利用之前的）；
采用交互式方式实例化某学生；
设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。
实验过程
先创建一个Student类，构造学生的姓名，年龄，班别，学号 
创建类FileUitls再创建文本文件A和文本文件B并编写异常类
创建类PoetryUtils,编写处理文本代码 
最后编写Main类，对程序进行调试
核心方法
        String poetry = "";
        int count = 0;
        for (int i = 1; i <= str.length(); i++) {
            if (i%7 == 0){
                count++;
                if (count%2 == 0)
                    poetry += str.substring(i-7,i)+"。\n";
                else
                    poetry += str.substring(i-7,i)+"，";}}
                    public boolean saveStuMsg(Student student){
        File file = null;
        boolean f = true;
        try {
            file = new File("A.txt");
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
            PrintWriter pw = new PrintWriter(osw);
            pw.println(student.getMessage());
            pw.flush();
            pw.close();
            osw.close();
            fos.close();}
实验结果
请输入学生学号：
136
请输入学生姓名：
s
请输入学生年龄：
18
请输入学生班别：
191
存储学生信息成功！
存储古诗信息成功！
实验感想
通过本次实验我对于字符串String及方法的了解更加深入，懂得了文件的读取和写入方法，最重要是了解了异常处理结果。通过一次次的实验让我对JAV语言的了解不断深入，相信再加上以后的学习，一定可以让我对JAVA语言精益求精。
