package com.rainway.sachiel;

import com.rainway.sachiel.messages.File;
import com.rainway.sachiel.messages.Folder;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtobufIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;

import java.io.ByteArrayOutputStream;

public class DynamicMessageMain {

    private final Schema<Folder> SCHEMA = RuntimeSchema.getSchema(Folder.class);

    private long timingInitial;
    private long timeDiff;

    private DynamicMessageMain() {
        try {

            for(int i=0; i<10; i++) {

                Folder folder = new Folder();
                folder.setName("folder_name_test " + i);

                File[] folderFiles = {new File("/home/pablo/test" + i, (long) (Math.random() * 10000)), new File("/home/pablo/test" + i, (long) (Math.random() * 10000))};
                folder.setFiles(folderFiles);

                //serialize
                byte[] serializedData = serialize(folder);

                //deserialize
                deserialize(serializedData);

            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void timingInit() {
        timingInitial = System.nanoTime();
    }

    private void timingFinish() {
        long timingFinal = System.nanoTime();
        timeDiff = timingFinal - timingInitial;
    }

    private byte[] serialize(Folder foo) throws java.io.IOException {
        timingInit();

        ByteArrayOutputStream temp = new ByteArrayOutputStream();

        LinkedBuffer BUFFER = LinkedBuffer.allocate();
        ProtobufIOUtil.writeTo(temp, foo, SCHEMA, BUFFER);
        byte[] data = temp.toByteArray();
        temp.close();

        timingFinish();
        System.out.println("Serialized in " + timeDiff + "ns (" + (float)timeDiff/1000000f + "ms)");

        return data;
    }

    private Folder deserialize(byte[] bytes) {
        timingInit();
        Folder tmp = SCHEMA.newMessage();
        ProtobufIOUtil.mergeFrom(bytes, tmp, SCHEMA);
        timingFinish();

        System.out.println("Deserialized in " + timeDiff + "ns (" + (float)timeDiff/1000000f + "ms)");
        System.out.println("");

        return tmp;
    }

    public static void main(String [] args) {
        new DynamicMessageMain();
    }
}