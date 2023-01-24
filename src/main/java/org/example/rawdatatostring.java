//package org.example;
//import org.pcap4j.core.NotOpenException;
//import org.pcap4j.core.PcapHandle;
//import org.pcap4j.core.PcapNativeException;
//import org.pcap4j.core.Pcaps;
//import org.pcap4j.packet.EthernetPacket;
//import org.pcap4j.packet.Packet;
//import org.pcap4j.packet.namednumber.ProtocolFamily;
//
//import java.nio.charset.StandardCharsets;
//
//public class Main {
//// pcap file - ийн raw data буюу message body - г шүүлтүүргүйгээр хэвлэнэ
//    public static void main(String[] args) throws Exception {
//        PcapHandle handle = Pcaps.openOffline("src/data.pcap");
//
//        try {
//            while (true) {
//                Packet packet = handle.getNextPacket();
//                if (packet == null) {
//                    break;
//                }
//                byte[] rawData = packet.getRawData();
//                String stringData = new String(rawData, StandardCharsets.UTF_8);
//                System.out.println(stringData);
//            }
//        } finally {
//            handle.close();
//        }
//    }
//}
