#include <stdio.h>
#include <iostream>

class A {
    public:
        A(){
            std::cout<< "This is the constructor of A\n";
        }

    private:
        int a,b;
    public: 
        void assigningValue (int valueA,int valueB){
            a= valueA;
            b= valueB;

            std::cout<<"\n\nAssigned value to private member from child class using inheritance\n\n";
        }
};

class B : public A{
    public: 
        B(){
            std::cout<<"This is the constructor of B which has parent class A\n";
        }
};

class C : public A{
    public: 
        C(){
            std::cout<<"This is the constructor of C which has parent class A\n";
        }
};

class D : public B{
    public: 
        D(){
            std::cout<<"This is the constructor of D which has parent class B\n";
        };
};

class E : public B{
    public: 
        E(){
            std::cout<<"This is the constructor of E which has parent class B\n";
        }
};

class F : public C{
    public: 
        F(){
            std::cout<<"This is the constructor of F which has parent class C\n";
        }
};

class G : public C{
    public: 
        G(){
            std::cout<<"This is the constructor of G which has parent class C\n";
        }
};

class H : public D, public E{
    public: 
        H(){
            std::cout<<"This is the constructor of H which has two parent  class D and E\n";
        }
};

class I : public F, public G{
    public: 
        I(){
            std::cout<<"This is the constructor of I which has two parent class F and G \n";
        }
};

class J : public H, public I{
    public: 
        J(){
            std::cout<<"This is the constructor of J which has two parent class H and I \n";
        }
};



int main(){

    J j; //Calling last child of inheritance
    std::cout<<"\nTotal size of inheritance is "<< sizeof(J)<<"\n";
    //j.assigningValue(100,200);
    return 0;
}