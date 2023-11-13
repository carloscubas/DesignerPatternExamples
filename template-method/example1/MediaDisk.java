package example1;

public abstract class MediaDisk {

    // readBytes(), modulateBytes() are algorithms to be implemented by inheriting class
    public abstract void readBytes(); // NOTE : abstract
    public abstract void modulateBytes();

    // play() is an structurally non-modifiable skeleton 
    public final void play(){ // NOTE : final
        readBytes();
        modulateBytes();
        output();
    }

    public void output(){
        System.out.println("Convert Bytes to Sound");
    }

}