package org.example;

import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.Pcaps;
import org.pcap4j.packet.Packet;

public class Main {

    public static void main(String[] args) throws Exception {
        PcapHandle handle = Pcaps.openOffline("src/data.pcap");

        try {
            while (true) {
                Packet packet = handle.getNextPacket();
                if (packet == null) {
                    break;
                }
                byte[] rawData = packet.getRawData();
                String payload = new String(rawData);
                String[] lines = payload.split("\\r?\\n");
                for (String line : lines) {
                    if (line.contains("From:") ||line.contains("To:") ){
                        System.out.println(line);
                    }
                }
            }
        } finally {
            handle.close();
        }
    }
}
