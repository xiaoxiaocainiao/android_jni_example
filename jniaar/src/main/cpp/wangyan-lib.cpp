//
// Created by 王雁 on 2019-06-04.
//

#include <string>
#include <jni.h>
using  namespace std;

extern "C"
//jstring是Java原生接口规定的数据类型，它是指向java字符串的指针


//编写java层中native定义的函数，对应的c++层函数：
//先定义返回值
//c++对应的函数名是 Java 函数名和函数名所在文件的路径
JNIEXPORT jstring JNICALL Java_im_wangyan_jniaar_HelloJniInterface_getContentFromJNI(JNIEnv* env, jobject){

    //编写函数内的返回值的c++代码：
    string content="我是王雁,去你的吧. 我来自aar!";
    return  env->NewStringUTF(content.c_str());
};