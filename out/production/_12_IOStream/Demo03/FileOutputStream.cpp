/*
 * 对地址进行数字运算的结果是加了整数倍的该数据类型的地址
 */
#include <iostream>
using namespace std;

int main(void)
{
    char a;
    cout << "a占用的内存大小是:" << sizeof(a) << endl;
    cout << "a的地址是:" << (void *)&a << endl;
    cout << "a的地址+1是:" << (void *)(&a + 1) << endl;
    cout << endl;
    short b;
    cout << "b占用的内存大小是:" << sizeof(b) << endl;
    cout << "b的地址是:" << &b << endl;
    cout << "b的地址+1是:" << &b + 1 << endl;
    cout << endl;
    int c;
    cout << "c占用的内存大小是:" << sizeof(c) << endl;
    cout << "c的地址是:" << &c << endl;
    cout << "c的地址+1是:" << &c + 1 << endl;
    cout << endl;
    double d;
    cout << "d占用的内存大小是:" << sizeof(d) << endl;
    cout << "d的地址是:" << &d << endl;
    cout << "d的地址+1是:" << &d + 1 << endl;
    cout << endl;

    return 0;
}
