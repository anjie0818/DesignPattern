package org.example.a_principle.dependceInversion.improve;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public class DependecyPass {
    public static void main(String[] args) {

        //方法一：通过接口传递实现依赖
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(new XiaoMi());
        //方法二：通过构造方法传递依赖
        OpenAndClose2 openAndClose2 = new OpenAndClose2(new XiaoMi2());
        openAndClose2.open();
        //方法三：通过setter方法传递依赖
        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTv(new XiaoMi3());
        openAndClose3.open();
    }
}
//方法一：通过接口传递实现依赖
interface IOpenAndClose{
    void open(ITv tv);
}

class OpenAndClose implements IOpenAndClose {

    public void open(ITv tv) {
        tv.play();
    }
}

interface ITv{
    void play();
}
class XiaoMi implements ITv{

    public void play() {
        System.out.println("小米电视播放ing");
    }

}

//方法二：通过构造方法传递依赖
interface IOpenAndClose2{
    void open();
}
class OpenAndClose2 implements IOpenAndClose2{

    ITv2 iTv2;

    public OpenAndClose2(ITv2 iTv2){
        this.iTv2 = iTv2;
    }
    public void open() {
        iTv2.play();
    }
}
interface ITv2{
    void play();
}
class XiaoMi2 implements ITv2{
    public void play() {
        System.out.println("小米电视播放ing");
    }
}

//方法三：通过setter方法传递依赖
interface IOpenAndClose3{
    void open();
    void setTv(ITv3 iTv3);
}
class OpenAndClose3 implements IOpenAndClose3{

    ITv3 iTv3;

    public void open() {
        iTv3.play();
    }

    public void setTv(ITv3 iTv3) {
        this.iTv3 = iTv3;
    }
}
interface ITv3{
    void play();
}
class XiaoMi3 implements ITv3{

    public void play() {
        System.out.println("小米电视播放ing");
    }
}